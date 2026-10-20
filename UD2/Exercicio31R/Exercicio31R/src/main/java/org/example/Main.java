package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduzca o importe a cobrar: ");
        int importe = teclado.nextInt();
        int billetes = 0;

        while (importe >= 200) {
            billetes++;
            importe -= 200;
        }

        if (billetes > 0)
            System.out.println(billetes + " billete de 200€");
        billetes = 0;

        while (importe >= 100) {
            billetes++;
            importe -= 100;
        }

        if (billetes > 0)
            System.out.println(billetes + " billete de 100€");
        billetes = 0;

        while (importe >= 50) {
            billetes++;
            importe -= 50;
        }

        if (billetes > 0)
            System.out.println(billetes + " billete de 50€");
        billetes = 0;

        while (importe >= 20) {
            billetes++;
            importe -= 20;
        }

        if (billetes > 0)
            System.out.println(billetes + " billete de 20€");
        billetes = 0;

        while (importe >= 10) {
            billetes++;
            importe -= 10;
        }

        if (billetes > 0)
            System.out.println(billetes + " billete de 10€");
        billetes = 0;

        while (importe >= 5) {
            billetes++;
            importe -= 5;
        }

        if (billetes > 0)
            System.out.println(billetes + " billete de 5€");
        billetes = 0;

        while (importe >= 2) {
            billetes++;
            importe -= 2;
        }

        if (billetes > 0)
            System.out.println(billetes + " moneda de 2€");
        billetes = 0;

        while (importe == 1) {
            billetes++;
            importe -= 1;
        }

        if (billetes > 0)
            System.out.println(billetes + " moneda de 1€");
        billetes = 0;








    }
}
