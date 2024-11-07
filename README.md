# 7 Days of Code: Java com Spring Boot! 🚀

## 💻 Dia 05: Integração de Exercício com o Frontend
### 🚀 O Desafio de Hoje

No quinto dia do nosso desafio, vamos dar um passo além e integrar o backend com o frontend usando Thymeleaf. Até agora, testamos nossa API utilizando o Postman e exploramos os endpoints via JSON. Agora, vamos visualizar o funcionamento direto na interface, criando uma página HTML onde os dados são exibidos e manipulados.

### 🛠️ O que fizemos?
- Para realizar essa integração, você recebeu o código de frontend com duas páginas:
  - `index.html`: página inicial, controlada pelo `HomeController`.
  - `crud.html`: página para manipulação do CRUD de `Exercicio`, controlada pelo `CrudController`.

- Adaptamos o `ExercicioController` para que ele processe os dados e os envie diretamente para a página HTML (`crud.html`). Dessa forma, os dados de `Exercicio` são exibidos e manipulados diretamente na interface.

- Modificamos o `crud.html` usando o Thymeleaf para exibir os registros de `Exercicio` dinamicamente.

- Configuramos formulários para adicionar e editar registros de `Exercicio` usando Thymeleaf, para vincular os campos do formulário aos atributos da entidade.

