package rendering;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.PixelWriter;
// import javafx.scene.paint.Color;
import utils.ColourMapper;

public class FractalManager {
    private final Canvas canvas;

    public FractalManager(Canvas canvas) {
        this.canvas = canvas;
    }

    public void drawFractal() {
        int width = (int) canvas.getWidth();
        int height = (int) canvas.getHeight();

        double minX = -2.5, maxX = 1.0, minY = -1.0, maxY = 1.0;
        int maxIterations = 5000;
        ColourMapper colourMapper = new ColourMapper(maxIterations);

        MandelbrotRenderer renderer = new MandelbrotRenderer(width, height, maxIterations, colourMapper);

        GraphicsContext gc = canvas.getGraphicsContext2D();
        PixelWriter pixelWriter = gc.getPixelWriter();
        renderer.render(pixelWriter, minX, maxX, minY, maxY);
    }
}
