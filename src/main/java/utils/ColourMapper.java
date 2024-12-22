package utils;

import javafx.scene.paint.Color;

public class ColourMapper {
    private final int maxIterations;

    public ColourMapper(int maxIterations) {
        this.maxIterations = maxIterations;
    }

    public Color map(int iteration) {
        if (iteration >= maxIterations) {
            return Color.BLACK; // Points inside the Mandelbrot set remain black
        }

        // Smooth color gradient for points outside the Mandelbrot set
        double hue = 240.0 - (240.0 * iteration / maxIterations); // Blue to light tones
        double saturation = 0.6; // Softer saturation
        double brightness = 0.7; // Lighter brightness for outside

        return Color.hsb(hue, saturation, brightness);
    }
}