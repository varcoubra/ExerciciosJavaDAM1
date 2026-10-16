package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int n, maior, menor, media = 0, i;

        System.out.print("\nIntroduce un número: ");
        n = teclado.nextInt();
        maior = n;
        menor = n;

        for (i = 0; n != 0; i++) {

            if (n > maior)
                maior = n;
            if (n < menor)
                menor = n;

            media += n;

            System.out.print("\nIntroduce un número: ");
            n = teclado.nextInt();
        }

        System.out.println("\nA media é: " + (double)media / i);
        System.out.println("O número maior é : " + maior);
        System.out.println("O número menor é: " + menor);

    }
}
