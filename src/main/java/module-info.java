module io.github.venkat1701.vtodo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens io.github.venkat1701.vtodo to javafx.fxml;
    exports io.github.venkat1701.vtodo;

    opens io.github.venkat1701.vtodo.controller to javafx.fxml;
    exports io.github.venkat1701.vtodo.controller to javafx.fxml;

    opens io.github.venkat1701.vtodo.entity to javafx.fxml;
    exports io.github.venkat1701.vtodo.entity to javafx.fxml;

}