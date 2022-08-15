package io.github.venkat1701.vtodo.controller;

import io.github.venkat1701.vtodo.entity.TaskEntity;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;

public class TaskController {

    @FXML
    private HBox box;
    @FXML
    private Label label;

    @FXML
    private RadioButton radio;



    public void createTask(TaskEntity task){
        label.setText(task.getTask());
    }

    public void removeBox(ActionEvent ae){
        WelcomeController.removeHBox(box);
        return;
    }
}
