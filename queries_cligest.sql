####### selects para a tabela Utilizador ########
select * from Utilizador;

select nome_utilizador as 'Paciente', data_nascimento as 'Data de Nascimento', email as 'Email',
		genero as 'Sexo', nr_contribuinte as 'Contribuinte', 
        morada as 'Morada', cod_postal as 'Código Postal' from Utilizador;
        
-- A Query abaixo foi implementada no projeto. É responsável por fazer a selecção de todos 
-- os utilizadores cuja categoria seja "Paciente".

select nome_utilizador from Utilizador join Categoria on categoria_id=cid where nome_categoria = 'Paciente';


select nome_utilizador, email, data_nascimento, nome_categoria from Utilizador join Categoria
		where categoria_id = cid order by nome_utilizador; 
        
select nome_utilizador, email, data_nascimento, nome_seguradora from Utilizador join Seguradora
		where seguradora_id = sid order by nome_utilizador;  


###### selects para a tabela Médico   #######

select * from Medico; #Mostrar todos campos da tabela medico
              select nome_medico, nome_especialidade from Medico join Especialidade
               where especialidade_id = eid; # consulta de médico e as suas devidas especialidades 
               
-- A qquery abaixo foi implementada no projeto. Devolve o nome do médico               
Select nome_medico from Medico ;

         
#####  selects para a tabela Espeecialidade ########
select * from Especialidade;

-- A query abaixo foi implementada no projeto. Devolve o nome da especialidade              
Select nome_especialidade from Especialidade ;
  
  
###### selects para a tabela Agendamento ########
 select*from Agendamento;

 select aid, nome_utilizador from Agendamento join Utilizador
              where utilizador_id = uid order by nome_utilizador;

-- A Query abaixo foi implementada no projeto. É usada para filtrar os dados dos agendamentos atraves da união 
-- de cada uma das tabelas. Devolve os nomes: do médico, da especialidade, do médico, bem como as respetivas horas 
-- e datas da consulta. 

select Especialidade.nome_especialidade as 'Especialidade', Especialidade.eid, Utilizador.nome_utilizador as 'Paciente', Medico.nome_medico as 'Médico', Agendamento.data_consulta as 'Data', Agendamento.hora_consulta as 'Hora'
 FROM Agendamento JOIN Especialidade ON Agendamento.especialidade_id = Especialidade.eid JOIN Utilizador ON Agendamento.utilizador_id = uid 
 JOIN Medico ON Agendamento.medico_id=Medico.mid; 



#selects para a tabela Categoria
 select * from Seguradora;
 select * from Seguradora order by nome_seguradora; 

#### selects para a tabela Categoria ######
select * from Categoria;
            
Select nome_categoria from Categoria ;


#selects para a tabela Login
select * from Login order by lid;