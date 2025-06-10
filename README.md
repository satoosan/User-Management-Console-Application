Claro! Aqui está uma documentação para o seu projeto em formato README, objetiva mas completa, explicando o funcionamento, requisitos, uso e estrutura do código.

---

# User Management Console Application

Aplicação Java simples para cadastro e listagem de usuários via console, validando idade e data de nascimento.

---

## Sumário

* [Descrição](#descrição)
* [Funcionalidades](#funcionalidades)
* [Requisitos](#requisitos)
* [Como usar](#como-usar)
* [Estrutura do Projeto](#estrutura-do-projeto)
* [Detalhes da Implementação](#detalhes-da-implementação)

---

## Descrição

Aplicação console que permite o cadastro de usuários, armazenando nome, idade e data de nascimento. Durante o cadastro, valida se a idade informada bate com a data de nascimento. Usuários cadastrados podem ser listados no console.

---

## Funcionalidades

* Cadastrar usuário com:

  * Nome
  * Idade (informada pelo usuário)
  * Data de nascimento (formato dd/MM/yyyy)
* Validação da consistência entre idade e data de nascimento.
* Listar todos os usuários cadastrados com suas informações.
* Opção para sair do programa.

---

## Requisitos

* Java 8 ou superior
* Ambiente para compilar e executar programas Java (JDK)

---

## Como usar

1. Compile as classes `Main` e `User`.
2. Execute a classe `Main`.
3. No menu, escolha:

   * `1` para cadastrar usuário.
   * `2` para listar usuários cadastrados.
   * `3` para sair do programa.
4. Para cadastro, informe nome, idade e data de nascimento.

   * A idade deve ser coerente com a data de nascimento.
5. Ao listar usuários, são exibidos nome, idade e data de nascimento formatada.

---

## Estrutura do Projeto

```
src/
 ├── Main.java          # Classe principal com o fluxo do programa
 └── util/
     └── User.java      # Classe modelo para representar o usuário
```

---

## Detalhes da Implementação

### Main.java

* Controla o fluxo principal do programa.
* Utiliza `Scanner` para entrada via console.
* Mantém uma lista em memória (`List<User>`) dos usuários cadastrados.
* Formata e valida a data de nascimento usando `DateTimeFormatter` e `LocalDate`.
* Calcula idade real a partir da data de nascimento para validar contra a idade informada.
* Permite repetição do cadastro caso os dados não estejam corretos.
* Exibe os dados formatados ao listar usuários.
* Fecha o scanner ao sair.

### User.java

* Classe modelo para usuário.
* Atributos:

  * `name` (String): nome do usuário.
  * `idade` (Integer): idade do usuário.
  * `dataDeNascimento` (Date): data de nascimento.
* Possui construtores e getters/setters para manipulação dos dados.

---

Se precisar, posso ajudar a gerar exemplos de compilação, execução ou até um script para facilitar.

Quer que eu crie também?
