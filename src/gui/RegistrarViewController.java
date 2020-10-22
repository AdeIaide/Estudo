package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegistrarViewController {

	@FXML
	private TextField Nome;
	@FXML
	private TextField Telefone;
	@FXML
	private TextField idade;
	@FXML
	private TextField endereco;
	@FXML
	private TextField email;
	@FXML
	private Button registrar;

	@FXML
	public void onButtonRegistrarAction() {
		System.out.println("Registrado padrin");
	}
}
