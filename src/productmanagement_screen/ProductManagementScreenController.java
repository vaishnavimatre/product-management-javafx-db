package productmanagement_screen;

import AddProduct.AddProductScreen;
import editProduct.EditProductScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_product.SearchProductScreen;

public class ProductManagementScreenController {
	

		@FXML
		private Button AddProduct;
		
		@FXML
		private Button EditProduct;
		
		
		@FXML
		private Button  SearchProduct;
		
		@FXML
		private Button DeleteProduct;

		
		
		
		@FXML
		private Button  Quit;
		
		
		
		public void showAddProduct(ActionEvent event) {
			AddProductScreen.showAddProductScreen();
			
		}
	public void showEditProduct(ActionEvent event) throws Exception {
	 EditProductScreen.showEditUserScreen();
	
		}
	public void  showSearchProduct(ActionEvent event) {
		SearchProductScreen.showSearchProductScreen();
	}
	public void  showDeleteProduct(ActionEvent event) {
		
	}
	public void  showQuit(ActionEvent event) {
		
	}

		
	}




