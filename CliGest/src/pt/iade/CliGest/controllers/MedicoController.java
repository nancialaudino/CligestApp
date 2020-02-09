package pt.iade.CliGest.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.PropertyValueFactory;
import pt.iade.CliGest.WindowManager;
import pt.iade.CliGest.models.Agendamento;
import pt.iade.CliGest.models.Especialidade;
import pt.iade.CliGest.models.Medico;
import pt.iade.CliGest.models.daos.CligestDAO;


/**Esta classe e a responsavel pela seleccao do medico para o agendamento.
 *Recebe o agendamento, ja com a especialidade inserida
 *no controlador anterior. Ao ser clicado o botao avançar
 *leva-nos a pagina para a seleccao do paciente e envia o 
 *medico que foi escolhido.*/

public class MedicoController { 
	private String medicoEscolhido;
	@FXML
    private ListView<Medico> medicoLV;
	private ObservableList<Medico> medicos;
	private Agendamento agendamento;
	
	public MedicoController(Agendamento agendamento) {
		this.agendamento = agendamento;
	}
	/**Metodo responsavel por obter todos os medicos*/
	@FXML
	private void initialize () {
		medicos = CligestDAO.getMedicos();
		medicoLV.setItems(medicos);
		
    	/*ObservableList<String> nomes = FXCollections.observableArrayList();
    	for(int i = 0; i < medicos.size(); i++ ) {
    		nomes.add(medicos.get(i).getNome());
    		
    	}
    	
    	medicoLV.setItems(nomes);
    	
    	medicoLV.getSelectionModel();
    	
    	medicoLV.setOnMouseClicked(
    			(event) ->{
    				medicoEscolhido = medicoLV.getSelectionModel().getSelectedItem();
    				System.out.println(medicoEscolhido);
    			});
		*/
	} 
    
	   /**Metodo usado para saltar para a pagina seguinte
	    * onde e feita a escolha do Paciente*/
	    @FXML
	    void avancar (ActionEvent event) {
		Medico medicoEscolhido = medicoLV.getSelectionModel().getSelectedItem();
    	agendamento.setMedico (medicoEscolhido);
    	WindowManager.selectPaciente(agendamento);

	    }
	    /**Metodo usado para voltar para a pagina anterior
		 * onde e feita a escolha da especialidade*/
	    @FXML
	    void voltar (ActionEvent event) {
	    WindowManager.agendarConsulta();

	    }
	    
	    @FXML
	    void fechar (ActionEvent event) {
	    WindowManager.openMenuWindow();

	    }

}
