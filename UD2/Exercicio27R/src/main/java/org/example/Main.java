package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduzca o número: ");
        int n = teclado.nextInt();
        int i = 2, nd = 0;
        boolean sw = true;

        while (sw && i < n) {

            if (n % i == 0)
                sw = false;

            i++;
            nd++;
        }

        if (sw)
            System.out.println("O número " + n + " é primo");
        if (!sw)
            System.out.println("O número " + n + " non é primo");

        System.out.println("Número de divisións: " + nd);

    }
}
