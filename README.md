# DSList - Intensivão Java Spring

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.4-green)
![Status](https://img.shields.io/badge/status-concluído-brightgreen)

## 📖 Sobre o Projeto

O DSList é um projeto de backend desenvolvido durante o evento "Intensivão Java Spring" da [DevSuperior](https://devsuperior.com.br/). A aplicação consiste em uma API REST para organizar e listar jogos em diferentes categorias, permitindo a consulta de jogos, listas de jogos e a reordenação dos jogos dentro de uma lista.

Este projeto demonstra a construção de uma aplicação robusta com uma arquitetura em camadas, utilizando as melhores práticas do ecossistema Spring.

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.5.4**
- **Spring Web:** Para a construção de endpoints REST.
- **Spring Data JPA:** Para o mapeamento objeto-relacional e acesso a dados.
- **Banco de Dados H2:** Banco de dados em memória para o perfil de teste e desenvolvimento.
- **PostgreSQL:** Banco de dados relacional para o perfil de produção.
- **Maven:** Para gerenciamento de dependências e do build do projeto.

## 📋 Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
* [Git](https://git-scm.com)
* [Java 17 (JDK)](https://www.oracle.com/java/technologies/downloads/#java17)
* Um editor de código de sua preferência (ex: IntelliJ, VSCode)

## 🚀 Como Executar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone <https://github.com/Victorx16/dslist.git>
    cd dslist
    ```

2.  **Execute a aplicação com o Maven:**
    ```bash
    ./mvnw spring-boot:run
    ```

3.  **Acesse a aplicação:**
    A aplicação estará rodando em `http://localhost:8080`.

Por padrão, a aplicação utiliza o perfil `test`, que ativa o banco de dados H2 em memória. Os dados iniciais são populados a partir do arquivo `src/main/resources/import.sql`.

Para acessar o console do banco de dados H2, navegue para `http://localhost:8080/h2-console` e utilize a URL JDBC `jdbc:h2:mem:testdb`.

## 🏗️ Arquitetura do Projeto

A aplicação segue uma arquitetura em camadas bem definida para separar as responsabilidades:

- **Controllers:** Camada responsável por expor os endpoints da API REST e receber as requisições HTTP.
- **Services:** Contém a lógica de negócio da aplicação. É responsável por orquestrar as operações e transações.
- **Repositories:** Camada de acesso a dados, que realiza as operações de consulta e manipulação no banco de dados.
- **DTOs (Data Transfer Objects):** Objetos utilizados para transferir dados entre as camadas, formatando os dados que serão expostos na API.
- **Entities:** Classes que representam as tabelas do banco de dados.
- **Projections:** Interfaces usadas para buscar dados customizados e otimizados do banco de dados.

## 🗂️ Modelo de Dados

A imagem abaixo representa o modelo de entidades do banco de dados:

![Modelo de Dados](assets/dslist-model.png)

O banco de dados é composto por três entidades principais:

1.  **Game:** Representa um jogo, com atributos como título, ano, gênero, etc..
2.  **GameList:** Representa uma lista ou categoria de jogos.
3.  **Belonging:** Tabela de associação que representa o pertencimento de um `Game` a uma `GameList`, incluindo a `posição` do jogo nessa lista.

## Endpoints da API

A API expõe os seguintes endpoints para interação:

#### Games

- `GET /games`
  - Retorna uma lista com a visualização resumida de todos os jogos cadastrados.

- `GET /games/{id}`
  - Retorna os dados completos de um jogo específico com base no seu `id`.

#### Listas de Games

- `GET /lists`
  - Retorna todas as listas de jogos cadastradas.

- `GET /lists/{listId}/games`
  - Retorna a lista de jogos pertencentes a uma lista específica (`listId`), ordenados por sua posição.

- `POST /lists/{listId}/replacement`
  - Move um jogo de uma posição para outra dentro da mesma lista.
  - **Request Body:**
    ```json
    {
      "sourceIndex": 0,
      "destinationIndex": 2
    }
    ```

## ✒️ Autor

Projeto desenvolvido por **Victor**.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-blue?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/victor-xavier418)
[![GitHub](https://img.shields.io/badge/GitHub-black?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Victorx16)

