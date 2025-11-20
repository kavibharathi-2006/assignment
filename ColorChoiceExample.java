import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class ColorChoiceExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Red", "Green", "Blue", "Black", "Orange");
        Label lbl = new Label("Select a color");

        choiceBox.setOnAction(e -> {
            String selected = choiceBox.getValue();
            lbl.setText("Selected color: " + selected);
            // Optionally change text colour:
            switch (selected) {
                case "Red": lbl.setTextFill(Color.RED); break;
                case "Green": lbl.setTextFill(Color.GREEN); break;
                case "Blue": lbl.setTextFill(Color.BLUE); break;
                case "Black": lbl.setTextFill(Color.BLACK); break;
                case "Orange": lbl.setTextFill(Color.ORANGE); break;
                default: lbl.setTextFill(Color.BLACK); break;
            }
        });

        VBox root = new VBox(10, choiceBox, lbl);
        root.setStyle("-fx-padding: 20;");
        Scene scene = new Scene(root, 300, 150);
        primaryStage.setTitle("Color ChoiceBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
