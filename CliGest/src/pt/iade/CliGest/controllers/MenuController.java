package pt.iade.CliGest.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import pt.iade.CliGest.WindowManager;
import pt.iade.CliGest.models.Agendamento;

public class MenuController {
	public Agendamento agendamento;
	    
    @FXML
    private void sair(ActionEvent event) {
    	WindowManager.sairDaAplicação();
    	
    }
    
    @FXML
    private void agendar (ActionEvent event) {
    	WindowManager.agendarConsulta();
    	
    }
    
    @FXML
    void verAgendamentos(ActionEvent event) {
    	WindowManager.listaAgendamentos(agendamento);
    }

    
    
    @FXML
    void verListaPacientes(ActionEvent event) {
    	WindowManager.verPacientes();
    	
    }
    
   
    @FXML
    void verListaMedicos(ActionEvent event) {
    	WindowManager.verMedicos(); 

    }
    
    
    
    
    
}
