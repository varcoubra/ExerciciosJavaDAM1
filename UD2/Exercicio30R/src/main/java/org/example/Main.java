package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduzca o número de primos que quere visualizar: ");
        int n = teclado.nextInt();

        for (int i = 2, cont = 1; cont <= n; i++){

            if (ePrimo(i)) {
                System.out.println("O número " + i + " é primo" + "(" + cont + ")");
                cont++;
            }

        }

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
