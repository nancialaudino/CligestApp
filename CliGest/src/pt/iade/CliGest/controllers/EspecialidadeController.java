package pt.iade.CliGest.controllers;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import pt.iade.CliGest.WindowManager;


public class EspecialidadeController {
	

    @FXML
    void anterior(ActionEvent event) {
    	WindowManager.openMenuWindow();

    }

    @FXML
    void seguinte(ActionEvent event) {
    	WindowManager.seguinte();

    }

}
