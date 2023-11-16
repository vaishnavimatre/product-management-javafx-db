package search_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operation.dbUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SearchUserScreenController {





			

			@FXML
			private  TextField UserName;

			//@FXML
	//		private  static TextField userName;
			
			@FXML
			private  TextField loginName;
			
			@FXML
			private  TextField Password;
			
			@FXML
			private TextField UserRole;
			
			@FXML
			private Button search;
			
			@FXML
			private  Button Edit;
			
			@FXML
			private Button Delete;
			
			
			@FXML
			private Button Close;
			
			
			
			

		     public void  Edit(ActionEvent event) {
		 		
		 	}

		     public void  Delete(ActionEvent event) {
		 		
		 	}

		     
		
	     public void  Close(ActionEvent event) {
	    	 HomeScreen.showHomeScreen();
	 		
	 	}
	     public void  Search(ActionEvent event) throws SQLException {
	    	 boolean status=SearchUserScreen(UserName.getText());
	    	 if(status) {
	    		 SearchUserScreen(null);
	    	 }else {
	    		 System.out.println("User Not Found");
	    	 }
	    	 
	  		
	  	}
		
	public  boolean  SearchUserScreen(String UserName) throws SQLException{
		String query="select * from user5 where UserName='"+UserName+"'";
		ResultSet rs = dbUtils.executeQueryGetResult(query);
		try {
			if(rs.next()) {
				// userName.setText(rs.getString("UserName"));
			  
				
						loginName.setText(rs.getString("loginName"));
					  Password.setText(rs.getString("Password"));
			   UserRole.setText(rs.getString("userRole"));
			   
			  
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
        return false;
	}
	}

