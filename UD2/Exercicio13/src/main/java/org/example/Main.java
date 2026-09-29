package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        final int FIXO = 30;
        final int INTERVALO1 = 300, INTERVALO2 = 1000;
        final double IMPORTE1 = 0.20, IMPORTE2 = 0.15;

        Scanner teclado = new Scanner(System.in);


        System.out.print("Introduzca os kilómetros percorridos: ");
        int kmPercorridos = teclado.nextInt();

        double precioFinal = FIXO;

        if (kmPercorridos > INTERVALO1 && kmPercorridos <= INTERVALO2)
            precioFinal += (kmPercorridos - INTERVALO1) * IMPORTE1;
        else if (kmPercorridos > INTERVALO2)
            precioFinal += (INTERVALO2 - INTERVALO1) * IMPORTE1 + (kmPercorridos - INTERVALO2) * IMPORTE2;



        System.out.printf("O prezo final é: %.2f €", precioFinal);
    }
    }

