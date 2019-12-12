 package pt.iade.CliGest.controllers;
import java.awt.Label;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import pt.iade.CliGest.Main;
import pt.iade.CliGest.WindowManager;
import pt.iade.CliGest.controllers.MenuController;
import pt.iade.CliGest.models.Utilizador;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.ObservableList;


public class LoginController {

    @FXML
    private AnchorPane cligestT;

    @FXML
    private Button loginBT;

    @FXML
    private TextField usernameBT;

    @FXML
    private PasswordField passwordBT;
    
    @FXML
    private Text labelstatusLB;
    
    
    /** Método que faz a autenticação do utilizador
     * Verfifica se o username e a password estão corretos
     * para que o utilizador possa aceder à aplicação, se tiverem 
     * incorretos devolve um erro. */
    @FXML
    public void loginTela (ActionEvent event) throws IOException {
    	if (usernameBT.getText().equals("user") && passwordBT.getText().equals("12345")) {
    		WindowManager.openMenuWindow();
    		
	     }else {
	    	 Alert alert = new Alert (AlertType.ERROR);
	    	 alert.setTitle("Erro!");
	    	 alert.setHeaderText("Username ou password inválidos");
	    	 alert.setContentText("Verifique se inseriu os campos corretamente. Tenha em atenção as letras miúsculas ou minúsculas.");
	    	 alert.show();
    	    //labelstatusLB.setText("Username ou Password incorretos");
    }
    	
	
	
	
  
	    		
	
	        

    	
    }

	

}






