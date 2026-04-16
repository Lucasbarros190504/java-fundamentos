package com.lucas.fundamentos.estruturaescolha;

import java.util.Scanner;

public class EstruturaEscolha {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantas pernas o seu animal tem? ");
        int perna = input.nextInt();

        String tipo;

        System.out.print("Isso é um(a): ");

        switch (perna){
            case 1:
                tipo = "Saci";
                break;

            case 2:
                tipo = "Bípede";
                break;

            case 3:
                tipo = "Tripé";
                break;

            case 4:
                tipo = "Quadrúpede";
                break;

            case 6, 8:
                tipo = "Aranha";
                break;

            default:
                tipo = "ET";
                break;
        };

        System.out.println(tipo);

        input.close();

    }
}
