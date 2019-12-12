package pt.iade.CliGest.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import pt.iade.CliGest.WindowManager;
import pt.iade.CliGest.models.Utilizador;
import pt.iade.CliGest.models.daos.CligestDAO;

public class PacienteController {
private String pacEscolhido;
	
	@FXML
    private ListView<String> pacienteLV;
    private ObservableList<Utilizador> pacientes;
    
    @FXML
	private void initialize () {
    	pacientes = CligestDAO.getUtilizadores();
    	ObservableList<String> nomes = FXCollections.observableArrayList();
    	for(int i = 0; i < pacientes.size(); i++ ) {
    		nomes.add(pacientes.get(i).getNome());
    	}
    	pacienteLV.setItems(nomes);
    	pacienteLV.getSelectionModel();
    	
    	pacienteLV.setOnMouseClicked(
    			(event) ->{
    				pacEscolhido = pacienteLV.getSelectionModel().getSelectedItem();
    				System.out.println(pacEscolhido);
    			});
    }
	
    @FXML
    void seguinte (ActionEvent event) {
    	WindowManager.agendar();

    }
    
    @FXML
    void anterior (ActionEvent event) {
    	WindowManager.seguinte();

    }
	
    @FXML
    void fechar (ActionEvent event) {
    	WindowManager.openMenuWindow();

    }
	
    
   
 
    
	

}
