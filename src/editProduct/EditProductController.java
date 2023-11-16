package editProduct;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operation.dbUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EditProductController {
	
	             

					@FXML
					private  TextField ProductNameToEdit;

					@FXML
			        private   TextField NewProductName;
					
					@FXML
					private   TextField NewProductId;
					
					@FXML
					private  TextField NewPrice;
					
					@FXML
					private  TextField NewCategory ;
					
					@FXML
					private TextField NewQuantity;
					
					@FXML
					private Button Cancle;

					@FXML
					private Button Save;
					
					
					

				     public void  Save(ActionEvent event) {
				    	 
				 	}	


				     
				
			     public void  Cancle(ActionEvent event) {
			    	 HomeScreen.showHomeScreen();
			 	}
			    
			     public void  Edit(ActionEvent event) throws SQLException {
			    	 boolean status=showEditUserScreen(ProductNameToEdit.getText());
			    	 if(status) {
			    		 showEditUserScreen(null);
			    		 System.out.println("Product information is  updated");
			    	 }else {
			    		 System.out.println("Product information is not updated");
			    	 }
			    	 
			  		
			  	}
				
			public  boolean  showEditUserScreen(String ProductNameToEdit) throws SQLException{
				String query="select * from Productt1  where ProductName='"+ProductNameToEdit+"'";
				ResultSet rs = dbUtils.executeQueryGetResult(query);
				
					while(rs.next()) {
						NewProductName.setText(rs.getString("ProductName"));					  
							
						NewProductId.setText(rs.getString("ProductId"));
						NewPrice.setText(rs.getString("Price"));
						NewQuantity.setText(rs.getString("Quantity"));
						NewCategory.setText(rs.getString("Category"));
				

		    		
					
					}
	          String updatequery="update  Productt1 Set "+" ProductName='"+NewProductName.getText() +"',ProductId='"+NewProductId.getText()+"',Price='"+NewPrice.getText()+"',Category='"+NewCategory.getText()+"',Quantity='"+NewQuantity.getText()+"'";
		    		dbUtils.executeQuery(updatequery);
		    		
		    		return true;
				}

		       
			

		     

	}



