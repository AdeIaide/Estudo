package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.entities.Cliente;

public class RegistrarViewController {

	@FXML
	private TextField textFieldNome;
	@FXML
	private TextField textFieldTelefone;
	@FXML
	private TextField textFieldIdade;
	@FXML
	private TextField textFieldEndereco;
	@FXML
	private TextField textFieldEmail;
	@FXML
	private Button ButtonRegistrar;

	@FXML
	public void onButtonRegistrarAction() {
		System.out.println(onTextFieldNomeAction());
		System.out.println(onTextFieldTelefoneAction());
		System.out.println(onTextFieldIdadeAction());
		System.out.println(onTextFieldEnderecoAction());
		System.out.println(onTextFieldEmailAction());
	}

	@FXML
	public String onTextFieldNomeAction() {
		return textFieldNome.getText();
	}

	@FXML
	public String onTextFieldTelefoneAction() {
		return textFieldTelefone.getText();
	}

	@FXML
	public String onTextFieldIdadeAction() {
		return textFieldIdade.getText();
	}

	@FXML
	public String onTextFieldEnderecoAction() {
		return textFieldEndereco.getText();
	}

	@FXML
	public String onTextFieldEmailAction() {
		return textFieldEmail.getText();
	}
}
