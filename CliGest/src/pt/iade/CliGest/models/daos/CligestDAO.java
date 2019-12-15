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

/**Classe responsável pela abstração e encapsulamento de dados da base dados
 * @autor: Nancia Laudino - 50036506 */


public class CligestDAO {
	
	/** Metodo que vai buscar os dados de Logins dentro
	 * base de dados. 
	 * @return Login - Uma observable list com os logins*/
	
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
	 * base de dados.
	 * @return Utilizador - Uma observable list com os nomes dos utilizadores */
	
	public static ObservableList <Utilizador> getUtilizadores() {
		ObservableList<Utilizador> utilizadores =
				FXCollections.observableArrayList();
		Connection conn =  DBConnector.getConnection();
		try (Statement stat = conn.createStatement();
				ResultSet rs = 
						stat.executeQuery("select nome_utilizador, uid from Utilizador join Categoria on categoria_id=cid where nome_categoria = 'Paciente'"))
		{
			while (rs.next()) {
				String nome = rs.getString("nome_utilizador");
				int id = rs.getInt("uid");
				utilizadores.add(new Utilizador (nome,id));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

		return utilizadores;
				
	}
	

	
	
	/** Metodo que vai buscar os dados dos médicos dentro
	 * base de dados.
	 * @return Medico - Uma observable list com os nomes dos medicos*/
	public static ObservableList <Medico> getMedicos() {
		ObservableList<Medico> medicos =
				FXCollections.observableArrayList();
		Connection conn =  DBConnector.getConnection();
		try (Statement stat = conn.createStatement();
				ResultSet rs = 
						stat.executeQuery("Select nome_medico, mid from Medico"))
		{
			while (rs.next()) {
				String nome = rs.getString("nome_medico");
				int id = rs.getInt("mid");
				medicos.add(new Medico(nome,id));
				

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

		return medicos;
				
	}
	
	/** Metodo que vai buscar os dados da Especialidade dentro
	 * base de dados.
	 *@return Especilidade - Uma observable list com os nomes das especialidades*/
	public static ObservableList <Especialidade> getEspecialidades() {
		ObservableList<Especialidade> especialidades =
				FXCollections.observableArrayList();
		Connection conn =  DBConnector.getConnection();
		try (Statement stat = conn.createStatement();
				ResultSet rs = 
						stat.executeQuery("Select nome_especialidade, eid from Especialidade"))
		{
			while (rs.next()) {
				String nomeEspecialidade = rs.getString("nome_especialidade");
				int id = rs.getInt("eid");
				especialidades.add (new Especialidade (nomeEspecialidade,id));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

		return especialidades;
				
	}
	
	/** Metodo que vai buscar os dados de agendamentos dentro
	 * base de dados. Metodo procedimental*/
	
	public static void addAgendamento (Agendamento agendamento) {
		Connection conn =  DBConnector.getConnection();
	   String sql = "INSERT INTO Agendamento (aid, especialidade_id, medico_id, utilizador_id, data_consulta , hora_consulta) VALUES (?,?,?,?,?,?)";
	   int idEspecialidade = agendamento.getEspecialidade().getIdEspecialidade();
	   int idMedico = agendamento.getMedico().getIdMedico();
	   int idPaciente = agendamento.getPaciente().getIdUtilizador();
	   int idAgendamento = agendamento.getIdAgendamento();
	   String dataConsulta = agendamento.getData();
	   String horaConsulta = agendamento.getHora();
	   
	   try (PreparedStatement stat = conn.prepareStatement(sql)) {
			(stat).setInt(1, idAgendamento);
			(stat).setInt(2,idEspecialidade );
			(stat).setInt(3,idMedico );
			(stat).setInt(4,idPaciente );
			(stat).setString(5,dataConsulta );
			(stat).setString (6,horaConsulta );
			stat.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();

			
		} 
	   
		  
				
	}
	 
	 
	
	
	/** Metodo que vai buscar os dados de agendamentos dentro
	 * base de dados.
	 * @return Agendamento - Uma observable list com os agendamentos*/
	public static ObservableList <Agendamento> getAgendamentos() {
		ObservableList<Agendamento> agendamentos =
				FXCollections.observableArrayList();
		Connection conn =  DBConnector.getConnection();
		try (Statement stat = conn.createStatement();
				ResultSet rs = 
						stat.executeQuery("select Agendamento.aid, Especialidade.nome_especialidade, Especialidade.eid, Utilizador.nome_utilizador, Utilizador.uid, Medico.nome_medico, Medico.mid, Agendamento.data_consulta, Agendamento.hora_consulta" + 
								" FROM Agendamento JOIN Especialidade ON Agendamento.especialidade_id = Especialidade.eid JOIN Utilizador ON Agendamento.utilizador_id = uid" + 
								" JOIN Medico ON Agendamento.medico_id=Medico.mid;");
		)
		{
			while (rs.next()) {
				String medicoNome = rs.getString("nome_medico");
				int idMedico = rs.getInt("mid");
				String especialidadeNome = rs.getString("nome_especialidade");
				int idEspecialidade = rs.getInt("eid");
				String pacienteNome = rs.getString("nome_utilizador");
				int idPaciente = rs.getInt("uid");
				String data = rs.getString("data_consulta");
				String hora = rs.getString("hora_consulta");
				int idAgendamento = rs.getInt("aid");
				Medico medico = new Medico(medicoNome, idMedico);
				Especialidade especialidade = new Especialidade(especialidadeNome,idEspecialidade);
				Utilizador paciente = new Utilizador (pacienteNome,idPaciente);
				
				agendamentos.add(new Agendamento(idAgendamento,medico,especialidade, paciente, data, hora));		
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		

		return agendamentos;
				
	}
	
	
	
}