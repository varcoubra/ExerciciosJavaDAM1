package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nCantos termos desexa calcular?: ");
        int termos = teclado.nextInt();
        double a = 0, b = 2;
        double resultado = 0;

        for (int i = 0; i < termos; i++){
            resultado += + a / b;
            a += 5;
            b *= 3;
        }

        System.out.println("O resultado é: " + resultado);
    }
}
