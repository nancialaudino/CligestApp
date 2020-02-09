package pt.iade.CliGest;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import pt.iade.CliGest.controllers.LoginController;
import pt.iade.CliGest.controllers.MenuController;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.fxml.FXMLLoader;
import pt.iade.CliGest.controllers.MenuController;


/** Classe principal do projeto
 *  @author: Nancia Laudino - 50036506 */

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		WindowManager.setPrimaryStage(primaryStage);
		WindowManager.openMainWindow();
				
	}
	
	public static void main(String[]  args) {
		launch(args);
	}
}

