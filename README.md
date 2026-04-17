# Java-fundamentos

Repositório dedicado ao estudo e prática dos fundamentos da linguagem Java, com foco em lógica de programação, estruturas de decisão e repetição, organização de código e aplicação de boas práticas utilizadas no desenvolvimento de software.

## 📚 Conteúdos Praticados

* ✅ Estruturas de decisão (`if`, `else if`, `else` e `switch`)
* ✅ Estruturas de repetição (`while` e `for`)
* ✅ Entrada de dados com a classe `Scanner`
* ✅ Operadores lógicos (`&&`, `||`) e aritméticos
* ✅ Organização de projetos através de pacotes (`packages`)
* ✅ Boas práticas de nomeação e estruturação

## 📂 Projetos

### 🔹 Sistema de Votação
Programa que automatiza a verificação de elegibilidade eleitoral. Ele recebe o ano de nascimento, calcula a idade atual (baseado no ano de 2026) e classifica a situação do cidadão.
* **Lógica:**
    * Menor que 16 anos: Proibido votar.
    * Entre 16 e 17 anos ou acima de 70 anos: Voto opcional.
    * Entre 18 e 70 anos: Voto obrigatório.

### 🔹 Estrutura de Escolha (Classificador de Animais)
Programa que utiliza a estrutura `switch` para identificar e classificar um ser com base na quantidade de membros/pernas informada pelo usuário.
* **Exemplo:** Entrada `4` -> Saída `Quadrúpede`.



### 🔹 Estruturas de Repetição (Loops) 🔄

Exercícios focados na automação de tarefas repetitivas utilizando `while` e `for`.

#### 📌 Tabuada Dinâmica

- **Lógica:** O programa solicita um número ao usuário e gera a tabuada de 1 a 10.
- **Diferencial:** Utiliza o operador ternário para identificar se o resultado de cada multiplicação é **PAR** ou **ÍMPAR** em tempo real.
- **Versões:**
  - `RepeticaoWhile.java` (utilizando `while`)
  - `RepeticaoFor.java` (utilizando `for`)


## 💡 Exemplos de Uso

| Projeto | Entrada | Saída |
| :--- | :--- | :--- |
| Sistema de Votação | 2010 | Você não vota pq tem apenas: 16 anos |
| Estrutura de Escolha | 2 | Bípede |
| Tabuada Dinâmica | 5 | 5 x 1 = 5 (ÍMPAR)<br>5 x 2 = 10 (PAR)<br>...<br>5 x 10 = 50 (PAR) |


Este repositório serve como base para a minha evolução em Java, consolidando os conceitos essenciais de lógica antes de avançar para temas mais complexos de Backend.
