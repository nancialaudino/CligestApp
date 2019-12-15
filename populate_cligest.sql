insert into Login (lid, login, palavrapasse) values (1, 'admnin1', '22222'); 
insert into Login (lid, login, palavrapasse) values (2, 'admnin2', '33333');
insert into Login (lid, login, palavrapasse) values (3, 'user1', '44444');
insert into Login (lid, login, palavrapasse) values (4, 'user2', '55555');
insert into Login (lid, login, palavrapasse) values (5, 'user3', '00000'); 
insert into Login (lid, login, palavrapasse) values (6, 'user4', '11111'); 


insert into Categoria (cid, nome_categoria) values (1, 'Admnistrador'); 
insert into Categoria (cid, nome_categoria) values (2, 'Paciente') ; 


insert into Seguradora (sid, nome_seguradora, data_validade_cartao) values (1, 'Lusitania', str_to_date('2020.02.03','%Y.%m.%d'));
insert into Seguradora (sid, nome_seguradora, data_validade_cartao) values (2, 'Advance Care', str_to_date('2021.02.03','%Y.%m.%d'));
insert into Seguradora (sid, nome_seguradora, data_validade_cartao) values (3, 'Multicare', str_to_date('2022.02.03','%Y.%m.%d'));
insert into Seguradora (sid, nome_seguradora, data_validade_cartao) values (4, 'Medicare', str_to_date('2023.02.03','%Y.%m.%d'));
insert into Seguradora (sid, nome_seguradora, data_validade_cartao) values (5, 'Allianz', str_to_date('2019.02.03','%Y.%m.%d'));


insert into Utilizador (uid, nome_utilizador, data_nascimento, genero, email, nr_contribuinte, morada, cod_postal,seguradora_id, categoria_id, login_id) values (1, 'Francisco Manuel António',str_to_date('1988.02.03','%Y.%m.%d'),'M','fantonio@gmail.com',293020938, 'rua do Lumiar nr 12','1750-999', 1, 2, 5); 
insert into Utilizador (uid, nome_utilizador, data_nascimento, genero, email, nr_contribuinte, morada, cod_postal, seguradora_id, categoria_id, login_id) values (2, 'Manuela de Fátima Francisco',str_to_date('1988.02.03','%Y.%m.%d'),'F','manuela@gmail.com',29877889, 'rua da verdade nr 2','1750-999', 2, 2, 6); 
insert into Utilizador (uid, nome_utilizador, data_nascimento, genero, email, nr_contribuinte, morada, cod_postal, seguradora_id, categoria_id, login_id) values (3, 'Maria Jacinto Lopes',str_to_date('1968.02.03','%Y.%m.%d'),'F','marialopes@gmail.com',29867687, 'rua da china nr 72','1750-999', 3, 2, 4); 
insert into Utilizador (uid, nome_utilizador, data_nascimento, genero, email, nr_contribuinte, morada, cod_postal, seguradora_id, categoria_id, login_id) values (4, 'João Emanuel Fernando',str_to_date('1948.02.03','%Y.%m.%d'),'M','joaofernando@gmail.com',278578799, 'rua do oriente nr 190','1750-999', 4, 2,3); 
insert into Utilizador (uid, nome_utilizador, data_nascimento, genero, email, nr_contribuinte, morada, cod_postal, seguradora_id, categoria_id, login_id) values (5, 'Ricaedo Fonseca da Silva',str_to_date('1958.02.03','%Y.%m.%d'),'M','rickysilva@gmail.com',767857, 'rua dos anjos nr 128','1750-999', null, 1, 2); 
insert into Utilizador (uid, nome_utilizador, data_nascimento, genero, email, nr_contribuinte, morada, cod_postal, seguradora_id, categoria_id, login_id) values (6, 'Antónia Miranda Tomás',str_to_date('1968.02.03','%Y.%m.%d'),'F','toninha@gmail.com',877907, 'rua de alvalade nr 1','1750-999', null, 1, 1);


insert into TipoUtilizador (tid,categoria_id, utilizador_id) values (1,1,1);
insert into TipoUtilizador (tid,categoria_id, utilizador_id) values (2,1,2);
insert into TipoUtilizador (tid,categoria_id, utilizador_id) values (3,1,3);
insert into TipoUtilizador (tid,categoria_id, utilizador_id) values (4,1,4);
insert into TipoUtilizador (tid,categoria_id, utilizador_id) values (5,2,5);
insert into TipoUtilizador (tid,categoria_id, utilizador_id) values (6,2,6);



insert into Especialidade (eid, nome_especialidade) values (1, 'Cardiologia') ; 
insert into Especialidade (eid, nome_especialidade) values (2, 'Psicologia') ;
insert into Especialidade (eid, nome_especialidade) values (3, 'Medicina Geral') ;
insert into Especialidade (eid, nome_especialidade) values (4, 'Neurologia') ;
insert into Especialidade (eid, nome_especialidade) values (5, 'Nutrição') ;
insert into Especialidade (eid, nome_especialidade) values (6, 'Oftamologia') ;
insert into Especialidade (eid, nome_especialidade) values (7, 'Psiquiatria') ; 
insert into Especialidade (eid, nome_especialidade) values (8, 'Dermatologia') ;






insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (1, 'António Francisco', 'M',934567888, 'antonio@sapo.pt',513253782,1);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (2, 'Manuel Lopes', 'M',213678665, 'manuel@sapo.pt',212893827,2);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (3, 'José Santos', 'M', 934567899,'jose@sapo.pt',112908765,3);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (4, 'Jorge Bernardo', 'M',93546789, 'jorge@sapo.pt',510987654,2);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (5, 'Francisco Guimarães', 'F', 912345627,'francis@sapo.pt',192834736,5);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (6, 'Jõao Azevedo', 'F',914567890, 'jonh@sapo.pt',192938482,4);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (7, 'Sesbastião Magalhães', 'M',922880765, 'sebas@sapo.pt',521537639,4);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (8, 'Joaquim santos', 'M',944226611, 'joca@sapo.pt',235274824,8);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (9, 'Joana Barros', 'F',211908765, 'jbarros@sapo.pt',532782347,4);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (10, 'Erickson Nataniel', 'M',210251738, 'erickNat@sapo.pt',127387937,4);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (11, 'Madalena Paulo', 'F',223344556, 'madaPaulo123@sapo.pt',238646481,3);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (12, 'Ana Francisco', 'F',987654321, 'aninha98@sapo.pt',578826329,7);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (13, 'Silva e Silva', 'M',987623546, 'silsil10@sapo.pt',142524694,2);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (14, 'Salomé Franco', 'F',987654321, 'francoSalome@sapo.pt',283478424,1);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (15, 'Denise Manuela', 'F',213456789, 'deni1978@sapo.pt',223349874,5);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (16, 'Zenilda Cardoso', 'F',98765412, 'zen@sapo.pt',124384709,6);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (17, 'Xico Xavier', 'M',214273489, 'xiquinho1946@sapo.pt',129478453,8);
insert into Medico (mid, nome_medico, genero, telefone, email,nr_contribuinte, especialidade_id ) values (18, 'Pedro Almeida', 'M',210234567, 'peter2@sapo.pt',516548364,7);


insert into Agendamento (aid, especialidade_id, medico_id, utilizador_id, data_consulta , hora_consulta) values (1, 2, 3, 5, str_to_date('2019.12.25','%Y.%m.%d'), '12:50');
insert into Agendamento (aid, especialidade_id, medico_id, utilizador_id, data_consulta , hora_consulta) values (2, 4, 4, 6, str_to_date('2020.2.25','%Y.%m.%d'), '12:00');
insert into Agendamento (aid, especialidade_id, medico_id, utilizador_id, data_consulta , hora_consulta) values (3, 1, 1, 4, str_to_date('2019.3.30','%Y.%m.%d'), '15:50');
insert into Agendamento (aid, especialidade_id, medico_id, utilizador_id, data_consulta , hora_consulta) values (4, 5, 2, 3, str_to_date('2020.6.25','%Y.%m.%d'), '17:50');
insert into Agendamento (aid, especialidade_id, medico_id, utilizador_id, data_consulta , hora_consulta) values (5, 6, 3, 2, str_to_date('2020.1.25','%Y.%m.%d'), '11:50');
insert into Agendamento (aid, especialidade_id, medico_id, utilizador_id, data_consulta , hora_consulta) values (6, 3, 1, 1, str_to_date('2019.12.2','%Y.%m.%d'), '8:00');
insert into Agendamento (aid, especialidade_id, medico_id, utilizador_id, data_consulta , hora_consulta) values (7, 2, 4, 6, str_to_date('2020.06.25','%Y.%m.%d'), '14:50');
insert into Agendamento (aid, especialidade_id, medico_id, utilizador_id, data_consulta , hora_consulta) values (8, 6, 2, 3, str_to_date('2020.07.6','%Y.%m.%d'), '10:50');
insert into Agendamento (aid, especialidade_id, medico_id, utilizador_id, data_consulta , hora_consulta) values (9, 1, 1, 4, str_to_date('2020.08.5','%Y.%m.%d'), '18:50');







commit;


