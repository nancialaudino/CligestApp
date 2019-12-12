package pt.iade.CliGest.models;

public class Medico  {
	private String nome;
	private String especialidade;
	private double contacto;
	
	public Medico(String nome /*, String especialidade, double contacto*/) {
		this.nome = nome;
		//this.especialidade = especialidade;
		//this.contacto = contacto;
	}

	public String getNome() {
		return nome;
	}
/*
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getContacto() {
		return contacto;
	}

	public void setContacto(double contacto) {
		this.contacto = contacto;
	}

	
	*/
}