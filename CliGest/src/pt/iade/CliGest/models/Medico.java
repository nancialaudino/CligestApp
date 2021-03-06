package pt.iade.CliGest.models;

/**Classe que representa o medico. Recebe o nome e o id do medico
 * que serao usados para fazer o agendamento*/

public class Medico  {
	private String nome;
	private int idMedico;
	
	public Medico(String nome, int idMedico) {
		this.nome = nome;
		this.idMedico = idMedico;
		
	}

	public int getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}

}