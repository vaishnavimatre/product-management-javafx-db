package Add_User;


import db_operation.dbUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddUserScreenController {




		@FXML
		private  static TextField UserName;
		
		@FXML
		private static TextField loginName;
		
		@FXML
		private static TextField Password;
		
		@FXML
		private static TextField userRole;
		
		
		
		
		
		
		
		
	
     public void  Close(ActionEvent event) {
    	 HomeScreen.showHomeScreen();
 		
 	}
     public void  Save(ActionEvent event) {
    	 AddUserScreenController.AddUserScreen();
  		
  	}
	
public static void AddUserScreen() {
	String query="insert into user5(UserName,loginName,Password,Userrole) VALUES('"+UserName+"','"+loginName+"','"+Password+"','"+userRole+"')";
dbUtils.executeQuery(query);

}
}