module mx.jemb.u2_ti_05_formfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.jemb.u2_ti_05_formfx to javafx.fxml;
    exports mx.jemb.u2_ti_05_formfx;
}