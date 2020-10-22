package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegistrarViewController {

	@FXML
	private TextField nome;
	@FXML
	private TextField telefone;
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
		System.out.println(onTextFieldNomeAction());
		System.out.println(onTextFieldTelefoneAction());
		System.out.println(onTextFieldIdadeAction());
		System.out.println(onTextFieldEnderecoAction());
		System.out.println(onTextFieldEmailAction());
	}

	@FXML
	public String onTextFieldNomeAction() {
		return nome.getText();
	}

	@FXML
	public String onTextFieldTelefoneAction() {
		return telefone.getText();
	}

	@FXML
	public String onTextFieldIdadeAction() {
		return idade.getText();
	}

	@FXML
	public String onTextFieldEnderecoAction() {
		return endereco.getText();
	}

	@FXML
	public String onTextFieldEmailAction() {
		return email.getText();
	}
}
