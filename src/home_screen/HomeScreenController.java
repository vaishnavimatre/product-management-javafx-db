
package home_screen;

import db_operation.dbUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import productmanagement_screen.ProductManagementScreen;
import usermanagement_screen.UserManagementScreen;


public class HomeScreenController {

	@FXML
	private Button userManagement;
	
	@FXML
	private Button productManagement;
	
	@FXML
	private Button backToHomeScreen;
	
	public void showUserManagementScreen(ActionEvent event) {
		UserManagementScreen.showUserManagementScreen();
	}
public void showProductManagementScreen(ActionEvent event) {
		ProductManagementScreen.showProductManagementScreen();
	}
public void  backToHomeScreen(ActionEvent event) {
	HomeScreen.showHomeScreen();
}


}
