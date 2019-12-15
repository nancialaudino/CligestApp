package pt.iade.CliGest.models;

public class Utilizador {
	
	private String nome;
	private int idUtilizador;
	
	
	
	public Utilizador(String nome, int idUtilizador) {
		
		this.nome = nome;
		this.idUtilizador = idUtilizador;
		
	}



	public int getIdUtilizador() {
		return idUtilizador;
	}




	public void setIdUtilizador(int idUtilizador) {
		this.idUtilizador = idUtilizador;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome ;
	}


}
