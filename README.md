# 7 Days of Code: Java com Spring Boot! 🚀

## 💻 Dia 04: Criação dos Controladores e Rotas Básicas
### 🚀 O Desafio de Hoje

No quarto dia do desafio, você vai criar os controladores que serão responsáveis por gerenciar as rotas e interações com os dados das entidades Exercicio, Refeicao e Sono. Eles definirão os endpoints para operações de CRUD, permitindo que o sistema gerencie registros de forma eficiente :)

### 🛠️ O que fizemos?
- Criação dos Controladores:
  - Criamos as classes ExercicioController, RefeicaoController e SonoController.
  - Definimos as rotas principais /exercicio, /refeicao e /sono usando @RequestMapping.

- Definição das Rotas e Métodos:
  - Implementamos o método GET para listar todos os registros em /listar.
  - Implementamos o método POST para salvar novos registros em /salvar.
  - Implementamos PUT para a atualização de registros existentes em /editar/{id}.
  - Implementamos o método DELETE para excluir registros por ID em /excluir/{id}.

