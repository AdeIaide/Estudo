package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Cliente;
import model.services.UsuariosRegistradosService;

public class UsuariosRegistradosViewController implements Initializable{

	private UsuariosRegistradosService servico;

	@FXML
	private Button buttonExcluir;

	@FXML
	private TableColumn<Cliente, Integer> tableColumnId;
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


	private ObservableList<Cliente> obsList;

	@FXML
	public void onButtonExcluirAction() {
		System.out.println("Excluido padrin");
		updateTableView();
	}

	public void setServico(UsuariosRegistradosService servico) {
		this.servico = servico;
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializaNodes();
	}

	//PADRÃO DO JAVAFX PARA INICIAR O COMPORTAMENTO DAS COLUNAS
	private void initializaNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tableColumnTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
		tableColumnIdade.setCellValueFactory(new PropertyValueFactory<>("idade"));
		tableColumnEndereco.setCellValueFactory(new PropertyValueFactory<>("endereco"));
		tableColumnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewCliente.prefHeightProperty().bind(stage.heightProperty());
		tableViewCliente.prefWidthProperty().bind(stage.widthProperty());
	}

	public void updateTableView() {
		if(servico == null) {
			throw new IllegalStateException("Servico esta nulo");
		}
		List<Cliente> list = servico.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewCliente.setItems(obsList);

	}


}
