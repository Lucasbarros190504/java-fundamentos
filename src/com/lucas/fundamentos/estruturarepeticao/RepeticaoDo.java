package com.lucas.fundamentos.estruturarepeticao;

import java.util.Scanner;

public class RepeticaoDo {

    public static void main(String[] args) {
        int n, s =0;
        String res;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Digite um numero: ");
            n = input.nextInt();
            s += n; // s = s + n;
            System.out.println("Quer continuar? [S/N]");
            res = input.next();
        } while(res.equals("S"));
        System.out.println("A soma de todos os numeros foi: " + s);
    }
}
