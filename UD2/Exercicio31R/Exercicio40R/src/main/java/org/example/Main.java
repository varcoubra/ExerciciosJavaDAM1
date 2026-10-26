package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int numeroNovo, numeroAntigo = 0, suma = 0, divisor = 0;

        System.out.print("\nIntroduce un número: ");
        numeroNovo = teclado.nextInt();

        do {
            suma += Math.abs(numeroAntigo - numeroNovo);
            divisor++;
            numeroAntigo = numeroNovo;
            System.out.print("\nIntroduce un número: ");
            numeroNovo = teclado.nextInt();

        } while ( numeroNovo != 0 );

        System.out.printf("Separación media: %.1f", (float) suma / divisor);
        teclado.close();
    }
}
