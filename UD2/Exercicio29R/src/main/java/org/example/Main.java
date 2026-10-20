package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduzca o primeiro número (desde): ");
        int n1 = teclado.nextInt();
        System.out.print("\nIntroduzca o segundo número (ata): ");
        int n2 = teclado.nextInt();

        if (n1 > n2) {
            int temporal = n1;
            n1 = n2;
            n2 = temporal;
        }

        for (int i = n1; i <= n2; i++)
            if (ePrimo(i))
                System.out.println("O número " + i + " é primo");
            else
                System.out.println("O número " + i + " non é primo");


    }

    public static boolean ePrimo(int n) {
        boolean ePrimo = true;
        int divisor = 2;

        while (divisor <= Math.sqrt(n) && ePrimo) {
            if (n % divisor == 0)
                ePrimo = false;
            divisor++;
        }

        return ePrimo;
    }
}
