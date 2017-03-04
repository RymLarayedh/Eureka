package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;;
/**
*
* @author InesWanen
*/
public class MenuAdminController  implements Initializable {
	@FXML
	private JFXButton ManageForum;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		
	}
	

	// Event Listener on JFXButton[#ManageForum].onAction
	@FXML
	public void ManageForum(ActionEvent event) {
		// TODO Autogenerated
		TranslateTransition transition = new TranslateTransition();
		transition.setDuration(Duration.seconds(4));
		transition.setNode(ManageForum);
		transition.setToY(-200);
		transition.setToX(-200);
		transition.play();
		
	}

}