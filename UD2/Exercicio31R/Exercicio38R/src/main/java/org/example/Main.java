package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int n1 = 0, n2;

        do {
            n2 = n1;
            System.out.print("\nIntroduce un número: ");
            n1 = teclado.nextInt();
        } while (n1 > n2);

    }
}
