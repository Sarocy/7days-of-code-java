# 7 Days of Code: Java com Spring Boot! 🚀

## 💻 Dia 02: Criação das Entidades e Configuração do Banco de Dados
### 🚀 O Desafio de Hoje

No segundo dia do desafio, você irá avançar na construção do gerenciador de saúde diária ao criar as principais entidades e configurá-las para mapeamento com o banco de dados H2, o que é fundamental para garantir que o aplicativo armazene corretamente os dados dos registros de exercícios, refeições e sono.

### 1. Criação das Entidades
- Criamos as classes Exercicio, Refeicao e Sono dentro do pacote model.
- Utilizamos as anotações @Entity e @Table para mapear essas classes para tabelas no banco de dados.

### 2. Propriedades das Entidades
- Exercicio: contém as propriedades id, data, nome, series, repeticoes, carga e tempo.
- Refeicao: contém as propriedades id, nome, tipo, quantidade e data.
- Sono: contém as propriedades id, horasDormidas, qualidade e data.
  
