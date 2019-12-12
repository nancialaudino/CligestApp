package pt.iade.CliGest.models.daos;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pt.iade.CliGest.models.Medico;


public class MedicoDAO {
	
	private MedicoDAO() {}
	
	private static ObservableList <Medico> medicos =
			FXCollections.observableArrayList();



public static ObservableList <Medico> getAllMedicos (){
	return medicos;
	
}
/*
static {
	ObservableList<Medico> medicos = 
			FXCollections.observableArrayList();
	medicos.add(new Medico("Manuel Lopes", "Cardiologia", 927883899));
	medicos.add(new Medico("Francisco Cardoso", "Psicologia", 925677789));
	medicos.add(new Medico("Manuel Lopes", "Medicina Geral", 998923893));
	}
	
	*/
}
