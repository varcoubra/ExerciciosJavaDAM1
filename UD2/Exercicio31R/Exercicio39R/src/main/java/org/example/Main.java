package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;
        String opcion;
        System.out.print("\nQueres seguir unha secuencia (A)scendente ou (D)escendente?: ");
        opcion = teclado.next();

        while(!opcion.equalsIgnoreCase("A") && !opcion.equalsIgnoreCase("D")) {
            System.out.println("\nOpción incorrecta.");
            System.out.print("\nQueres seguir unha secuencia Ascendente ou Descendente?: ");
            opcion = teclado.next();

        }

        System.out.println("Introduce os números: ");
        n1 = teclado.nextInt();


        if (opcion.equalsIgnoreCase("A")) {

            do {
                n2 = n1;
                n1 = teclado.nextInt();
            } while (n1 > n2);

        }

        if (opcion.equalsIgnoreCase("D")) {

            do {
                n2 = n1;
                n1 = teclado.nextInt();
            } while (n1 < n2);

        }
    }
}
