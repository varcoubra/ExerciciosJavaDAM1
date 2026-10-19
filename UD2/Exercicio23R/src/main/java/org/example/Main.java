package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduzca o primero número: ");
        int n1 = teclado.nextInt();
        System.out.print("\nIntroduzca o segundo número: ");
        int n2 = teclado.nextInt();
        int temporal, resultado = 0;

        if (n1 > n2) {
            temporal = n1;
            n1 = n2;
            n2 = temporal;
        }

        for (int i = 0; i < n1; i++) {
            resultado += n2;
        }

        System.out.println("Resultado = " + resultado);
    }

}
