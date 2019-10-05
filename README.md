# cliGest
## P.O.O
###### Nancia Laudino - 50036506
###### Douglas Bewiahn - 50038630


 **Enquadramento**
Este documento representa o Briefing do projeto no âmbito da unidade curricular de Programação Orientada por Objectos em conjunto com a unidade curricular de Bases de Dados, do curso de Engenharia Informática da Universidade Europeia. Um documento que descreve as principais etapas/funcionalidades de uma aplicação.
A gestão de clientes tem sido um dos grandes problemas que muitas empresas enfrentam, não só pelo fluxo de informação que é gerado mas também devido aos recursos utilizados para se fazer essa gestão. Para solucionar esta problemática, criamos o cliGest, uma aplicação que está virada para empresas no ramo da saúde (ie. clinicas, hospitais, centro/posto médico, etc)  de forma a permitir aos gestores um melhor controle de toda a informção relevante, com a finalidade de gerir as agendas de cada médico/cliente para a marcação e realização de consultas. Consideramos que a organização dentro de uma empresa é um factor muito importante e que o atendimento rápido e eficiente é um ponto crucial para fidelizar clientes.

**Cenário Principal**

Um dos objetivos principais da nossa aplicação é a implementação de um conjunto de medidas que visam garantir a integridade da informação armazenada bem como uma gestão segura no acesso à mesma. Criaremos uma sistema que permitirá aos gestores fazer uma melhor gestão de toda a informação existente dentro do cliGest, e para tal, teremos um administrador que, tal como citamos acima, representa a pessoa responsável por toda a gestão dos dados. O administrador é o único que pode criar novos utilizadores e consultar toda a informacão do cliGest, necessitando de fazer um Login para aceder à informação.


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




*Gestão de consultas:*

Neste módulo será possivel fazer a gestão das consultas de cada cliente. Será gerado um código interno que será associado a cada consulta (*id_consulta*). Terá de obedecer ainda os seguintes critérios:


* o código de consulta deve ser único;
* a data deve ser uma data válida;
* o número da cédula profissional do médico responsável deve estar preenchido;





**Cenário Secundário**
Como cenário secundário teremos um ambiente diferente onde qualquer utilizador poderá aceder à aplicação.
Neste cenário não estarão visível todos os dados da base de dados

