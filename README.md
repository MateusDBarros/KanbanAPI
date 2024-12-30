# Kanban API

## Descrição

O **Kanban API** é uma aplicação para gerenciamento de tarefas e usuários, implementada como uma aplicação web full-stack. O projeto foi desenvolvido utilizando o **Spring Boot** no backend e **Angular** no frontend, com PostgreSQL como banco de dados. O sistema permite realizar operações CRUD para gerenciar usuários e tarefas, com base em diferentes níveis de experiência (Junior, Pleno, Senior).

## Funcionalidades

- **CRUD de Usuários**: Adicionar, visualizar, atualizar e excluir registros de usuários.
- **Gerenciamento de Tarefas**: Organizar tarefas em diferentes estágios do processo com a funcionalidade Kanban.
- **Visualização Interativa**: Interface responsiva que permite interação com os dados de forma intuitiva.
- **Autenticação de Usuários**: Implementação de autenticação e autorização para acesso a funcionalidades sensíveis.

## Tecnologias Utilizadas

- **Backend**: 
  - [Spring Boot](https://spring.io/projects/spring-boot) - Framework para desenvolvimento do backend.
  - [PostgreSQL](https://www.postgresql.org/) - Banco de dados relacional para persistência de dados.
  - [JPA/Hibernate](https://hibernate.org/) - Framework para mapeamento objeto-relacional.
  
- **Frontend**:
  - [Angular](https://angular.io/) - Framework para desenvolvimento da interface de usuário.
  - [TypeScript](https://www.typescriptlang.org/) - Linguagem para desenvolvimento com Angular.
  - [Bootstrap](https://getbootstrap.com/) - Framework CSS para estilização e layout responsivo.

- **Ferramentas**:
  - [Git](https://git-scm.com/) - Controle de versão.
  - [Maven](https://maven.apache.org/) - Gerenciamento de dependências no backend.
  
## Como Executar o Projeto

### Backend (Spring Boot)

1. Clone o repositório:
    ```bash
    git clone https://github.com/MateusDBarros/KanbanAPI.git
    cd KanbanAPI
    ```

2. Importe o projeto em sua IDE (IntelliJ IDEA, Eclipse, etc.).

3. Configure o banco de dados PostgreSQL e altere as credenciais de conexão no arquivo `application.properties` (localizado em `src/main/resources`).

4. Execute a aplicação Spring Boot. Você pode rodá-la com o comando:
    ```bash
    ./mvnw spring-boot:run
    ```

### Frontend (Angular)

1. Navegue até o diretório do frontend:
    ```bash
    cd frontend
    ```

2. Instale as dependências do Angular:
    ```bash
    npm install
    ```

3. Inicie o servidor de desenvolvimento:
    ```bash
    ng serve
    ```

4. Acesse a aplicação através de `http://localhost:4200`.

## Como Contribuir

1. Faça um fork deste repositório.
2. Crie uma branch para sua feature ou correção: `git checkout -b minha-feature`.
3. Faça commit das suas alterações: `git commit -am 'Adicionando nova feature'`.
4. Envie para o repositório remoto: `git push origin minha-feature`.
5. Abra um pull request.

