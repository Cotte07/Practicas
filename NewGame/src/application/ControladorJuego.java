package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;

public class ControladorJuego {
	@FXML
	private Label idtexto;
	@FXML
	private ImageView idImage;
	@FXML
	private Label idVIdas;
	@FXML
	private TextField idTxtfield;
	@FXML
	private Button TBvalidar;
	@FXML
	private Label txtg;
	@FXML
	private Label txto;
	@FXML
	private Label txtn;
	@FXML
	private Label txto2;
	@FXML
	private Label txtr;
	@FXML
	private Label txtr2;
	@FXML
	private Label txte;
	@FXML
	private Label txta;
	
	String letra;
	int numero = 5; 
	int number = 0;

	
	
	@FXML
	Image myImage2 = new Image(getClass().getResourceAsStream("figura2.jpg"));
	Image myImage3 = new Image(getClass().getResourceAsStream("figura3.jpg"));
	Image myImage4 = new Image(getClass().getResourceAsStream("figura4.jpg"));
	Image myImage5 = new Image(getClass().getResourceAsStream("figura5.jpg"));
	Image myImage6 = new Image(getClass().getResourceAsStream("figura6.jpg"));
	Image myImage7 = new Image(getClass().getResourceAsStream("figura7.jpg"));
			
			


	// Event Listener on Button[#TBvalidar].onMouseClicked
	@FXML
	public void ClicValidar(MouseEvent event) {
		
		letra = idTxtfield.getText();
		
		if(letra.equals("C")) {
			txtg.setText("C");
			number = number + 1;
			
		}else if(letra.equals("O")) {
			txto.setText("O");
			txto2.setText("O");
			number = number + 2;

			
		}else if(letra.equals("L")) {
			txtn.setText("L");
			number = number + 1;

			
		}else if(letra.equals("M")){
			txtr.setText("M");
			number = number + 1;

			
		}else if(letra.equals("B")) {
			txtr2.setText("B");
			number = number + 1;
		
			
		}else if (letra.equals("I")) { 
			txte.setText("I");
			number = number + 1;
			
		}else if(letra.equals("A")) {
		
			txta.setText("A");
			number = number + 1;
			
			
		}else {
			if(numero == 5) {
				idVIdas.setText("4");
				idImage.setImage(myImage2);
				numero = numero - 1;
			}else if(numero == 4) {
				idVIdas.setText("3");
				idImage.setImage(myImage3);
				numero = numero - 1;
			}else if(numero == 3) {
				idVIdas.setText("2");
				idImage.setImage(myImage4);
				numero = numero - 1;
			}else if(numero == 2) {
				idVIdas.setText("1");
				idImage.setImage(myImage5);
				numero = numero - 1;
			}else {
				idVIdas.setText("0");
				idImage.setImage(myImage6);
				
				txta.setText(" ");
				txte.setText(" ");
				txtg.setText("PERDISTE!!!");
				txtn.setText(" ");
				txto.setText(" ");
				txto2.setText(" ");
				txtr.setText(" ");
				txtr2.setText(" ");
			}
				
		}
		if(number == 8) {
			idImage.setImage(myImage7);
		}
		
		idTxtfield.setText("");
		
	}
}
