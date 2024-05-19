# Em desenvolvimento 

# Spring Boot com MongoDB 🚀

Este é um projeto de workshop para o MongoDB com Spring Boot.

---

Este projeto consiste em uma aplicação simples desenvolvida com o objetivo de demonstrar a integração entre o Spring Boot e o MongoDB. A aplicação permite gerenciar uma coleção de usuários, realizando operações básicas como listar todos os usuários cadastrados e buscar um usuário específico pelo seu ID.

A estrutura do projeto é baseada em princípios de arquitetura limpa, onde temos as seguintes camadas:

- **Controller**: Responsável por receber as requisições HTTP e delegar as tarefas para os serviços apropriados.
- **Service**: Contém a lógica de negócio da aplicação, manipulando os dados conforme necessário.
- **Repository**: Responsável pela interação com o banco de dados MongoDB, realizando operações de persistência e consulta.


## Tecnologias Utilizadas 🛠️

Este projeto foi desenvolvido com as seguintes tecnologias:

- Java
- Spring Boot
- MongoDB

---

## Pré-requisitos 🔧

Antes de começar, verifique se você atendeu aos seguintes requisitos:

- Java 17 instalado
- MongoDB instalado e em execução

---

## Como Usar 💻

Para clonar e executar este aplicativo, siga estas etapas:

```bash
# Clone este repositório
$ git clone https://github.com/rodri-oliveira/workshopmongo

# Entre no repositório
$ cd workshopmongo

# Instale as dependências
$ mvn install

# Execute o app
$ mvn spring-boot:run
```

---

## Estrutura do Projeto 📁

O projeto é organizado da seguinte forma:

- **`src/main/java/com/rodrigoolive/workshopmongo`**: Contém os pacotes Java do projeto.
  - **`config`**: Contém as configurações do projeto

---

## Funcionalidades 🔍

- **Listar todos os usuários**: Endpoint para listar todos os usuários cadastrados.
- **Buscar usuário por ID**: Endpoint para buscar um usuário específico pelo seu ID.

---

## Contribuição 🤝

Contribuições são o que fazem a comunidade de código aberto tão incrível! Qualquer contribuição que você fizer será muito apreciada.

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Faça commit das suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Faça push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request


