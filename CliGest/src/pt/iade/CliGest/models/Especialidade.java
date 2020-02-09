package pt.iade.CliGest.models;

/**Classe que representa a Especialidae. Recebe o nome e o id da especialidade
 * que serao usados para fazer o agendamento*/

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
