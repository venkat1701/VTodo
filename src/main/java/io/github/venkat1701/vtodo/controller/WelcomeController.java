package io.github.venkat1701.vtodo.controller;

import io.github.venkat1701.vtodo.FXMLManager;
import io.github.venkat1701.vtodo.entity.TaskEntity;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class WelcomeController implements Initializable {

    private List<String> imagesList;
    @FXML
    private BorderPane pane;

    @FXML
    private VBox vbox;

    @FXML
    private HBox addtask;

    @FXML
    private TextField input;

    @FXML
    private VBox menubox;

    @FXML
    void generateAction(KeyEvent event) throws IOException {
        if(event.getCode() == KeyCode.ENTER && (input.getText().split("\\s").length >0 && input.getText().length()!=0)){
            String str = input.getText();
            var loader = FXMLManager.getFXMLResource("task.fxml");
            var entity = new TaskEntity();
            entity.setTask(str);
            HBox box = loader.load();
            TaskController controller = loader.getController();
            controller.createTask(entity);

            this.vbox.getChildren().add(box);
            input.setText("");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ExecutorService service = Executors.newScheduledThreadPool(2);

        imagesList = new ArrayList<>();
        imagesList.add("../images/back1.jpg");
        imagesList.add("../images/back2.png");

//        service.execute(() -> {
//           pane.setStyle(String.format("-fx-background-image: url(\"%s\");", imagesList.get(1)));
//            System.out.println(String.format("-fx-background-image: url(\"%s\")", imagesList.get(1)));
//        });
    }
}
