# Santander Dev Week 2025 - API RESTful com Spring Boot

Este projeto é uma **API RESTful** desenvolvida em **Java com o framework Spring Boot**, criada como parte da **Santander Dev Week 2025**.

## Visão Geral

A API foi projetada para simular funcionalidades de um sistema bancário ou de gestão de usuários, fornecendo endpoints para manipulação de dados essenciais como:

* **Usuários (`User`)**: Gerenciamento de informações de clientes.
* **Contas (`Account`)**: Detalhes e operações relacionadas às contas bancárias.
* **Cartões (`Card`)**: Informações e limites de cartões de crédito/débito.
* **Features (`Feature`)**: Recursos e funcionalidades adicionais disponíveis para usuários.
* **Notícias (`News`)**: Atualizações e informações relevantes para os usuários.

## Arquitetura e Tecnologias

O projeto segue uma arquitetura em camadas (Controller, Service, Repository, Model), comum em aplicações Spring Boot, promovendo a separação de responsabilidades e facilitando a manutenção.

* **Linguagem:** Java
* **Framework:** Spring Boot
* **Banco de Dados: H2
* **ORM:** Spring Data JPA / Hibernate
* **Documentação da API:** SpringDoc OpenAPI (Swagger UI) - Para fácil visualização e teste dos endpoints.
* **Gerenciamento de Dependências:** Maven
