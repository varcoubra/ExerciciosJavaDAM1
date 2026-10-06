package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int num;
        System.out.print("\nEscriba o número: ");
        num = teclado.nextInt();
        double resultado = 0;
        for (int i = 0; i != num; i++){

            resultado = resultado + ( 1.0 / (1 + i) );
        }

        System.out.printf("A suma é: %.2f\n", resultado);
    }
}
