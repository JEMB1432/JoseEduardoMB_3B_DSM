package mx.jemb.u2_ti_05_formfx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox vbox = new VBox();
        vbox.setMinWidth(500);
        vbox.setMaxWidth(800);
        vbox.setMinHeight(800);
        vbox.setMaxHeight(800);
        vbox.setAlignment(Pos.CENTER);


        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #fff");
        root.setMinHeight(600);
        root.setMaxWidth(400);
        root.setHgap(10);
        root.setVgap(10);

        HelloApplication.class.getResource("/CSS/styles.css");

        Label lblNombre = new Label("Nombre: ");
        TextField tfNombre = new TextField();

        Label lblApellido = new Label("Apellido: ");
        TextField tfApellido = new TextField();

        Label lblEdad = new Label("Edad: ");
        TextField tfEdad = new TextField();

        ObservableList<String> rol = FXCollections.observableArrayList("Estudiante","Profesor","Administrador");
        ComboBox<String> cmbrol = new ComboBox<>(rol);

        Label lblResultado = new Label();
        Button btnCrear = new Button("Crear");
        Button btnReset = new Button("Reset");

        btnCrear.setOnAction(e -> {
           String nombre = tfNombre.getText();
           String apellido = tfApellido.getText();
           String rolValue = cmbrol.getSelectionModel().getSelectedItem();
           String edadValue = tfEdad.getText();
           if(nombre.isEmpty() || apellido.isEmpty() || rolValue.isEmpty() || edadValue.isEmpty()){
               lblResultado.setText("Llene todos los campos");
           }else{
               lblResultado.setText("Nombre: "+nombre + "\nApellido: "+apellido + "\nEdad: "+edadValue + "\nRol: "+rolValue);
               root.setStyle("-fx-background-color: rgb(150,255,0);");
               lblResultado.setStyle("-fx-text-fill: #00b0ff;");
           }
        });

        btnReset.setOnAction(e -> {
            tfNombre.clear();
            tfApellido.clear();
            tfEdad.clear();
            cmbrol.getSelectionModel().clearSelection();
            lblResultado.setText("");
            root.setStyle("-fx-background-color: rgb(255,255,255);");
            lblResultado.setStyle("-fx-background-color: #fff;");
            root.setMinHeight(600);
            root.setMaxWidth(400);
        });


        root.getStyleClass().add("form-Container");

        root.add(lblNombre, 0, 0);
        root.add(tfNombre, 1, 0);
        root.add(lblApellido, 0, 1);
        root.add(tfApellido, 1, 1);
        root.add(lblEdad, 0, 2);
        root.add(tfEdad, 1, 2);
        root.add(cmbrol, 1, 3);
        root.add(btnCrear, 1, 4);
        root.add(btnReset, 1, 5);
        root.add(lblResultado, 0, 6);

        vbox.getChildren().addAll(root);

        Image image = new Image(getClass().getResourceAsStream("/images/form.png"));
        Scene scene = new Scene(vbox, 800, 600);
        stage.setTitle("Formulario");
        stage.getIcons().add(image);
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}