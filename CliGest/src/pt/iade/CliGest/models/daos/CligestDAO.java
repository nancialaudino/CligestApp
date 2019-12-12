package pt.iade.CliGest.models.daos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pt.iade.CliGest.models.Login;
import pt.iade.CliGest.models.Medico;
import pt.iade.CliGest.models.Utilizador;
import pt.iade.CliGest.models.Agendamento;
import pt.iade.CliGest.models.Especialidade;


public class CligestDAO {
	
	/** Metodo que vai buscar os dados de Logins dentro
	 * base de dados. */
	
	public static ObservableList <Login> getLogins() {
		ObservableList<Login> logins =
				FXCollections.observableArrayList();
		Connection conn =  DBConnector.getConnection();
		try (Statement stat = conn.createStatement();
				ResultSet rs = 
						stat.executeQuery("Select * from Login"))
		{
			while (rs.next()) {
				String username= rs.getString("Login");
				int pass = rs.getInt("Password");
				logins.add(new Login(pass,username));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}  

		return logins;
		
	}
	
	
	/** Metodo que vai buscar os dados dos utilizadores dentro
	 * base de dados. */
	
	public static ObservableList <Utilizador> getUtilizadores() {
		ObservableList<Utilizador> utilizadores =
				FXCollections.observableArrayList();
		Connection conn =  DBConnector.getConnection();
		try (Statement stat = conn.createStatement();
				ResultSet rs = 
						stat.executeQuery("select nome_utilizador from Utilizador join Categoria on categoria_id=cid where nome_categoria = 'Paciente'"))
		{
			while (rs.next()) {
				String nome = rs.getString("nome_utilizador");
				utilizadores.add(new Utilizador (nome));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

		return utilizadores;
				
	}
	

	
	
	/** Metodo que vai buscar os dados dos médicos dentro
	 * base de dados.*/
	public static ObservableList <Medico> getMedicos() {
		ObservableList<Medico> medicos =
				FXCollections.observableArrayList();
		Connection conn =  DBConnector.getConnection();
		try (Statement stat = conn.createStatement();
				ResultSet rs = 
						stat.executeQuery("Select nome_medico from Medico"))
		{
			while (rs.next()) {
				String nome = rs.getString("nome_medico");
				//String especialidade = rs.getString("Especialidade");
				//double contacto = rs.getDouble("Contacto");
				medicos.add(new Medico(nome));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

		return medicos;
				
	}
	
	/** Metodo que vai buscar os dados da Especialidade dentro
	 * base de dados.*/
	public static ObservableList <Especialidade> getEspecialidades() {
		ObservableList<Especialidade> especialidades =
				FXCollections.observableArrayList();
		Connection conn =  DBConnector.getConnection();
		try (Statement stat = conn.createStatement();
				ResultSet rs = 
						stat.executeQuery("Select nome_especialidade from Especialidade"))
		{
			while (rs.next()) {
				String nomeEspecialidade = rs.getString("nome_especialidade");
				especialidades.add (new Especialidade (nomeEspecialidade));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

		return especialidades;
				
	}
	
	
	
	/** Metodo que vai buscar os dados de agendamentos dentro
	 * base de dados.*/
	public static ObservableList <Agendamento> getAgendamentos() {
		ObservableList<Agendamento> agendamentos =
				FXCollections.observableArrayList();
		Connection conn =  DBConnector.getConnection();
		try (Statement stat = conn.createStatement();
				ResultSet rs = 
						stat.executeQuery("Select data_consulta from Agendamento"))
		{
			while (rs.next()) {
				String medico = rs.getString("Médico");
				String especialidade = rs.getString("Especialidade");
				String paciente = rs.getString("Paciente");
				String data = rs.getString("Data");
				String hora = rs.getString("Hora");
				agendamentos.add(new Agendamento(medico,especialidade,paciente, data, hora));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

		return agendamentos;
				
	}
	
	
	
}