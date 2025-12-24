# Sobre o projeto

Projeto de web services desenvolvido com Spring Boot, que expõe endpoints RESTful para gerenciar entidades como Produto, Usuário, Pedido e Categoria. O projeto utiliza o banco de dados relacional H2 para persistência e mapeamento de relacionamentos entre entidades. Além disso, integra práticas de testes automatizados com JUnit e Mockito, gerenciamento de dependências e build com Maven, e é configurado para integração contínua (CI), permitindo validar automaticamente a funcionalidade da aplicação e a integridade das APIs.

## Endpoints disponíveis

- **Categorias**  
  `GET http://localhost:8080/categories` – Listar todas as categorias  
  `GET http://localhost:8080/categories/{id}` – Buscar categoria por ID  
  `POST http://localhost:8080/categories` – Criar nova categoria  
  `PUT http://localhost:8080/categories/{id}` – Atualizar categoria existente  
  `DELETE http://localhost:8080/categories/{id}` – Excluir categoria

- **Produtos**  
  `GET http://localhost:8080/products` – Listar todos os produtos  
  `GET http://localhost:8080/products/{id}` – Buscar produto por ID  
  `POST http://localhost:8080/products` – Criar novo produto  
  `PUT http://localhost:8080/products/{id}` – Atualizar produto existente  
  `DELETE http://localhost:8080/products/{id}` – Excluir produto

- **Usuários**  
  `GET http://localhost:8080/users` – Listar todos os usuários  
  `GET http://localhost:8080/users/{id}` – Buscar usuário por ID  
  `POST http://localhost:8080/users` – Criar novo usuário  
  `PUT http://localhost:8080/users/{id}` – Atualizar usuário existente  
  `DELETE http://localhost:8080/users/{id}` – Excluir usuário

- **Pedidos**  
  `GET http://localhost:8080/orders` – Listar todos os pedidos  
  `GET http://localhost:8080/orders/{id}` – Buscar pedido por ID  
  `POST http://localhost:8080/orders` – Criar novo pedido  
  `PUT http://localhost:8080/orders/{id}` – Atualizar pedido existente  
  `DELETE http://localhost:8080/orders/{id}` – Excluir pedido
  
## Modelo conceitual
![Modelo Conceitual](https://github.com/DaviBrazz/assets/blob/main/images/WebServices-java-springboot/modelo-conceitual-spring.png)
![Modelo Conceitual](https://github.com/DaviBrazz/assets/blob/main/images/WebServices-java-springboot/modelo-conceitual-exemplo.png)

## Exemplo de Entrega API
Orders
![Exemplo de Entrega API](https://github.com/DaviBrazz/assets/blob/main/images/WebServices-java-springboot/exemplo%3Dentrega-api-2.png)

Orders id 2
![Exemplo de Entrega API](https://github.com/DaviBrazz/assets/blob/main/images/WebServices-java-springboot/exemplo-entrega-api.png)

# Tecnologias utilizadas

- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Banco de Dados H2
- JUnit / Mockito
- Integração contínua (CI)

# Como executar o projeto

## Pré-requisitos
Java 17 ou superior

```bash
# clonar repositório
git clone https://github.com/DaviBrazz/api-pedidos-clientes-spring-boot.git

# entrar na pasta do projeto
cd api-pedidos-clientes-springBoot

# executar o projeto
mvn spring-boot:run
```
## Autor: `Davi Braz`
