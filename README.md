
# Workshop MongoDB

## Sobre o Projeto

Este projeto é um workshop que demonstra o uso do MongoDB com o Spring Boot. O objetivo é criar uma aplicação web que permite aos usuários criar, ler, atualizar e deletar (CRUD) posts em um blog.

Os usuários podem criar posts, que são armazenados no MongoDB, um banco de dados NoSQL que armazena dados em formato de documentos flexíveis semelhantes a JSON. Cada post pode ter um autor e comentários associados.

## Tecnologias Utilizadas

- **Spring Boot**: Framework Java usado para criar aplicações stand-alone, production-grade, baseadas em Spring de forma rápida e fácil.
- **MongoDB**: Banco de dados NoSQL, orientado a documentos.
- **Maven**: Ferramenta de automação de compilação utilizada primariamente em projetos Java.

## Executando o Projeto

Para executar o projeto, você pode usar o comando a seguir na raiz do projeto:

\`\`\`bash
mvn spring-boot:run
\`\`\`

## Estrutura do Projeto

O projeto contém várias classes importantes:

- \`WorkshopmongoApplication.java\`: Esta é a classe principal que inicia a aplicação.
- \`Instatiation.java\`: Esta classe é responsável por inicializar o banco de dados com alguns dados de exemplo.
- \`Post.java\`: Esta classe representa um Post no banco de dados.
- \`User.java\`: Esta classe representa um Usuário no banco de dados.
- \`AuthorDTO.java\`: Esta classe é usada para transferir dados de um Autor.
- \`CommentDTO.java\`: Esta classe é usada para transferir dados de um Comentário.

## Tratamento de Exceções

O projeto inclui um tratamento de exceções básico. As exceções são capturadas e tratadas para garantir que a aplicação possa se recuperar de erros inesperados e continuar funcionando corretamente.

## Endpoints da API

Aqui estão alguns dos principais endpoints da API:

- \`GET /users\`: Retorna uma lista de todos os usuários.
- \`GET /users/{id}\`: Retorna um usuário específico pelo ID.
- \`POST /users\`: Cria um novo usuário.
- \`PUT /users/{id}\`: Atualiza um usuário existente pelo ID.
- \`DELETE /users/{id}\`: Exclui um usuário pelo ID.

- \`GET /posts\`: Retorna uma lista de todos os posts.
- \`GET /posts/{id}\`: Retorna um post específico pelo ID.
- \`POST /posts\`: Cria um novo post.
- \`PUT /posts/{id}\`: Atualiza um post existente pelo ID.
- \`DELETE /posts/{id}\`: Exclui um post pelo ID.

## Recursos

O projeto inclui operações CRUD básicas para Usuários e Posts.

## Contribuindo

Contribuições são bem-vindas. Por favor, abra uma issue ou faça um pull request com suas alterações.
