package pt.iade.CliGest.models;

public class Medico extends Utilizador {
	private double nrCedula;
	private String especialidade;
	
	public double getNrCedula() {
		return nrCedula;
	}
	
	public void setNrCedula(double nrCedula) {
		this.nrCedula = nrCedula;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
