package pt.iade.CliGest.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import pt.iade.CliGest.WindowManager;
import pt.iade.CliGest.models.Agendamento;

/**Classe responsavel pelo menu principal da aplicacao*/
public class MenuController {
	public Agendamento agendamento;
	    
	/**Metodo para sair da aplicacao, ou seja, ir a janela 
	 * do login*/
    @FXML
    private void sair(ActionEvent event) {
    	WindowManager.sairDaAplicação();
    	
    }
    
    /**Metodo para fazer um agendamento*/
    @FXML
    private void agendar (ActionEvent event) {
    	WindowManager.agendarConsulta();
    	
    }
    /**Metodo para ver a lista dos agendamentos inseridos na base de dados*/
    @FXML
    void verAgendamentos(ActionEvent event) {
    	WindowManager.listaAgendamentos(agendamento);
    }

    
    /**Metodo para ver a lista de pacientes da base de dados*/
    @FXML
    void verListaPacientes(ActionEvent event) {
    	WindowManager.verPacientes();
    	
    }
    
    /**Metodo para ver a lista de medicos da base de dados*/
   
    @FXML
    void verListaMedicos(ActionEvent event) {
    	WindowManager.verMedicos(); 

    }
    
    
    
    
    
}
