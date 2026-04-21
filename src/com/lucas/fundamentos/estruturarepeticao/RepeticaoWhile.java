package com.lucas.fundamentos.estruturarepeticao;

import java.util.Scanner;

public class RepeticaoWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String res = "Sim";

        while (res.equalsIgnoreCase("SIM")) {
            System.out.print("Você deseja ver a tabuada de qual número: ");
            int numero = input.nextInt();

            mostrarTabuada(numero);

            System.out.println("Você deseja ver outra tabuada? [Sim/Nao]");
            res = input.next();

        }

        input.close();
    }

    public static void mostrarTabuada(int numero) {
        int contador = 1;

        while (contador <= 10) { // Estrutura de repetição while.
            int resultado = (numero * contador);

            String tipo = (resultado % 2 == 0) ? " (PAR)" : " (IMPAR)"; // Define se o resultado é PAR ou Impar usando o operador ternario.

            System.out.println(numero + " x " + contador + " = " + resultado + tipo); // imprime na tela

            contador++; // adiciona +1 no contador

        }
    }

}
