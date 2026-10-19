package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduzca o número de filas: ");
        int n = teclado.nextInt();

        int inicial = 1;

        for (int filas = 0; filas < n; filas++) {

            System.out.println("");

            for (int columnas = 0; columnas <= filas; columnas++) {

                System.out.print(" " + inicial + " ");
                inicial++;

            }

        }

    }
}
