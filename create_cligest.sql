#create database cliGestApp;

use cliGestApp;


create table Utilizador (uid int not null auto_increment,
					 nome_utilizador varchar(60) not null, #nome do utilizador
					 data_nascimento varchar(30), 
					 genero char(1) not null, 
					 email varchar(30), 
					 nr_contribuinte bigint not null,
                     morada varchar(30), cod_postal varchar(20), seguradora_id int, categoria_id int,
                     login_id int, 
					 primary key (uid));
            
            

create table Categoria (cid int not null auto_increment , nome_categoria varchar (60)  not null,
						primary key (cid));  #tipo de utilizador que acede à aplicação. Pode ser Admnistrador ou Paciente


#Tabela resultante da relação n:m entre a tabela Utilizador e Categoria
create table TipoUtilizador (tid int not null auto_increment, categoria_id int not null , utilizador_id int not null,
							primary key (tid));  
					
                    
 create table Login (lid int not null auto_increment , login varchar(30), palavrapasse varchar (30),
						primary key (lid)); 
 
 
 


create table Medico (mid int not null auto_increment,
					 nome_medico varchar(60) not null, 
					 data_nascimento varchar(30), 
					 genero char(1) not null,
                     telefone bigint,
					 email varchar(30), 
					 nr_contribuinte bigint, especialidade_id int not null,
					 primary key (mid));

             
              
              
create table Especialidade (eid int not null auto_increment,
					 nome_especialidade varchar(60) not null, 
					 primary key (eid));
                     
                    
                 
                 
create table Seguradora (sid int not null auto_increment , nome_seguradora varchar(60), data_validade_cartao date,
						primary key (sid));
 
 
 
create table Agendamento (aid int not null auto_increment,
					 especialidade_id int not null, 
                     medico_id int  not null, utilizador_id int  not null, data_consulta date not null, 
                     hora_consulta time  not null, 
					 primary key (aid));



# Chaves Estrangeiras

alter table Utilizador add constraint utilizador_fk_login
            foreign key (login_id) references Login(lid) 
			ON DELETE NO ACTION ON UPDATE NO ACTION; 
 
alter table Utilizador add constraint utilizador_fk_seguradora
            foreign key (seguradora_id) references Seguradora(sid) 
			ON DELETE NO ACTION ON UPDATE NO ACTION;
            
alter table Utilizador add constraint Utilizador_fk_categoria
            foreign key (categoria_id) references Categoria(cid) 
			ON DELETE NO ACTION ON UPDATE NO ACTION; 

alter table TipoUtilizador add constraint tipo_fk_utilizador
            foreign key (utilizador_id) references Utilizador (uid)
            ON DELETE NO ACTION ON UPDATE NO ACTION;
            

alter table TipoUtilizador add constraint tipo_fk_categoria
            foreign key (categoria_id) references Categoria (cid)
            ON DELETE NO ACTION ON UPDATE NO ACTION;
            
alter table Medico add constraint medico_fk_especialidade
            foreign key (especialidade_id) references Especialidade(eid) 
			ON DELETE NO ACTION ON UPDATE NO ACTION; 
            
alter table Agendamento add constraint agendamento_fk_especialidade
            foreign key (especialidade_id) references Especialidade(eid) 
			ON DELETE NO ACTION ON UPDATE NO ACTION;             

alter table Agendamento add constraint agendamento_fk_medico
            foreign key (medico_id) references Medico(mid) 
			ON DELETE NO ACTION ON UPDATE NO ACTION;      
            
alter table Agendamento add constraint agendamento_fk_utilizador
            foreign key (utilizador_id) references Utilizador(uid) 
			ON DELETE NO ACTION ON UPDATE NO ACTION;      
            
            
