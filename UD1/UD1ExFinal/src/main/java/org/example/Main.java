package org.example;

// Pide 2 operandos e opera con eles

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        double operando1, operando2, resultado;
        System.out.print("Escriba o valor do primeiro operando: ");
        operando1 = teclado.nextDouble();
        System.out.print("Escriba o valor do segundo operando: ");
        operando2 = teclado.nextDouble();
        resultado = operando1 + operando2;
        System.out.printf("O resultado da suma de %.2f máis %.2f é: %.2f " , operando1, operando2, resultado);

        resultado = operando1 - operando2;
        System.out.printf("\nO resultado da resta de %.2f máis %.2f é: %.2f " , operando1, operando2, resultado);

        resultado = operando1 * operando2;
        System.out.printf("\nO resultado da multiplicación de %.2f máis %.2f é: %.2f " , operando1, operando2, resultado);

        if(operando2 != 0) {
            resultado = operando1 / operando2;
            System.out.printf("\nO resultado da división de %.2f máis %.2f é: %.2f ", operando1, operando2, resultado);
        }

        else {
            System.out.println("\nNon se pode dividir entre 0");
        }

        System.out.println("\nGrazas por usar a aplicación :)");

    }
}
