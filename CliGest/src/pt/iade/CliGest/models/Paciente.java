package pt.iade.CliGest.models;

public class Paciente extends Utilizador {
	private String seguradora;
	private String relatorioMedico;
	private String exames;
	public String getSeguradora() {
		return seguradora;
	}
	
	public void setSeguradora(String seguradora) {
		this.seguradora = seguradora;
	}
	
	public String getRelatorioMedico() {
		return relatorioMedico;
	}
	
	public void setRelatorioMedico(String relatorioMedico) {
		this.relatorioMedico = relatorioMedico;
	}
	
	public String getExames() {
		return exames;
	}
	
	public void setExames(String exames) {
		this.exames = exames;
	}

	
}
