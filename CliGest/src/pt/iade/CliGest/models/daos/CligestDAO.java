/*package pt.iade.CliGest.models.daos;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pt.iade.CliGest.models.Medico;
import pt.iade.CliGest.models.Paciente;
import pt.iade.CliGest.models.Utilizador;
import pt.iade.CliGest.models.Agendamento;

public final class CligestDAO {
	
	private CligestDAO() {}

	private static ObservableList<Medico> medicos =
			FXCollections.observableArrayList();

	public static ObservableList<Medico> getNome() {
		return medicos;
	}
	
	// A static block is called the first time the class
	// is used 
	// We will use it to initialize all static attributes
	static {
		ObservableList<Medico> medicos = 
				FXCollections.observableArrayList();
		medicos.add(new Medico("Compras de Natal",items));
		// I can add items after adding the lost to shoplist
		// The shoplist has a reference to the same list as "items"
		medicos.add(new Medico(1,new Product("Peru 2kg",10.4)));
		items.add(new Item(4.0,new Product("Batatas",0.9)));
		items.add(new Item(0.5,
				new ImportedProduct("Chocolate Belga",2.3,"França","L&A")));
		items = FXCollections.observableArrayList();
		shopLists.add(new ShopList("Compras de Novembro",items));
		items.add(new Item(4.0,new Product("Batatas",0.9)));
		items.add(new Item(4.0,new Product("Cebolas",0.56)));
	}
}


*/