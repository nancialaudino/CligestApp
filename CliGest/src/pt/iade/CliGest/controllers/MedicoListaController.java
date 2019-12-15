package pt.iade.CliGest.controllers;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import pt.iade.CliGest.WindowManager;
import pt.iade.CliGest.models.Medico;
import pt.iade.CliGest.models.Utilizador;
import pt.iade.CliGest.models.daos.CligestDAO;

public class  MedicoListaController {
	@FXML
    private ListView<String> medicosLV;
    private ObservableList<Medico> medicos;
		
		    
	@FXML
	private void initialize () {
		    	medicos = CligestDAO.getMedicos();
		    	ObservableList<String> nomes = FXCollections.observableArrayList();
		    	for(int i = 0; i < medicos.size(); i++ ) {
		    		nomes.add(medicos.get(i).getNome());
		    	}
		    	medicosLV.setItems(nomes);
		    	medicosLV.getSelectionModel();
		    	
		    	
		    }
			
		    

	@FXML
    void fechar (ActionEvent event) {
    	WindowManager.openMenuWindow();
    }
}

