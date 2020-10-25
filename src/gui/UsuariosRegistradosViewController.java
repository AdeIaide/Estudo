package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Cliente;

public class UsuariosRegistradosViewController implements Initializable{

	@FXML
	private Button buttonExcluir;

	@FXML
	private TableView<Cliente> tableViewCliente;
	@FXML
	private TableColumn<Cliente, String> tableColumnNome;
	@FXML
	private TableColumn<Cliente, Integer> tableColumnTelefone;
	@FXML
	private TableColumn<Cliente, Integer> tableColumnIdade;
	@FXML
	private TableColumn<Cliente, String> tableColumnEndereco;
	@FXML
	private TableColumn<Cliente, String> tableColumnEmail;

	@FXML
	public void onButtonExcluirAction() {
		System.out.println("Excluido padrin");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializaNodes();
	}

	//PADRÃO DO JAVAFX PARA INICIAR O COMPORTAMENTO DAS COLUNAS
	private void initializaNodes() {
		tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tableColumnTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
		tableColumnIdade.setCellValueFactory(new PropertyValueFactory<>("idade"));
		tableColumnEndereco.setCellValueFactory(new PropertyValueFactory<>("endereco"));
		tableColumnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewCliente.prefHeightProperty().bind(stage.heightProperty());
		tableViewCliente.prefWidthProperty().bind(stage.widthProperty());
	}
}
