# Cadastro de uma Pessoa usando um Recurso Rest

Construir um CRUD cadastro de pessoa utilizando Spring Boot aplicando os conceitos Restful 

### Tarefas:

- [X] Criar Modelo da Classe Pessoa e seu Repository;
- [X] Criar script SQL Banco de dados tabela pessoa CREATE && INSERT com arquivo application.properties usando MySQL Server; 
  * Correção no arquivo POM alterando Dependency driver de SQL Server para MySQL 
- [X] Adicionar Anotação Embedded na Classe pessoa campo endereço, criar a classe Endereco, alterar o script SQL import.sql
- [X] Adicionar um campo data de cadastro; 
- [X] Criar Classe de Serviço e Controller Pessoa;
- [X] Criar o recurso pessoa buscando por ID;
- [X] Testar o recurso criado utilizando o Postman retornando suas devidas msg "200 OK" 
- [X] Criar o recurso para lista pessoas por id.

![image](https://user-images.githubusercontent.com/28118980/216687652-433d237c-8246-47f7-ae57-2032e101fd9d.png)

- [X] Criar o recurso para listar todas as pessoas.
 
![image](https://user-images.githubusercontent.com/28118980/216686866-8f94cb0a-b9ea-447f-8d6b-7547092ebeb6.png)

- [X] Criar o recurso para atualizar Pessoa- PutMapping

![image](https://user-images.githubusercontent.com/28118980/216682482-4c446747-3e55-4477-a4cf-7e03db18b940.png)

- [X] Criar o recurso delete para excluir uma Pessoa retornando uma mensagem 204 No content

![image](https://user-images.githubusercontent.com/28118980/216687143-af0de79e-4719-41b0-ae08-de3dd54aa817.png)

- [X] Criar o recurso post para salvar uma pessoa retornando a msg 201 created

![image](https://user-images.githubusercontent.com/28118980/216848268-4ee97ffc-57fd-4d5a-86b4-2467dbbe6aa7.png)

- [X] Adicionando Anotation @Valid para validar a persistencia dos dados
