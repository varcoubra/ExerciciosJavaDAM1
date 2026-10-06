package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int desde, ata;
        System.out.print("\nEscribe o valor inicial: ");
        desde = teclado.nextInt();
        System.out.print("\nEscribe o valor final: ");
        ata = teclado.nextInt();


        while (desde > ata){
            System.out.println("\nO valor inicial non pode ser mayor ao final");
            System.out.print("\nEscribe o valor inicial: ");
            desde = teclado.nextInt();
            System.out.print("\nEscribe o valor final: ");
            ata = teclado.nextInt();

        }
        for (double i = desde; i <= ata; i++){

            System.out.printf("\n%.0f grados Fahrenheit equivalen a", i);
            double C, R, K;
            C = 5*(i-32)/9;
            R = i + 459.67;
            K = C + 273.15;
            System.out.printf("\n%.2f grados Celsius", C);
            System.out.printf("\n%.2f grados Rankine", R);
            System.out.printf("\n%.2f grados Kelvin\n", K);

        }

    }
}
