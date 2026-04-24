package com.lucas.fundamentos.condicionais;

import java.util.Scanner;

public class SistemaVotacao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String res;

        do {
            System.out.print("Digite o ano do seu nascimento: ");
            int ano = input.nextInt();
            int idade = (2026 - ano);

            if (idade < 16) {
                System.out.println("Você não vota pq tem apenas: " + idade + " anos");
            } else if ((idade >= 16 && idade < 18) || (idade > 70)) {
                System.out.println("Seu Voto é Opcional, Por conta que você tem : " + idade + "anos");
            } else {
                System.out.println("Seu voto é obrigatorio, vc tem: " + idade + " anos");
            }

            System.out.println("Você deseja inserir outro ano de nascimento: [S/N] ");
            res = input.next();

        }while (res.equalsIgnoreCase("S"));

        input.close();

    }

}


