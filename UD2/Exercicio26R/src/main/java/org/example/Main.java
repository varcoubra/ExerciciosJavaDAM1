package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduce un número: ");
        int numero = teclado.nextInt();
        int contador = 0;
        while (numero != 0) {
            System.out.print("\nIntroduce outro número (0 para rematar): ");
            numero = teclado.nextInt();
            if (numero < 0)
                contador++;
        }

        System.out.println("\nTotal de negativos: " + contador);


    }
}
