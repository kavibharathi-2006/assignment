import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        String javaVer = System.getProperty("java.version");
        String javafxVer = System.getProperty("javafx.version");
        if (javafxVer == null) {
            javafxVer = "Unknown";  // fallback
        }
        Label lbl = new Label("Hello, JavaFX!\nJava version: " + javaVer + "\nJavaFX version: " + javafxVer);
        StackPane root = new StackPane(lbl);
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
