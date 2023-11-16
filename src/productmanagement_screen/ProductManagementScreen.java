package productmanagement_screen;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ProductManagementScreen {



		public static void showProductManagementScreen() {
			try {
				Parent actorGroup=FXMLLoader.load(new URL("file:\\Users\\VAISHNAVI MATRE\\eclipse-workspace\\ShopManagementJavaFxDB\\src\\productmanagement_screen\\productmanagementscreen.fxml"));
			   	 
		
	        StageFactory.stage.setTitle("AddUser Screen");
			Scene scene=new Scene(actorGroup,600,400);
		     StageFactory.stage.setScene(scene);
		    StageFactory.stage.setFullScreen(true);;
			StageFactory.stage.show();
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		}
		}



