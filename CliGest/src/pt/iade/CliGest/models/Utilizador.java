package pt.iade.CliGest.models;

public class Utilizador {
	private String nome;
	private String dataNascimento;
	private String morada;
	private double codPostal;
	private String login;
	private String password;
	private double telefone;
	private Utilizador user;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getMorada() {
		return morada;
	}
	
	public void setMorada(String morada) {
		this.morada = morada;
	}
	
	public double getCodPostal() {
		return codPostal;
	}
	
	public void setCodPostal(double codPostal) {
		this.codPostal = codPostal;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public double getTelefone() {
		return telefone;
	}
	
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	public void addUtilizador (Utilizador user) {
		
	}
	
    public void editarUtilizador (Utilizador user) {
		
	}
    
    public void eliminarUtilizador (Utilizador user) {
	
    }

}
