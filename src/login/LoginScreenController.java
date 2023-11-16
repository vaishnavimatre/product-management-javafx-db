package login;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import db_operation.dbUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginScreenController {

    @FXML
	private TextField loginName;
	
    @FXML
	private TextField password;
	
    @FXML
	private Button loginButton;
    
    
	
	
	public void login(ActionEvent event) 
	{
		
		boolean loginStatus=LoginScreenController.validateloginnameandpassword(loginName.getText(), password.getText());
	if(loginStatus) {
          HomeScreen.showHomeScreen();
	}else {
		System.out.println("login unsuccessful");
	}
	
	}
	
	public static boolean validateloginnameandpassword(String loginName,String password)  {
		String query="select * from user5 where loginName ='"+loginName+"'and password='"+password+"'";
				
		ResultSet rs=dbUtils.executeQueryGetResult(query);
		try {
			if(rs.next()) {
				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();	
			}
				
			
		return false;
		}
}

