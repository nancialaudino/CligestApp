package pt.iade.CliGest.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import pt.iade.CliGest.WindowManager;
import pt.iade.CliGest.models.Agendamento;
import pt.iade.CliGest.models.Medico;
import pt.iade.CliGest.models.daos.CligestDAO;

public class MedicoController { 
	private String medicoEscolhido;
	@FXML
    private ListView<String> medicoLV;
	private ObservableList<Medico> medicos;
	
	private Agendamento agendamento;
	
	public MedicoController(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

	@FXML
	private void initialize () {
		medicos = CligestDAO.getMedicos();
    	ObservableList<String> nomes = FXCollections.observableArrayList();
    	for(int i = 0; i < medicos.size(); i++ ) {
    		nomes.add(medicos.get(i).getNome());
    	}
    	medicoLV.setItems(nomes); 
    	medicoLV.getSelectionModel();
    	
    	medicoLV.setOnMouseClicked(
    			(event) ->{
    				medicoEscolhido = medicoLV.getSelectionModel().getSelectedItem();
    				System.out.println(medicoEscolhido);
    			});
		
	} 
    
	    @FXML
	    void avancar (ActionEvent event) {
		WindowManager.selectPaciente();

	    }

	    @FXML
	    void voltar (ActionEvent event) {
	    WindowManager.agendarConsulta();

	    }
	    
	    @FXML
	    void fechar (ActionEvent event) {
	    WindowManager.openMenuWindow();

	    }

}
