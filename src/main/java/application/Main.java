package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a simple label with text
        Label label = new Label("Hello, JavaFX!");

        // Add the label to the root StackPane
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Create the scene and add it to the stage
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("JavaFX Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}