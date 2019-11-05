package pt.iade.CliGest.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import pt.iade.CliGest.WindowManager;

public class MedicoController {
	 @FXML
	    void avancar(ActionEvent event) {

	    }

	    @FXML
	    void voltar(ActionEvent event) {
	    	
	    	WindowManager.agendarConsulta();

	    }

}
