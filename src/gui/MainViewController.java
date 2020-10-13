package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{

	@FXML
	private MenuItem menuItemRegistrar;
	@FXML
	private MenuItem menuItemUsuariosRegistrados;

	@FXML
	public void onMenuItemRegistrarAction() {
		System.out.println("Registrar");
	}

	@FXML
	public void onMenuItemUsuariosRegistradosAction() {
		System.out.println("Usuarios Registrados");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {


	}

}
