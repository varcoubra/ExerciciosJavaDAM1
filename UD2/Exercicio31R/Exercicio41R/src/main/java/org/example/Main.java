package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduce o número de termos da sucesión de Fibonacci a visualizar: ");
        int termos = teclado.nextInt();
        int n0 = 1, n1 = 1, actual = 0;

        for (int n = 0; n < termos; n++) {

            System.out.print(actual + " ");
            n1 = actual;
            actual = n0 + n1;
            n0 = n1;

        }
    }
}
