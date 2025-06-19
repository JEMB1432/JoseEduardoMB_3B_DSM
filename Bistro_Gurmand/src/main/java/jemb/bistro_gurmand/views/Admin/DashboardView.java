package jemb.bistro_gurmand.views.Admin;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Region;

public class DashboardView {
    private BorderPane view;

    public DashboardView() {
        createDashboard();
    }

    private void createDashboard() {
        view = new BorderPane();

        Sidebar sidebar = new Sidebar();
        view.setLeft(sidebar);

        Region principalContent = new Region();
        principalContent.setStyle("-fx-background-color: #f5f5f5;");
        view.setCenter(principalContent);
    }

    public BorderPane getView() {
        return view;
    }
}
