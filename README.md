# 7 Days of Code: Java com Spring Boot! 🚀

## 💻 Dia 01: Configuração do Projeto e Setup Inicial
### 🚀 O Desafio de Hoje

No primeiro dia do desafio, você realizará a configuração inicial do ambiente de desenvolvimento para construir o gerenciador de saúde diária. Durante este dia, criaremos a base do projeto com Spring Boot, utilizando as dependências essenciais para começar a desenvolver funcionalidades como registro de exercícios, refeições e sono.

### 1. Inicialização do Projeto
- Utilizamos o Spring Initializr para criar o esqueleto do projeto. Com isso, já configuramos o Maven como ferramenta de build e gerenciador de dependências, facilitando o gerenciamento de bibliotecas e plugins.
- No Spring Initializr, selecionamos as seguintes dependências:
    - Lombok: Para reduzir a verbosidade de código, gerando getters, setters e outros métodos automaticamente.
    - Spring Boot DevTools: Para desenvolvimento rápido, com recarregamento automático das mudanças.
    - Spring Web: Para criação de controladores e endpoints.
    - Spring Data JPA: Para persistência de dados e integração com bancos de dados.
    - Thymeleaf: Para renderização de templates HTML.
    - H2 Database: Banco de dados em memória para armazenamento de dados durante o desenvolvimento.
    - Spring Boot Actuator: Para monitoramento e métricas da aplicação.

### 2. Configuração do Ambiente
- Certifique-se de que o Java 17 (ou versão compatível) está instalado e configurado na sua máquina.
- Configure seu editor de código (recomendado: Visual Studio Code ou IntelliJ IDEA) para suportar projetos Spring Boot.
- Configure seu application.properties para utilizar o banco de dados H2 para persistência.
  
