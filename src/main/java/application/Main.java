package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import rendering.FractalManager;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Dynamic Fractal Generator");

        Canvas canvas = new Canvas(800, 800);
        FractalManager fractalManager = new FractalManager(canvas);

        fractalManager.drawFractal();

        StackPane root = new StackPane();
        root.getChildren().add(canvas);

        primaryStage.setScene(new Scene(root, 800, 800));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}