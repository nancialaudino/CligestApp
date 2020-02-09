package pt.iade.CliGest.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import pt.iade.CliGest.WindowManager;
import pt.iade.CliGest.models.Agendamento;
import pt.iade.CliGest.models.daos.CligestDAO;

/**Classe responsavel pelo agendamento de consultas.
 * E nesta classe que se encontra o botao Agendar (principal funcionalidade
 * da aplicacao)*/
public class AgendamentoController {
	
	public Agendamento agendamento;
	
	public AgendamentoController(Agendamento agendamento){
		this.agendamento = agendamento;
	}
	/**TextFlow onde aparece o nome do paciente selecionado*/
    @FXML
    private TextFlow caixaPaciente;
    /**TextFlow onde aparece o nome o medico selecionado*/
    @FXML
    private TextFlow caixaMedico;
    
    /**TextFlow onde aparece o nome da especialidade selecionada*/

    @FXML
    private TextFlow caixaEspecialidade;
    /**TextField para inserir a hora*/
    @FXML
    private TextField caixaHora;
    /**TextField para inserir a data*/
    @FXML
    private TextField caixaData;
	
    
    /** Metodo responsavel por inserir os dados do medico, paciente e especialidade
     * que foram selecionados dentro da textflow */
	public void initialize() {
		caixaPaciente.getChildren().add(new Text(agendamento.getPaciente().getNome()));
		caixaEspecialidade.getChildren().add(new Text(agendamento.getEspecialidade().getNomeEspecialidade()));
		caixaMedico.getChildren().add(new Text(agendamento.getMedico().getNome()));
				
	}
    
	/**Este metodo e responsavel por fazer o agendamento de uma consulta
	 **/
	@FXML
    void agendar (ActionEvent event) {
		agendamento.setData(caixaData.getText());
		agendamento.setHora(caixaHora.getText());
		CligestDAO.addAgendamento(agendamento);
		WindowManager.openMenuWindow();
		

    }
	
 
 
}