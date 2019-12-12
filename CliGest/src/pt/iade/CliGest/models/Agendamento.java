package pt.iade.CliGest.models;

public class Agendamento {
	private String medico;
	private Especialidade especialidade;
	private String paciente;
	private String data;
	private String hora;
	
	 
	public Agendamento(String medico, Especialidade especialidade, String paciente, String data, String hora) {
		this.medico = medico;
		this.especialidade = especialidade;
		this.paciente = paciente;
		this.data = data;
		this.hora = hora;
	}
	 
	public Agendamento() {
		// TODO Auto-generated constructor stub
	}

	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) {
		this.medico = medico;
	}
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade especEscolhida) {
		this.especialidade = especEscolhida;
	}
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
	

}
