module mx.jemb.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.jemb.demo to javafx.fxml;
    exports mx.jemb.demo;
}