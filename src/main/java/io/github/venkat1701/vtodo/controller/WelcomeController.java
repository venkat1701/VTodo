package io.github.venkat1701.vtodo.controller;

import io.github.venkat1701.vtodo.FXMLManager;
import io.github.venkat1701.vtodo.entity.TaskEntity;
import io.github.venkat1701.vtodo.service.QuoteService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable {

    private static WelcomeController controller = new WelcomeController();

    private static QuoteService service;
    @Getter @Setter
    private static VBox list;

    private List<String> imagesList;
    @FXML
    private BorderPane pane;

    @FXML
    @Getter
    private VBox vbox;

    @FXML
    private Button suggest;

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
            list = this.vbox;
        }
    }

    @FXML
    public void suggestSongs(MouseEvent me){
        service.createQuotes();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//            var gson = new Gson();
//            var quoteDao = gson.fromJson(HttpSendRequest.sendRequest(), QuoteDao.class);
//
//            System.out.println(quoteDao.getContent());
        int size = service.getQuotes().size();
        String quote = service.getQuotes().get(size-1);
        alert.setTitle("Today's Motivation");
        String str = LocalDate.now().getDayOfWeek().toString();
        alert.setHeaderText(String.format("%s 's Motivation", str.charAt(0) + str.substring(1).toLowerCase()));
        alert.setContentText(quote);
        alert.showAndWait();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        service = new QuoteService();
    }



    public static void removeHBox(HBox hBox) {
        if(list != null)
            list.getChildren().remove(hBox);
    }
}
