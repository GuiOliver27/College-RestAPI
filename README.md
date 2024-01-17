
# API de Gerenciamento de Faculdade

Este é um aplicativo Spring Boot que fornece uma API RESTful para gerenciar registros universitários. Ele permite que você execute operações CRUD (Criar, Ler, Atualizar, Excluir) em entidades universitárias.

## Endpoints
### Save College
- **URL**: /college/save
- **Method**: POST
- **Description**: Salva um novo dado da faculdade.
- **Request Body**: Representação JSON de um objeto College.
- **Response**: Mensagem salva sucesso.

### Get Colleges
- **URL**: /college/get
- **Method**: GET
- **Description**: Recupera todos os registros da faculdade.
- **Response**: Matriz JSON de objetos College.

### Update College by ID
- **URL**: /college/put/{id}
- **Method**: PUT
- **Description**: Atualiza um registro da faculdade por ID.
- **Path Variable**: id - ID do cadastro da faculdade a ser atualizado.
- **Request Body**: Representação JSON de um objeto College.
- **Response**: Mensagem de sucesso ou mensagem de falha se o registro da faculdade com o ID especificado não for encontrado.

## Uso
Para usar esta API, envie solicitações HTTP para os endpoints apropriados usando ferramentas como Insomnia, Postman ou qualquer cliente HTTP.

### Tecnologias Usadas
- Java
- Spring Boot
- Spring Data JPA
- H2 Database

### Versões
- Java 17
- Spring Boot 3.2.1

### Contribuição
Sinta-se à vontade para contribuir com este projeto enviando solicitações pull ou relatando problemas.

### Licença
Este projeto está licenciado sob a licença MIT - consulte o arquivo LICENSE para obter detalhes.
