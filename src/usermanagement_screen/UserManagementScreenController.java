package usermanagement_screen;

import Add_User.AddUserScreen;
import edit_user.EditUserScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_user.SearchUserScreen;

public class UserManagementScreenController {


	@FXML
	private Button AddUser;
	
	@FXML
	private Button EditUser;
	
	
	@FXML
	private Button  SearchUser;
	
	@FXML
	private Button DeleteUser;

	
	
	
	@FXML
	private Button  Quit;
	
	
	
	public void showAddUser(ActionEvent event) {
		AddUserScreen.showAddUserScreen();
		
	}
public void showEditUser(ActionEvent event) throws Exception {
		EditUserScreen.showEditUserScreen();
	}
public void  showSearchUser(ActionEvent event) {
	   SearchUserScreen.showSearchUserScreen();
}
public void  showDeleteUser(ActionEvent event) {
	
}
public void  showQuit(ActionEvent event) {
	
}

	
}


