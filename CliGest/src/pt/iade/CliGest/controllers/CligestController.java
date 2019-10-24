package pt.iade.CliGest.controllers;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class CligestController {
	@FXML
	private ListView<String> cligestT ;
	
	private ObservableList<String> cligest = FXCollections.observableArrayList();
			
	@FXML		
	private void initialize() {
		cligestT.setItems(cligest);
		cligest.add ("Consultas");
		cligest.add ("Clientes");
		cligest.add ("Médicos");
		cligest.add ("Marcação de Exame");

}
}
