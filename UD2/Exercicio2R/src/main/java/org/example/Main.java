package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nCuántas notas quieres introducir?: ");
        int N = teclado.nextInt();

        while (N > 0) {

            double notaFinal = 0;
            int i;

            for (i = 0; i < N; i++) {
                System.out.print("\nIntroduce a nota " + (i+1) + ": ");
                notaFinal += teclado.nextDouble();
            }

            notaFinal = notaFinal / N;
            System.out.println("A media é: " + notaFinal);

            System.out.print("\nCuántas notas quieres introducir?: ");
            N = teclado.nextInt();
        }
    }
}
