package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int suma = 0, n;

        do {
            System.out.print("\nTeclea un número (0 para rematar): ");
            n = teclado.nextInt();
            if (n > 0)
                suma += n;

        } while (n != 0);

        System.out.println("Suma dos positivos: " + suma);

    }
}
