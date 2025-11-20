import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentFormExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Controls
        Label lblName = new Label("Name:");
        TextField tfName = new TextField();

        Label lblId = new Label("Student ID:");
        TextField tfId = new TextField();

        Label lblGender = new Label("Gender:");
        RadioButton rbMale = new RadioButton("Male");
        RadioButton rbFemale = new RadioButton("Female");
        ToggleGroup tgGender = new ToggleGroup();
        rbMale.setToggleGroup(tgGender);
        rbFemale.setToggleGroup(tgGender);

        Label lblDept = new Label("Department:");
        ComboBox<String> cbDept = new ComboBox<>();
        cbDept.getItems().addAll("IT", "CSE", "ECE", "EEE", "Mechanical");

        Button btnSubmit = new Button("Submit");
        TextArea taOutput = new TextArea();
        taOutput.setEditable(false);
        taOutput.setPrefHeight(150);

        // Layout for form
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.add(lblName, 0, 0);
        grid.add(tfName, 1, 0);
        grid.add(lblId, 0, 1);
        grid.add(tfId, 1, 1);
        grid.add(lblGender, 0, 2);
        grid.add(rbMale, 1, 2);
        grid.add(rbFemale, 2, 2);
        grid.add(lblDept, 0, 3);
        grid.add(cbDept, 1, 3);

        VBox root = new VBox(10, grid, btnSubmit, taOutput);
        root.setPadding(new Insets(10));

        btnSubmit.setOnAction(e -> {
            String name = tfName.getText().trim();
            String id = tfId.getText().trim();
            RadioButton selectedGender = (RadioButton) tgGender.getSelectedToggle();
            String gender = selectedGender == null ? "Not specified" : selectedGender.getText();
            String dept = cbDept.getValue() == null ? "Not selected" : cbDept.getValue();

            String output = "Student Information:\n" +
                            "Name: " + name + "\n" +
                            "Student ID: " + id + "\n" +
                            "Gender: " + gender + "\n" +
                            "Department: " + dept + "\n";
            taOutput.setText(output);
        });

        Scene scene = new Scene(root, 400, 350);
        primaryStage.setTitle("Student Information Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
