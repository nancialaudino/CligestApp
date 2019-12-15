package pt.iade.CliGest.models;

public class Especialidade {
	private String nomeEspecialidade;
	private int idEspecialidade;

	public Especialidade(String nomeEspecialidade, int idEspecialidade ) {
		
		this.nomeEspecialidade = nomeEspecialidade;
		this.idEspecialidade = idEspecialidade;
		
	}

	public int getIdEspecialidade() {
		return idEspecialidade;
	}

	public void setIdEspecialidade(int idEspecialidade) {
		this.idEspecialidade = idEspecialidade;
	}

	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}

	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}

	@Override
	public String toString() {
		return nomeEspecialidade ;
	}
	



}
