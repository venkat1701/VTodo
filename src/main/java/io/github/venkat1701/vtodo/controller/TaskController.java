package io.github.venkat1701.vtodo.controller;

import io.github.venkat1701.vtodo.entity.TaskEntity;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class TaskController {

    @FXML
    private Label label;

    @FXML
    private RadioButton radio;


    public void createTask(TaskEntity task){
        label.setText(task.getTask());
    }
}
