package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduzca o número: ");
        int n = teclado.nextInt();
        if (ePrimo(n))
            System.out.println("O número " + n + " é primo");
        if (!ePrimo(n))
            System.out.println("O número " + n + " non é primo");

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
