package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

public class VenRegistroController {
	@FXML
	private TextField txt1;
	@FXML
	private TextField txt2;
	@FXML
	private TextField tx3;
	@FXML
	private Button BTregistar;

	// Event Listener on Button[#BTregistar].onAction
	@FXML
	public void AccionRegistrar(ActionEvent event) {
		// TODO Autogenerated
		
		System.out.println(txt1.getText());
		
		System.out.println(txt2.getText() );
		
		System.out.println(tx3.getText() );

	}
}
