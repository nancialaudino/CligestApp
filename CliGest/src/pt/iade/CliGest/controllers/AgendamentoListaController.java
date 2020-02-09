package pt.iade.CliGest.controllers;

import javafx.collections.FXCollections; 
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import pt.iade.CliGest.WindowManager;
import pt.iade.CliGest.models.Agendamento;
import pt.iade.CliGest.models.Especialidade;
import pt.iade.CliGest.models.daos.CligestDAO; 

/**Classe responsavel por mostrar a lista de agendamentos*/
public class AgendamentoListaController {	
public Agendamento agendamento;
	
	public AgendamentoListaController(Agendamento agendamento){
		this.agendamento = agendamento;
	}
	

	@FXML
    private ListView<Agendamento> agendamentosLV;
    private ObservableList<Agendamento> agendamentos;
    @FXML
	private void initialize () {

        agendamentos=CligestDAO.getAgendamentos();
    	agendamentosLV.setItems(agendamentos);
    	
    	

}
    
    @FXML
    void fechar (ActionEvent event) {
	WindowManager.openMenuWindow();
    }
    
    

}

