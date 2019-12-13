package pt.iade.CliGest.controllers;

import java.sql.Connection;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import pt.iade.CliGest.WindowManager;
import pt.iade.CliGest.models.Agendamento;
import pt.iade.CliGest.models.Especialidade;
import pt.iade.CliGest.models.daos.CligestDAO;
import pt.iade.CliGest.models.daos.DBConnector;

/**Esta classe é a responsável pela selecção da especialidade para o agendamento.
 *Recebe um agendamento. Ao ser clicado o botão seguinte
 *leva-nos à página para a selecção do médico e envia o agendamento com a
 *especialidade que foi escolhida.*/

public class EspecialidadeController {
	
	private String especEscolhida;
	private Agendamento agendamento = new Agendamento();
	@FXML
    private ListView<Especialidade> especialidadeLV;
    private ObservableList<Especialidade> especialidades;
    @FXML
	private void initialize () {
    	especialidades = CligestDAO.getEspecialidades();
    	especialidadeLV.setItems(especialidades); 	
    	
	}
 
    /**Métdo usado para saltar para a página anterior
	 * ou seja, no menu principal*/
    
    @FXML
    void anterior(ActionEvent event) {
    	WindowManager.openMenuWindow();

    }
     
    /**Métdo usado para saltar para a página seguinte
	 * onde é feita a escolha do Médico*/
    @FXML
    void seguinte(ActionEvent event) {
		Especialidade especEscolhida = especialidadeLV.getSelectionModel().getSelectedItem();
    	agendamento.setEspecialidade(especEscolhida);
    	WindowManager.seguinte(agendamento);

    }
    

}
