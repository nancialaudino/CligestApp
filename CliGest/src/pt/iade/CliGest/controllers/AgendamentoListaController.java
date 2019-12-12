package pt.iade.CliGest.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import pt.iade.CliGest.WindowManager;
import pt.iade.CliGest.models.Agendamento;
import pt.iade.CliGest.models.Especialidade;
import pt.iade.CliGest.models.daos.CligestDAO;

public class AgendamentoListaController {
	private String agendEscolhido;
	@FXML
    private ListView<String> agendamentosLV;
    private ObservableList<Agendamento> agendamentos;
    @FXML
	private void initialize () {
    	agendamentos = CligestDAO.getAgendamentos();
    	ObservableList<String> nomes = FXCollections.observableArrayList();
    	for(int i = 0; i < agendamentos.size(); i++ ) {
    		nomes.add(agendamentos.get(i).getData());
    	}
    	agendamentosLV.setItems(nomes);
    	agendamentosLV.getSelectionModel();
    	
    	agendamentosLV.setOnMouseClicked(
    			(event) ->{
    				agendEscolhido = agendamentosLV.getSelectionModel().getSelectedItem();
    				System.out.println(agendEscolhido);
    			});

}
    
    @FXML
    void fechar (ActionEvent event) {
	WindowManager.openMenuWindow();
    }

}

