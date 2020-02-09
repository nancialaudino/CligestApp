package pt.iade.CliGest.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import pt.iade.CliGest.WindowManager;
import pt.iade.CliGest.models.Agendamento;
import pt.iade.CliGest.models.Medico;
import pt.iade.CliGest.models.Utilizador;
import pt.iade.CliGest.models.daos.CligestDAO;



/**Esta classe é a responsável pela selecção do paciente para o agendamento.
 *Recebe o agendamento, já com a especialidade e o médico inseridos
 *nos controladores anteriores. Ao ser clicado o botão seguinte
 *leva-nos à página para a conclusão do agendamento. */

public class PacienteController {
private String pacEscolhido;
private Agendamento agendamento;
	@FXML
    private ListView<Utilizador> pacienteLV;
    private ObservableList<Utilizador> pacientes;
    
    
    public PacienteController(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

    
    @FXML
	private void initialize () {
    	pacientes = CligestDAO.getUtilizadores();
    	pacienteLV.setItems(pacientes);
    	/*
    	ObservableList<String> nomes = FXCollections.observableArrayList();
    	for(int i = 0; i < pacientes.size(); i++ ) {
    		nomes.add(pacientes.get(i).getNome());
    	}
    			*/
    }
    
	
    /**Métdo usado para saltar para a página seguinte
	    * onde é feita a conclusão do agendamento*/
    @FXML
    void seguinte (ActionEvent event) {
    	Utilizador pacEscolhido = pacienteLV.getSelectionModel().getSelectedItem();
    	agendamento.setPaciente (pacEscolhido);
    	WindowManager.agendar(agendamento);

    }
    
    /**Métdo usado para voltar para a página anterior
	 * onde é feita a escolha do médico
	 * @param event - evento */
    @FXML
    void anterior (ActionEvent event) {
    	WindowManager.seguinte(agendamento);

    }
	
    @FXML
    void fechar (ActionEvent event) {
    	WindowManager.openMenuWindow();

    }
	
    
  
    
	

}
