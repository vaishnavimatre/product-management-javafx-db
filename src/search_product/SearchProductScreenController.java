package search_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operation.dbUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SearchProductScreenController {


          	@FXML
				private  TextField ProductNameToSearch;

				@FXML
		    	private  TextField ProductName;
				
				@FXML
				private  TextField ProductId;
				
				@FXML
				private  TextField Price;
				
				@FXML
				private TextField Quantity;

				@FXML
				private TextField Category;
				
				
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

			     
			
		     public void Close(ActionEvent event) {
		    	 HomeScreen.showHomeScreen();
		 	}
		     public void  Search(ActionEvent event) throws SQLException {
		    	 boolean status=SearchProductScreen(ProductNameToSearch.getText());
		    	 if(status) {
		    		 SearchProductScreen(null);
		    	 }else {
		    		 System.out.println("Product Not Found");
		    	 }
		    	 
		  		
		  	}
			
		public  boolean  SearchProductScreen(String ProductNameToSearch) throws SQLException{
			String query="select * from Productt1 where ProductName='"+ProductNameToSearch+"'";
			ResultSet rs = dbUtils.executeQueryGetResult(query);
			try {
				if(rs.next()) {
					// userName.setText(rs.getString("UserName"));
				  
					
							ProductName.setText(rs.getString("ProductName"));
							ProductId.setText(rs.getString("ProductId"));
				   Price.setText(rs.getString("Price"));
				   Category.setText(rs.getString("Category"));
				  Quantity.setText(rs.getString("Quantity"));
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
	        return false;
		}
		}



