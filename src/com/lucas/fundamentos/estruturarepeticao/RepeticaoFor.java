package com.lucas.fundamentos.estruturarepeticao;


import java.util.Scanner;

public class RepeticaoFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String res;

        do {
            System.out.print("Você deseja ver a tabuada de qual número: ");
            int numero = input.nextInt();

            for (int contador = 1; contador <= 10; contador++) { // Estrutura de repetiçao FOR
                int resultado = (numero * contador);

                String tipo = (resultado % 2 == 0) ? " (PAR)" : " (IMPAR)"; // Define se o resultado é PAR ou Impar usando o operador ternario.

                System.out.println(numero + " x " + contador + " = " + resultado + tipo); // imprime na tela

            }

            System.out.println("Deseja ver a tabuada de outro numero? [S/N] ");
            res = input.next();


        } while (res.equalsIgnoreCase("S"));

        input.close();

    }
}


