package pt.iade.CliGest;


import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import pt.iade.CliGest.controllers.MedicoController;
import pt.iade.CliGest.controllers.MedicoListaController;
import pt.iade.CliGest.controllers.MenuController;
import pt.iade.CliGest.controllers.PacienteController;
import pt.iade.CliGest.controllers.PacienteListaController;
import pt.iade.CliGest.models.Agendamento;
import pt.iade.CliGest.controllers.AgendamentoController;
import pt.iade.CliGest.controllers.AgendamentoListaController;
import pt.iade.CliGest.controllers.EspecialidadeController;
import pt.iade.CliGest.controllers.LoginController;
import pt.iade.CliGest.Main;


/**Nesta classe encontram-se todas as funcoes que serao chamadas
 * quando se fizer a navegacao entre as paginas. 
 * @author Nancia Laudino - 50036506*/

public class WindowManager {

	private static Stage primaryStage;

	public static void setPrimaryStage(Stage primaryStage) {
		WindowManager.primaryStage = primaryStage;
	} 


	public static void backToMainWindow() {
		openSceneInWindow("views/menusView.fxml",
				primaryStage,new MenuController());
	}
	
	/** Metodo usado para abrir a pagina dos Menus logo a seguir
	 * a pagina do Login */
	
	
	public static void openMenuWindow() {
		openSceneInWindow("views/Menus.fxml",
				primaryStage,new MenuController());
   		
	}
		
		
	/** Metodo usado na classe MenuController para sair da Aplicacao, ou seja
	 * voltar a pagina do Login */
	
   public static void sairDaAplicação () {
	   openSceneInWindow("views/LoginView.fxml",
				primaryStage,new LoginController());
   		
	}
   
	/** Metodo usado na classe MenuController para escolher a opcao de agendar uma
	 * consulta cuja pagina seguinte consiste em escolher a especialidade. */
   
   public static void agendarConsulta () {
	   openSceneInWindow("views/selectEspecialidade.fxml",
				primaryStage,new EspecialidadeController());
   		
	}
   
   /**Metodo usado para a ver a lista de todos os pacinetes inseridos
    * dentro da base de dados*/
   
   public static void verPacientes () {
	   openSceneInWindow("views/pacientesLista.fxml",
				primaryStage,new PacienteListaController());
   }
   
   /**Metodo usado para a ver a lista de todos os pacinetes inseridos
    * dentro da base de dados*/
  
   public static void verMedicos () {
	   openSceneInWindow("views/medicosLista.fxml",
				primaryStage,new MedicoListaController());
   }
   
	
   /**Metodo usado na classe EspecialidadeController para avançar para a pagina seguinte
    * onde e feita a escolha do Medico
    * @param agendamento - objeto agendamento*/
   
   public static void seguinte (Agendamento agendamento) {
	   openSceneInWindow("views/selectMedico.fxml",
				primaryStage,new MedicoController(agendamento));
   		
	}
   
   /**Metodo usado para agendar uma consulta
     * @param agendamento - objeto agendameto */
   public static void agendar (Agendamento agendamento) {
	   openSceneInWindow("views/Agendamento.fxml",
				primaryStage,new AgendamentoController(agendamento));
   }
   
   
  /**Metodo usado para ver a lista de agendamentos
   * quer sejam os da base de dados ou feitos pela aplicacao
   * @param agendamento - objeto qgendamento*/
   public static void listaAgendamentos (Agendamento agendamento) {
	   openSceneInWindow("views/agendamentosLista.fxml",
				primaryStage,new AgendamentoListaController(agendamento));
   }
   
   /**Metodo usado para ver a lista de pacientes da base dados
    * para se poder fazer um agendamento
    * @param agendamento - objeto agendamento*/
   public static void selectPaciente (Agendamento agendamento) {
	   openSceneInWindow("views/selectPaciente.fxml",
				primaryStage,new PacienteController(agendamento));
   }
    
 
   /** Metodo usado para abrir a jenela principal da aplicacao,
	 * a janela do Login */
	
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
