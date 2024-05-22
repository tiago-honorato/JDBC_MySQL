# Projeto Java com JDBC
Este projeto é um exemplo de aplicação Java que utiliza JDBC(Java Database Connectivity) para se conectar a um banco de dados.
Ele demonstra como realizar CRUD(Create, Read, Update, Delete) em um banco de dados.

## Funcionalidades
- Conexão com o banco de dados
- Inserção de dados
- Leitura de dados
- Atualização de dados
- Exclusão de dados

## Tecnologias Utilizadas
- Eclipse
- Java 17
- JDBC
- MySQL

## Estrutura do Projeto
```plaintext
Mysql-JDBC/
│
├── libs/
│ └── mysql-connector-j-8.0.33.jar
│
├── src/
│ └── br/
│ └── com/
│ └── registro/
│ ├── app/
│ │ └── Main.java
│ ├── connection/
│ │ └── Conexao.java
│ ├── dataAccessObject/
│ │ └── UsuarioDAO.java
│ └── model/
│ └── Usuario.java
│
├── .git/
├── .settings/
├── .classpath
├── .project
├── create-database.sql
├── create-table.sql
└── README.md
```
## Pré-requisitos

- JDR 17 ou superior
- MySQL

## Configuração do ambiente
1. Clone o repositório:

    git clone https://github.com/tiago-honorato/JDBC_MySQL.git
  
    cd JDBC_MySQL
   
3. Configure o banco de dados:

    (em ordem)
   
    execute o script `create-database.sql`
   
    execute o script `create-table.sql`

4. Configure o arquivo `Conexao.java`

    Atualize as credenciais e a URL de conexão com o banco de dados

5. Execute o programa.
