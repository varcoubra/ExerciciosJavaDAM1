package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int a, b, c, d;

        System.out.print("Escriba o primeiro número: ");

        a = teclado.nextInt();

        System.out.print("Escriba o segundo número: ");

        b = teclado.nextInt();

        System.out.print("Escriba o terceiro número: ");

        c = teclado.nextInt();

        System.out.print("Escriba o cuarto número: ");

        d = teclado.nextInt();

        if (a < b && a < c && a < d) {
            System.out.println("O número menor é: " + a);
        }

        else if (b < c && c < d) {

        }

    }
}
