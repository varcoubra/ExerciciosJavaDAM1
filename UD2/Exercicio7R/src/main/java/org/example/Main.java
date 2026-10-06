package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nCantos bits tés?: ");
        int bits = teclado.nextInt();
        double resultado;
        resultado = (double)Math.pow(2,bits);
        System.out.println("Cantidade de posibles números representados: " + (int)resultado);

    }
}
