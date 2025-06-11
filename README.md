# 🧑‍💻 User Management GUI Application (Java + CSV)

Aplicação desktop simples em Java (GUI) para cadastro, listagem e remoção de usuários, com persistência de dados em arquivo `.csv`.

---

## 📋 Sumário

* [📖 Descrição](#📖-descrição)
* [🚀 Funcionalidades](#🚀-funcionalidades)
* [🛠 Requisitos](#🛠-requisitos)
* [▶️ Como usar](#▶️-como-usar)
* [📁 Estrutura do Projeto](#📁-estrutura-do-projeto)
* [🧩 Detalhes da Implementação](#🧩-detalhes-da-implementação)

---

## 📖 Descrição

Aplicação Java com interface gráfica baseada em `JOptionPane`, que permite cadastrar usuários com nome, idade e data de nascimento. Os dados são salvos em um arquivo `.csv`, e a aplicação valida se a idade informada bate com a data de nascimento. Também é possível visualizar os usuários via console ou Excel, e remover registros.

---

## 🚀 Funcionalidades

✅ Cadastrar usuário:

* Nome
* Idade
* Data de nascimento (formato `dd/MM/yyyy`)
* Verificação automática da coerência entre idade e data de nascimento

✅ Listar usuários:

* Em janela de texto formatada
* Ou abrir diretamente no Excel (arquivo CSV)

✅ Remover usuário:

* Escolha interativa por índice da lista

✅ Salvar e carregar dados de forma persistente em `usuarios.csv`

✅ Arquivo `.csv` permanece acessível mesmo durante o uso

✅ Encerramento com mensagem amigável

---

## 🛠 Requisitos

* Java 8 ou superior
* IDE como Eclipse, IntelliJ ou terminal com `javac` e `java`

---

## ▶️ Como usar

1. Compile os arquivos:

   ```bash
   javac src/Main.java src/util/User.java
   ```

2. Execute a aplicação:

   ```bash
   java -cp src Main
   ```

3. No menu interativo (via `JOptionPane`), escolha:

   * `1` para cadastrar um novo usuário
   * `2` para listar usuários (console ou Excel)
   * `3` para remover um usuário existente
   * `4` para sair do programa

4. Durante o cadastro:

   * Informe nome, idade e data de nascimento.
   * A aplicação calcula a idade real e compara com a informada.
   * Caso não coincida, será solicitado o recadastro.

5. O arquivo `usuarios.csv` será criado (ou atualizado) automaticamente no mesmo diretório.

---

## 📁 Estrutura do Projeto

```
projeto/
 ├── usuarios.csv               # Arquivo de persistência de dados (gerado automaticamente)
 ├── src/
 │   ├── Main.java              # Classe principal com lógica e menus
 │   └── util/
 │       └── User.java          # Classe modelo de usuário
```

---

## 🧩 Detalhes da Implementação

### 🧠 Main.java

* Utiliza `JOptionPane` para interação com o usuário (interface gráfica simples)
* Armazena usuários em memória usando `List<User>`
* Usa `DateTimeFormatter` e `LocalDate` para validação da idade
* Lista usuários com formatação ou via planilha
* Abre o `.csv` diretamente no Excel (caso disponível via `Desktop.getDesktop()`)
* Arquivo `usuarios.csv` é atualizado de forma segura:

  * Primeiro grava em um arquivo temporário
  * Depois substitui o original
  * Permite edição manual do `.csv` durante o uso

### 👤 User.java

* Atributos:

  * `String name`
  * `int idade`
  * `Date dataDeNascimento`
* Getters, setters e construtor completo
* Usado como modelo de dados no programa

---

## 💡 Observações

* Caso a idade digitada não corresponda à data de nascimento, o cadastro é recusado com aviso.
* O `.csv` é salvo mesmo que esteja aberto no Excel ou outro editor.
* Ao sair (opção `4`), uma mensagem final é exibida antes do encerramento automático com `System.exit(0)`.
