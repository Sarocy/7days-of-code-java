# 7 Days of Code: Java com Spring Boot! 🚀

## 💻 Dia 06: Integração de Refeição e Sono com o Frontend 
### 🚀 O Desafio de Hoje

No sexto dia do desafio, vamos aplicar o que aprendemos no dia 5 porém para integrar as entidades `Refeicao` e `Sono` com o frontend. Nosso objetivo é permitir que o usuário possa listar, adicionar, editar e excluir registros de `Refeicao` e `Sono` diretamente nas páginas HTML, aproveitando o poder do Thymeleaf para renderização dinâmica.

### 🛠️ O que fizemos?
- Atualizamos os controladores `RefeicaoController` e `SonoController` para que, assim como o `ExercicioController`, eles processassem os dados das respectivas entidades e os passassem para a página HTML, incluindo métodos para listar, salvar, editar e excluir registros.

- Modificamos o `crud.html` adaptando o layout da página para exibir `Refeicao` e `Sono` de forma dinâmica, usando `th:each` para listar registros em suas seções específicas.

- Assim como no dia anterior, criamos formulários para adicionar e editar `Refeicao` e `Sono`, usando `th:object` e `th:field` para vincular os campos aos atributos das entidades.

