package pt.iade.CliGest;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import pt.iade.CliGest.controllers.CligestController;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader loader = new FXMLLoader(
					Main.class.getResource("views/cligestView.fxml"));
			loader.setController(new CligestController());;
			Parent root = loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
/*
public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {
	       Parent root = FXMLLoader.load(getClass().getResource("telaPrincipal.fxml"));
	    
	        Scene scene = new Scene(root,600,600);
	    
	        stage.setTitle("Welcome to CliGest App");
	        stage.setScene(scene);
	        stage.show();
	
	public void start(Stage primaryStage) throws IOException {
		
		Pane root = FXMLLoader.load(getClass().getResource("telaPrincipal.fxml"));
		
		Scene scene = new Scene (root,600,600);
		primaryStage.setScene(scene);
		primaryStage.show();
	
	
		
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("telaPrincipal.fxml").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	*/
	
	public static void main(String[] args) {
		launch(args);
	}
}

