import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.*;

public class TextEditorExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // MenuBar
        MenuBar menuBar = new MenuBar();

        Menu menuFile = new Menu("File");
        MenuItem itemNew = new MenuItem("New");
        MenuItem itemOpen = new MenuItem("Open");
        MenuItem itemSave = new MenuItem("Save");
        MenuItem itemExit = new MenuItem("Exit");
        menuFile.getItems().addAll(itemNew, itemOpen, itemSave, new SeparatorMenuItem(), itemExit);

        Menu menuEdit = new Menu("Edit");
        // You can add Edit menu items (Cut, Copy, Paste) if you like
        MenuItem itemCut = new MenuItem("Cut");
        MenuItem itemCopy = new MenuItem("Copy");
        MenuItem itemPaste = new MenuItem("Paste");
        menuEdit.getItems().addAll(itemCut, itemCopy, itemPaste);

        Menu menuHelp = new Menu("Help");
        MenuItem itemAbout = new MenuItem("About");
        menuHelp.getItems().add(itemAbout);

        menuBar.getMenus().addAll(menuFile, menuEdit, menuHelp);

        // TextArea for editor
        TextArea textArea = new TextArea();

        // Handlers
        itemExit.setOnAction(e -> {
            Platform.exit();
        });

        itemNew.setOnAction(e -> {
            textArea.clear();
        });

        itemOpen.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(primaryStage);
            if (file != null) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        sb.append(line).append("\n");
                    }
                    textArea.setText(sb.toString());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        itemSave.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showSaveDialog(primaryStage);
            if (file != null) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    writer.write(textArea.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        itemAbout.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("About");
            alert.setHeaderText("Simple Text Editor");
            alert.setContentText("Built with JavaFX");
            alert.showAndWait();
        });

        // Layout
        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setCenter(textArea);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("JavaFX Text Editor");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
