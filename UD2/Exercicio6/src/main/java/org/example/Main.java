package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        int fillos;
        double salario, retencion = 0, salarioFinal;

        System.out.println("Indica o salario bruto: ");
        salario = teclado.nextDouble();
        System.out.println("Indica o número de fillos: ");
        fillos = teclado.nextInt();


        if (fillos <= 2) {
            retencion = 0.2;
        } else if (fillos <= 5) {
            retencion = 0.15;
        } else if (fillos <= 7) {
            retencion = 0.10;
        } else if (fillos <= 9) {
            retencion = 0.05;
        } else {
            retencion = 0;
        }

        salarioFinal = salario - (salario * retencion);
        System.out.println(salarioFinal);

    }
}
