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

/**Esta classe e a responsavel pela seleccao da especialidade para o agendamento.
 *Recebe um agendamento. Ao ser clicado o botao seguinte
 *leva-nos a pagina para a seleccao do medico e envia o agendamento com a
 *especialidade que foi escolhida.*/

public class EspecialidadeController {
	/**variavel que guarda a informacao de qual especialidade foi selecionada*/
	private String especEscolhida;
	private Agendamento agendamento = new Agendamento();
	@FXML
    private ListView<Especialidade> especialidadeLV;
    private ObservableList<Especialidade> especialidades;
    
    
	/**Metodo responsavel por obter todas as especialidades*/
    @FXML
	private void initialize () {
    	especialidades = CligestDAO.getEspecialidades();
    	especialidadeLV.setItems(especialidades); 	
    	
	}
 
    /**Metodo usado para saltar para a pagina anterior
	 * ou seja, no menu principal*/
    
    @FXML
    void anterior(ActionEvent event) {
    	WindowManager.openMenuWindow();

    }
     
    /**Metodo usado para saltar para a pagina seguinte
	 * onde e feita a escolha do Medico*/
    @FXML
    void seguinte(ActionEvent event) {
		Especialidade especEscolhida = especialidadeLV.getSelectionModel().getSelectedItem();
    	agendamento.setEspecialidade(especEscolhida);
    	WindowManager.seguinte(agendamento);

    }
    

}
