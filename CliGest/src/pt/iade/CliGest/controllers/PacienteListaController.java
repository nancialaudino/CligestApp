package pt.iade.CliGest.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import pt.iade.CliGest.WindowManager;
import pt.iade.CliGest.models.Utilizador;
import pt.iade.CliGest.models.daos.CligestDAO;

public class PacienteListaController {
	@FXML
    private ListView<String> pacientesListaLV;
    private ObservableList<Utilizador> pacientes;
		
		    
	@FXML
	private void initialize () {
		    	pacientes = CligestDAO.getUtilizadores();
		    	ObservableList<String> nomes = FXCollections.observableArrayList();
		    	for(int i = 0; i < pacientes.size(); i++ ) {
		    		nomes.add(pacientes.get(i).getNome());
		    	}
		    	pacientesListaLV.setItems(nomes);
		    	pacientesListaLV.getSelectionModel();
		    	
		    	
		    }
			
		    

	@FXML
    void fechar (ActionEvent event) {
    	WindowManager.openMenuWindow();
    }
}

