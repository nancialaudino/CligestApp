package pt.iade.shoplist.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class ShopListController {
	
	@FXML
	private ListView<String> shoplistV ;
	
	private ObservableList<String> shoplist = FXCollections.observableArrayList();
			
	@FXML		
	private void initialize() {
		shoplistV.setItems(shoplist);
		shoplist.add ("Batata");
		shoplist.add ("Arroz");
		shoplist.add ("Cebola");
		
	}

}
