package utils;

import javafx.scene.paint.Color;

public class ColourMapper {
    private final Color startColour;
    private final Color endColour;
    private final int maxIterations;

    public ColourMapper(Color startColour, Color endColour, int maxIterations) {
        this.startColour = startColour;
        this.endColour = endColour;
        this.maxIterations = maxIterations;
    }


    public Color map(int iteration) {
        if (iteration >= maxIterations) {
            return endColour;
        }

        double ratio = (double) iteration / maxIterations;

        double red = startColour.getRed() + ratio * (endColour.getRed() - startColour.getRed());
        double green = startColour.getGreen() + ratio * (endColour.getGreen() - startColour.getGreen());
        double blue = startColour.getBlue() + ratio * (endColour.getBlue() - startColour.getBlue());

        return new Color(clamp(red), clamp(green), clamp(blue), 1.0);
    }

    public double clamp(double value) {
        return Math.min(1.0, Math.max(0.0, value));
    }
}
