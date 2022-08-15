package io.github.venkat1701.vtodo.controller;

import io.github.venkat1701.vtodo.FXMLManager;
import io.github.venkat1701.vtodo.entity.TaskEntity;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
public class EntryPaneController {



    @Setter @Getter
    private String textValue;

    @FXML
    private HBox addtask;

    @FXML
    private TextField input;


    @FXML
    public void generateAction(KeyEvent event){

    }




}
