package com.lucas.fundamentos.estruturarepeticao;
import java.util.Scanner;

public class RepeticaoFor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero inicial: ");
        int I = input.nextInt();

        System.out.println("Digite o numero final: ");
        int F = input.nextInt();

        System.out.println("Digite a quantidade de pulos de um numero para outro: ");
        int P = input.nextInt();

        for ( I = 0; I <= F; I+= P){
            System.out.println(I);
        }
    }
}
