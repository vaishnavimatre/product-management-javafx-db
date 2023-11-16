package edit_user;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class EditUserScreen {
		
			 public static void showEditUserScreen( ) throws Exception {
				 try {
			 //Parent actorGroup=FXMLLoader.load(new URL("file:\\Users\\VAISHNAVI MATRE\\eclipse-workspace\\ShopManagementJavaFxDB\\src\\edit_user\\EditUserScreen.fxml"));
		   	 
			 Parent actorGroup=FXMLLoader.load(new URL("file:\\Users\\VAISHNAVI MATRE\\eclipse-workspace\\ShopManagementJavaFxDB\\src\\edit_user\\EditUserScreen1.fxml"));
		   	 
		  	 
		StageFactory.stage.setTitle("Edit User"); 
	  	 Scene scene=new Scene(actorGroup,600,400);
	  	StageFactory.stage.setScene(scene); 
	  	StageFactory.stage.setFullScreen(true);
	  	StageFactory.stage.show(); 

	}
		 catch(Exception e) {
			 e.printStackTrace();
		 }

	}
	}


