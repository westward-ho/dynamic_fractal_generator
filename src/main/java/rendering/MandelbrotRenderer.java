package rendering;

import utils.ComplexNumber;
import utils.ColourMapper;
import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class MandelbrotRenderer {
    private final int width;
    private final int height;
    private final int maxIterations;
    private final ColourMapper colourMapper;


    public MandelbrotRenderer(int width, int height, int maxIterations, ColourMapper colourMapper) {
        this.width = width;
        this.height = height;
        this.maxIterations = maxIterations;
        this.colourMapper = colourMapper;
    }

    public void render(PixelWriter pixelWriter, double minX, double maxX, double minY, double maxY) {
        ForkJoinPool pool = new ForkJoinPool();
        
        // Use parallel streams to render rows of pixels in parallel
        pool.submit(() -> IntStream.range(0, height).parallel().forEach(py -> {
            for (int px = 0; px < width; px++) {
                double real = minX + (px / (double) width) * (maxX - minX);
                double imaginary = minY + (py / (double) height) * (maxY - minY);
                ComplexNumber c = new ComplexNumber(real, imaginary);

                int iterations = mandelbrot(c);

                // Map iterations to a color
                Color colour = colourMapper.map(iterations);

                // Set the color on the pixel writer (synchronized to avoid race conditions)
                synchronized (pixelWriter) {
                    pixelWriter.setColor(px, py, colour);
                }
            }
        })).join(); // Wait for all tasks to complete
    }

    private int mandelbrot(ComplexNumber c) {
        ComplexNumber z = new ComplexNumber(0,0);
        int iteration = 0;

        while (z.magnitude() <= 2 && iteration < maxIterations) {
            z = z.multiply(z).add(c);
            iteration++;
        }

        return iteration;
    }
}