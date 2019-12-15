package pt.iade.CliGest.models;

public class Agendamento {
	private Medico medico;
	private Especialidade especialidade;
	private Utilizador paciente;
	private String data;
	private String hora;
	private int idAgendamento;

	public Agendamento(int idAgendamento, Medico medico, Especialidade especialidade, Utilizador paciente, String data, String hora) {
		this.medico = medico;
		this.especialidade = especialidade;
		this.paciente = paciente;
		this.data = data;
		this.hora = hora;
		this.idAgendamento= idAgendamento;
	}
	
	
	public int getIdAgendamento() {
		return idAgendamento;
	}


	public void setIdAgendamento(int idAgendamento) {
		this.idAgendamento = idAgendamento;
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
	
	public String toString() {
		return "Médico: " + medico.getNome() + "; " + "Especialidade: " + especialidade.getNomeEspecialidade() + "; " + "Paciente: "+ paciente.getNome() + "; " + "Data: "+ data + "; " + "Hora:" + hora; 
	}
	
	
	

}
