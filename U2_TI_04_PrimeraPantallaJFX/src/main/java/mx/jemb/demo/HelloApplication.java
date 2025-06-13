package mx.jemb.demo;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*
        Label label = new Label("Label 1");
        Label label2 = new Label("Labe2");
        Button button = new Button("Button Aceptar");
        Button button2 = new Button("Button Cancelar");

        button.setOnAction(e -> {
            label.setText("Aceptado!");
        });

        button2.setOnAction(e -> {

            label.setText("Cancelado!");
        });*/

        Label lblNombre = new Label("Nombre: ");
        TextField tfNombre = new TextField();
        Label lblApellido = new Label("Apellido: ");
        TextField tfApellido = new TextField();
        Label lblComentario = new Label("Comentario: ");
        TextArea TAComentario = new TextArea();
        Label lblGrupo = new Label("Grupo: ");
        ObservableList<String> grupos = FXCollections.observableArrayList("3A", "3B", "3C");
        ComboBox<String> cbGrupo = new ComboBox<>(grupos);
        Label lblResultado = new Label();

        Button btnEnviar = new Button("Enviar");
        btnEnviar.setOnAction(e -> {
            String nombre = tfNombre.getText();
            String apellido = tfApellido.getText();
            String comentario = TAComentario.getText();
            String grupo = cbGrupo.getSelectionModel().getSelectedItem();
            if(nombre.isEmpty() || apellido.isEmpty() || comentario.isEmpty()) {
                lblResultado.setText("Llene todos los campos");
            }else {
                lblResultado.setText("Nombre: " + nombre + "\nApellido: " + apellido + "\nComentario: " + comentario + "\nGrupo: " + grupo );
            }
        });

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);

        root.add(lblNombre, 0, 0);
        root.add(tfNombre, 1, 0);
        root.add(lblApellido, 0, 1);
        root.add(tfApellido, 1, 1);
        root.add(lblComentario, 0, 2);
        root.add(TAComentario, 1, 2);
        root.add(lblGrupo, 0, 3);
        root.add(cbGrupo, 1, 3);
        root.add(btnEnviar, 0, 4);
        root.add(lblResultado, 1, 5);

        //VBox vbox = new VBox(20);
        //vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 800, 600);



        stage.setTitle("Hello!");
        Image image = new Image(getClass().getResourceAsStream("/images/conf.png"));
        stage.getIcons().add(image);
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}