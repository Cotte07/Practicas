package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;

public class VentanaLoginController {
	@FXML
	private TextField Usuario;
	@FXML
	private TextField Clave;
	@FXML
	private Button BTjugar;
	@FXML
	private Button Registrar;


	// Event Listener on Button[#BTjugar].onAction
	@FXML
	private void ClicJugar() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana2.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	
	// Event Listener on Button[#Registrar].onAction
	@FXML
	public void BTregistrarse(ActionEvent event) throws IOException {

		try {
			 FXMLLoader loader = new FXMLLoader(getClass().getResource("VenRegistro.fxml"));
	            Parent root = loader.load();
	            Stage stage = new Stage();
	            stage.setScene(new Scene(root));
	            stage.show();
		}catch (Exception e) {
            e.printStackTrace();
        }
	}
}
