package AddProduct;

import db_operation.dbUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddProductScreenController {



			@FXML
			private  static TextField ProductName;
			
			@FXML
			private static TextField ProductId;
			
			@FXML
			private static TextField Price;
			
			@FXML
			private static TextField Category;
			
			@FXML
			private static TextField Quantity;
			
			
			
			
			
			
			
			
		
	     public void  Close(ActionEvent event) {
	    	 HomeScreen.showHomeScreen();
	 		
	 	}
	     public void  Save(ActionEvent event) {
	    	 AddProductScreenController.AddProductScreen();
	  		
	  	}
		
	public static void AddProductScreen() {
		String query="insert into Productt1(productname,productID,price,category,Quantity) VALUES('"+ProductName+"','"+ProductId+"','"+Price+"','"+Category+"','"+Quantity+"')";
	dbUtils.executeQuery(query);

	}
	}

