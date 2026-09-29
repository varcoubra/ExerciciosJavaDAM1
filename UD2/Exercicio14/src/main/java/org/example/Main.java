package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        final int INTERVALO1A = 14681, INTERVALO1B = 15681,
                INTERVALO2A = 70001, INTERVALO2B = 79999,
                INTERVALO3A = 88888, INTERVALO3B = 111111;

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nIntroduza el número de serie: ");
        int numeroSerie = teclado.nextInt();

        if (numeroSerie >= INTERVALO1A && numeroSerie <= INTERVALO1B ||
                numeroSerie >= INTERVALO2A && numeroSerie <= INTERVALO2B ||
                numeroSerie >= INTERVALO3A && numeroSerie <= INTERVALO3B ) {
            System.out.println("A peza é defectuosa");
        }
        else
            System.out.println("A peza non é defectuosa");

    }
}
