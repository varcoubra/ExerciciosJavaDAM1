package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nTeclea o primeiro número: ");
        int n1 = teclado.nextInt();
        System.out.print("\nTeclea o segundo número: ");
        int n2 = teclado.nextInt();

        int a, b;

        if (n1 <= n2) {
            a = n1;
            b = n2;
        }
        else {
            a = n2;
            b = n1;
        }

        if (a % 2 == 0)
            a += 1;

        System.out.println("Desde: " + n1);
        System.out.println("Ata; " + n2);

        for (int i = a, e= 1; i <= b && e <= 10; i += 2, e++) {

            double calculo = Math.pow(i,3);

            System.out.println(i + " ^3 = " + calculo);

        }




    }
}
