package pt.iade.CliGest.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import pt.iade.CliGest.WindowManager;
import pt.iade.CliGest.models.Agendamento;

public class AgendamentoController {
	
	public Agendamento agendamento;
	
	public AgendamentoController(Agendamento agendamento){
		this.agendamento = agendamento;
	}
	
    @FXML
    private TextFlow caixaPaciente;

    @FXML
    private TextFlow caixaMedico;

    @FXML
    private TextFlow caixaEspecialidade;

    @FXML
    private TextField caixaHora;

    @FXML
    private TextField caixaData;
	
	
	@FXML
    void agendar (ActionEvent event) {
		WindowManager.openMenuWindow();
		

    }
	
	public void initialize() {
		caixaPaciente.getChildren().add(new Text(agendamento.getPaciente().getNome()));
		caixaEspecialidade.getChildren().add(new Text(agendamento.getEspecialidade().getNomeEspecialidade()));
		caixaMedico.getChildren().add(new Text(agendamento.getMedico().getNome()));
		
		agendamento.setData(caixaData.getText());
		agendamento.setHora(caixaHora.getText());
		
		
		
		
	}
 
 
}