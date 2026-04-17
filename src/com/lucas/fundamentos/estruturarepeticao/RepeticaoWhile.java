package com.lucas.fundamentos.estruturarepeticao;


import java.util.Scanner;

public class RepeticaoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 1;

        System.out.print("Você deseja ver a tabuada de qual número: ");
        int numero = input.nextInt();

        while (contador <= 10) { // Estrutura de repetição while, o loop vai continuar rodando ate o contador for menor ou igual a 10.
            int resultado = (numero * contador);

            String tipo = (resultado % 2 == 0) ? " (PAR)" : " (IMPAR)"; // Define se o resultado é PAR ou Impar usando o operador ternario.

            System.out.println(numero + " x " + contador + " = " + resultado + tipo); // imprime na tela



            contador++; // adiciona +1 no contador

        }

     input.close();

    }
}
