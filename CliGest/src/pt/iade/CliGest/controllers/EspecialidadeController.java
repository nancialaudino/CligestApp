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
    	/*
    	especialidadeLV.setOnMouseClicked(
    			(event) ->{
    				especEscolhida = especialidadeLV.getSelectionModel().getSelectedItem();
    				System.out.println(especEscolhida);
    			});
    	 
    	 selectedItemProperty().addListener(
				(obs,oldVal,newVal)-> {
					seguinte(newVal);
				}); */
    	
	}
 
    
    
    
    @FXML
    void anterior(ActionEvent event) {
    	WindowManager.openMenuWindow();

    }

    @FXML
    void seguinte(ActionEvent event) {
		Especialidade especEscolhida = especialidadeLV.getSelectionModel().getSelectedItem();
    	agendamento.setEspecialidade(especEscolhida);
    	WindowManager.seguinte(agendamento);

    }
    

}
