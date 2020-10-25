package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainViewController implements Initializable{

	@FXML
	private MenuItem menuItemRegistrar;
	@FXML
	private MenuItem menuItemUsuariosRegistrados;
	@FXML
	private MenuItem MenuItemHome;


	@FXML
	public void onMenuItemRegistrarAction() {
		carregarView("/gui/RegistrarView.fxml");
	}

	@FXML
	public void onMenuItemUsuariosRegistradosAction() {
		carregarView("/gui/UsuariosRegistradosView.fxml");
	}

	@FXML
	public void onMenuItemHomeAction() {
		carregarView("/gui/HomeView.fxml");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

	//MÉTODO PARA PEGAR A SCENE DA VIEW PRINCIPAL
	private void carregarView(String nomeDaView) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(nomeDaView));
			VBox newVBox = loader.load();

			Scene mainScene = Main.getMainScene();
			/*GET ROOT SERVE PARA PEGAR O PRIMEIRO ELEMENTO DA VIEW (QUE É UM SCROLLPANE)
			 *GET CONTENT PEGA O CONTEUDO (VBOX) DO PRIMEIRO ELEMENTO(SCROLL PANE)
			 *ENTÃO SÓ É FEITO O CASTING PARA VBOX PARA MANIPULÁ-LO E ADICIONAR O CONTEUDO DA OUTRA VIEW
			*/
			VBox mainVBox = (VBox) ((ScrollPane)mainScene.getRoot()).getContent();
			//PEGA O PRIMEIRO FILHO DO VBOX DA JANELA PRINCIPAL
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());

		}catch(IOException e) {
			Alerts.showAlert("IO Excepiton", "Erro ao carregar a view", e.getMessage(), AlertType.ERROR);
		}
	}

}
