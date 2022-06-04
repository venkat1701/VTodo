package io.github.venkat1701.vtodo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(FXMLManager.getFXMLResource("welcome.fxml").load(), 320, 240);
        stage.setTitle("VTodo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
