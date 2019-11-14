package pt.iade.CliGest.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import pt.iade.CliGest.WindowManager;

public class MenuController {
	
	    
    @FXML
    private void sair(ActionEvent event) {
    	WindowManager.sairDaAplicação();
    	
    }
    
    
    @FXML
    private void agendar (ActionEvent event) {
    	WindowManager.agendarConsulta();
    	
    }
}