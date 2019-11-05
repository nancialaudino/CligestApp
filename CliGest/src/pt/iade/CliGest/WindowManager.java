package pt.iade.CliGest;


import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import pt.iade.CliGest.controllers.MainController;
import pt.iade.CliGest.controllers.MedicoController;
import pt.iade.CliGest.controllers.MenuController;
import pt.iade.CliGest.models.Agendamento;
import pt.iade.CliGest.controllers.EspecialidadeController;
import pt.iade.CliGest.controllers.LoginController;
import pt.iade.CliGest.Main;


public class WindowManager {

	private static Stage primaryStage;

	public static void setPrimaryStage(Stage primaryStage) {
		WindowManager.primaryStage = primaryStage;
	}


	public static void backToMainWindow() {
		openSceneInWindow("views/menusView.fxml",
				primaryStage,new MenuController());
	}
	
	/** Método usado para abrir a página dos Menus logo a seguir
	 * a página do Login */
	
	
	public static void openMenuWindow() {
		openSceneInWindow("views/Menus.fxml",
				primaryStage,new MenuController());
   		
	}
		
		
	/** Método usado na classe MenuController para sair da Aplicação, ou seja
	 * voltar à página do Login */
	
   public static void sairDaAplicação () {
	   openSceneInWindow("views/LoginView.fxml",
				primaryStage,new LoginController());
   		
	}
   
	/** Método usado na classe MenuController para escolher a opção de agendar uma
	 * consulta cuja página seguinte consiste em escolher a especialidade. */
   
   public static void agendarConsulta () {
	   openSceneInWindow("views/selectEspecialidade.fxml",
				primaryStage,new EspecialidadeController());
   		
	}
   
   
	
   /**Metodo usado na classe EspecialidadeController para avançar para a página seguinte
    * onde é feita a escolha do Médico*/
   
   public static void seguinte () {
	   openSceneInWindow("views/selectMedico.fxml",
				primaryStage,new MedicoController());
   		
	}
   
   /*
   public static void comboBox () {
	   openSceneInWindow("views/LoginView.fxml",
				primaryStage,new ComboBoxController());
   		
	}
   */
	
  
	public static double tela=0;
	public static void openMainWindow() {
		
		
		openWindow("views/LoginView.fxml",
				primaryStage,new LoginController());
		primaryStage.show();
		
	
	}
	
	
	
	

	
	public static void openSceneInWindow(String viewPath, Stage window,
			Object controller) {
		try {
			Parent root = createNewNodeTree(viewPath, controller);
			window.getScene().setRoot(root);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void openModalWindow(String viewPath, Stage window,
			Stage parentWindow, Object controller) {
		window.initOwner(parentWindow);
		window.initModality(Modality.APPLICATION_MODAL); 
		openWindow(viewPath, window,controller);
		
	}
	

	public static void openWindow(String viewPath, Stage window, 
			Object controller) {
		try {
			Parent root = createNewNodeTree(viewPath, controller);
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
			window.setScene(scene);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static Parent createNewNodeTree(String viewPath, Object controller) throws IOException {
		FXMLLoader loader = new FXMLLoader(
				Main.class.getResource(viewPath));
		loader.setController(controller);;
		Parent root = loader.load();
		return root;
	}
	
	
}
