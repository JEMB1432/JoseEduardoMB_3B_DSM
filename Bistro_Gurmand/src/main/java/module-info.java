module jemb.bistro_gurmand {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens jemb.bistro_gurmand to javafx.fxml;
    exports jemb.bistro_gurmand;
    exports jemb.bistro_gurmand.views;
    opens jemb.bistro_gurmand.views to javafx.fxml;
    exports jemb.bistro_gurmand.views.Admin;
    opens jemb.bistro_gurmand.views.Admin to javafx.fxml;
}