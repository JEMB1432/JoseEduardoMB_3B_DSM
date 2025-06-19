package jemb.bistro_gurmand;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import jemb.bistro_gurmand.views.Admin.DashboardView;
import jemb.bistro_gurmand.views.LoginView;

public class App extends Application {

    private static Stage primaryStage;
    private static Scene mainScene;

    @Override
    public void start(Stage stage) {
        primaryStage = stage;


        // Configuración inicial
        primaryStage.setTitle("Bistro Gurmand");
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(600);
        primaryStage.setMaximized(true);

        // Cargar vista inicial
        loadView("login");

        primaryStage.show();
    }

    /* Metodo público para cambiar vistas*/
    public static void loadView(String nombreVista) {
        try {
            Pane root;

            switch(nombreVista.toLowerCase()) {
                case "login":
                    root = new LoginView().getView();
                    break;
                case "dashboard":
                    root = new DashboardView().getView();
                    break;
                // Añadir más vistas según sea necesario
                default:
                    throw new IllegalArgumentException("Vista no encontrada: " + nombreVista);
            }

            if (mainScene == null) {
                mainScene = new Scene(root);
                mainScene.getStylesheets().add(
                        App.class.getResource("/CSS/styles.css").toExternalForm()
                );
                primaryStage.setScene(mainScene);
            } else {
                mainScene.setRoot(root);
            }

        } catch (Exception e) {
            System.err.println("Error al cargar vista: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }
}