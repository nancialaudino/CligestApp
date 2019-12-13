package pt.iade.CliGest.models;

public class Agendamento {
	private Medico medico;
	private Especialidade especialidade;
	private Utilizador paciente;
	private String data;
	private String hora;
	
	
	private String medico1;
	private String especialidade1;
	private String paciente1;
	private String data1;
	private String hora1;
	 
	public Agendamento(Medico medico, Especialidade especialidade, Utilizador paciente, String data, String hora) {
		this.medico = medico;
		this.especialidade = especialidade;
		this.paciente = paciente;
		this.data = data;
		this.hora = hora;
	}
	
	public Agendamento(String medico1, String especialidade1, String paciente1, String data, String hora) {
		this.medico1 = medico1;
		this.especialidade1 = especialidade1;
		this.paciente1 = paciente1;
		this.data = data;
		this.hora = hora;
	}
	
	
	public Agendamento() {
		
	}

	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade especEscolhida) {
		this.especialidade = especEscolhida;
	}
	public Utilizador getPaciente() {
		return paciente;
	}
	public void setPaciente (Utilizador paciente) {
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
	
//	public String toString() {
//		return medico.getNome() + " " + especialidade.getNomeEspecialidade() + " " + paciente.getNome() + " " + data + " " + hora; 
//	}
	
	
	

}
