# cliGest
## Programação Orientada por Objetos
## Bases de Dados

###### Autores:
###### Nancia Laudino - 50036506
###### Douglas Bewiahn - 50038630







**Enquadramento**

Este documento representa o Briefing do projeto no âmbito da unidade curricular Programação Orientada por Objectos em conjunto com a unidade curricular Bases de Dados, do curso de Engenharia Informática da Universidade Europeia. Um documento que descreve as principais etapas/funcionalidades de uma aplicação.
A gestão de clientes tem sido um dos grandes problemas que muitas empresas enfrentam, não só pelo fluxo de informação que é gerado mas também devido aos recursos utilizados para se fazer essa gestão. Para solucionar esta problemática, criamos o cliGest, uma aplicação que está virada para empresas no ramo da saúde, mais propriamente clínicas, de forma a permitir aos gestores um melhor controle de toda a informação relevante, com a finalidade de gerir as agendas de cada médico/cliente para a marcação e realização de consultas. Consideramos que a organização dentro de uma empresa é um factor muito importante e que o atendimento rápido e eficiente é um ponto crucial para fidelizar clientes.

**Cenário Principal**

Um dos objetivos principais da nossa aplicação é a implementação de um conjunto de medidas que visam garantir a integridade da informação armazenada bem como uma gestão segura no acesso à mesma. O Agendamento de consultas será o nosso cenário principal, ou seja, a principal funcionalidade da nossa aplicação. Criaremos uma sistema que permitirá aos admnistradores fazer uma melhor gestão de toda a informação existente dentro do cliGest. O admnistrador representa a pessoa responsável por toda a gestão dos dados, é o único que pode criar novos utilizadores e consultar toda a informacão do cliGest de forma geral. Admistradores, Pacientes e Médicos fazem parte de uma entidade que se chama Utilizador e necessitarão de um login e uma password para aceder à informações da aplicação, mas no cenário principal o nosso foco principal é o Admnistrador como gestor da aplicação no que diz respeito a agendamento de consultas e acesso à informações. Um admnistrador:
*Faz Login
*Insere novo utilizador
*Edita informações de utilizadores
*Elimina utilizadores
*Faz agendamentos
*Cancela agendamentos
*Visualiza relatórios médicos
*Visualiza exames médicos



**Dentro da Base de dados onde só um admnistrador terá acesso, teremos alguns módulos importantes citados abaixo**

*Gestão de Clientes:*

Neste módulo será possível fazer a gestão de clientes. Será gerado um código interno que será associado a cada cliente (*id_cliente*). Terá de obedecer ainda os seguintes critérios:

* o número de identificação deve estar preenchido e tem 9 dígitos;
* o nome do cliente não deve ser nulo;
* o código do atleta é único e não estar associado a outra entidade da base de dados;
* a morada do cliente é não nula;
* o código postal deve ser preenchido e possui 7 dígitos;
* a nacionalidade deve ser preenchida;
* a localidade deve ser preenchida;
* a data de nascimento deve ser uma data válida;
* o telemóvel do cliente é não nulo e tem 9 dígitos;
* o e-mail deve ser preenchido.

*Gestão de Médicos:*

Neste módulo será possivel fazer a gestão de médicos. Será gerado um código interno que será associado a cada consulta (*id_medico*). Terá de obedecer ainda os seguintes critérios:

* o nome do médico não deve ser nulo;
* o número de identificação deve ser preenchido e tem 9 dígitos;
* a morada do médico é não nula;
* o código postal deve estar preenchido e possui 7 dígitos;
* a nacionalidade não deve ser nula;
* a localidade não deve ser nula;
* a data de nascimento deve ser uma data válida;
* o telemóvel do médico não deve ser nulo e possui 9 dgitos;
* o número da cédula profissional não deve ser nulo e possui
* 9 dígitos (deve ser único na base de dados);
* o e-mail deve ser preenchido.


Enquadramento

Em um cenário onde ainda existem clinicas e consultorios que não fazem o controle informatizado de cadastro de pacientes e agenda, devido tanto a falta de ferramentas intuitivas ou de recursos financeiros pensamos no CliGest, uma aplicação simples e eficiente de gestão de clínicas onde será possível cadastrar e agendar pacientes, de acordo com as disponibilidades dos médicos, agilizando e facilitando o controle das consultas. Os medicos terao acesso aos dados dos pacientes previamente cadastrados e poderão adicionar informações em forma de um prontuário eletrônico, permitindo um histórico fiável das consultas e procedimentos efetuados.

Cenário Principal

O usuário poderá alocar os pacientes cadastrados a um slot de tempo de um médico específico na agenda, neste slot será disponibilizado informações básicas do paciente como nome e telefone, caso seja necessário um contato rápido, haverá também uma indicação visual se o paciente foi confirmado para a consulta ou nao.

Cenário Secundário

Os usuários poderão cadastrar novos pacientes e também alterar os já existentes. No cadastro haverá um histórico em uma forma de prontuário onde poderá consultar dados relevantes como idade, peso, altura, alergias e doenças pré existentes. Os médicos poderão adicionar informações a este prontuário eletrônico, como exemplo diagnóstico do paciente, medicamentos receitados e exames solicitados.

Os pacientes terão acesso a um ambiente diferente onde poderão consultar algumas informações restritas, como exemplo agendamentos passados, futuros e exames solicitados.

Notificações automáticas de agendamento via e-mail no momento em que for realizado, quando confirmado e no dia anterior do agendamento.
