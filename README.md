# 🎓 EscolaTech

Um projeto simples em **Java** criado para demonstrar os principais conceitos de **Programação Orientada a Objetos (POO)**:
**herança, polimorfismo, encapsulamento, classes abstratas, interfaces e modificadores de acesso**.

---

## 💡 Objetivo

O projeto simula um pequeno sistema escolar, onde há **Pessoas**, **Alunos** e **Professores**.
Cada classe possui comportamentos e atributos próprios, aplicando os princípios da POO na prática.

---

## 🧩 Estrutura do Projeto

```
src/
└── aula/
    ├── Pessoa.java       // Classe abstrata base
    ├── Aluno.java        // Herda de Pessoa e implementa Pagavel
    ├── Professor.java    // Herda de Pessoa e implementa Pagavel
    ├── Pagavel.java      // Interface
    └── App.java          // Classe principal (ponto de entrada)
```

---

## 🧠 Conceitos aplicados

| Conceito                    | Descrição                                                          | Onde aparece                             |
| --------------------------- | ------------------------------------------------------------------ | ---------------------------------------- |
| **Herança**                 | Reutilização de código por meio de classes que herdam de uma base. | `Aluno` e `Professor` herdam de `Pessoa` |
| **Polimorfismo**            | Um mesmo método pode se comportar de formas diferentes.            | `exibirInfo()` e `calcularPagamento()`   |
| **Encapsulamento**          | Protege os atributos da classe e controla o acesso.                | Uso de `private` e `protected`           |
| **Classe abstrata**         | Define uma base que não pode ser instanciada.                      | `Pessoa`                                 |
| **Interface**               | Define um contrato que deve ser implementado.                      | `Pagavel`                                |
| **Modificadores de acesso** | Controlam a visibilidade dos atributos e métodos.                  | `private`, `protected`, `public`         |

---

## ⚙️ Como executar o projeto

1. Certifique-se de ter o **Java 17 ou superior** instalado.
   Para verificar, execute no terminal:

   ```bash
   java -version
   ```

2. Compile os arquivos:

   ```bash
   cd src
   javac aula/*.java
   ```

3. Execute o programa:

   ```bash
   java aula.App
   ```

---

## 🧾 Exemplo de saída

```
Aluno: Sthefany, Idade: 27, Curso: Redes de Computadores
Professor: André, Idade: 40, Disciplina: Programação Java
Mensalidade do aluno: R$ 1200.0
Salário do professor: R$ 5000.0
```

---

## 🌟 Tecnologias utilizadas

* Java 17
* VS Code
* Git & GitHub

---
