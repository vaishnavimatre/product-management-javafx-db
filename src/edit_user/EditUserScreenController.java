package edit_user;
import java.sql.ResultSet;


import java.sql.SQLException;

import db_operation.dbUtils;

import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EditUserScreenController {
	
             

				@FXML
				private  TextField UserNameToEdit;

				@FXML
		        private   TextField NewUserName;
				
				@FXML
				private   TextField NewloginName;
				
				@FXML
				private  TextField NewPassword;
				
				@FXML
				private  TextField NewUserRole;
				
				
				
				@FXML
				private Button Delete;

				@FXML
				private Button Save;
				
				
				

			     public void  Save(ActionEvent event) {
			    	 
			 	}	


			     
			
		     public void  Clear(ActionEvent event) {
		    	 HomeScreen.showHomeScreen();
		 	}
		    
		     public void  Edit(ActionEvent event) throws SQLException {
		    	 boolean status=showEditUserScreen(UserNameToEdit.getText());
		    	 if(status) {
		    		 showEditUserScreen(null);
		    		 System.out.println("User information is  updated");
		    	 }else {
		    		 System.out.println("User information is not updated");
		    	 }
		    	 
		  		
		  	}
			
		public  boolean  showEditUserScreen(String UserNameToEdit) throws SQLException{
			String query="select * from User5  where UserName='"+UserNameToEdit+"'";
			ResultSet rs = dbUtils.executeQueryGetResult(query);
			
				while(rs.next()) {
					NewUserName.setText(rs.getString("UserName"));					  
						
					NewloginName.setText(rs.getString("loginName"));
					NewPassword.setText(rs.getString("Password"));
					NewUserRole.setText(rs.getString("userRole"));
			

	    		
				
				}
          String updatequery="update  user5 Set "+" UserName='"+NewUserName.getText() +"',loginName='"+NewloginName.getText()+"',Password='"+NewPassword.getText()+"',userRole='"+NewUserRole.getText()+"'";
	    		dbUtils.executeQuery(updatequery);
	    		
	    		return true;
			}

	       
		

	     

}

