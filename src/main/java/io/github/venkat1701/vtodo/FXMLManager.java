package io.github.venkat1701.vtodo;
import javafx.fxml.FXMLLoader;

public class FXMLManager {


    public static FXMLLoader getFXMLResource(String path){
        FXMLLoader loader = new FXMLLoader(FXMLManager.class.getResource(path));
        return loader;
    }
}
