package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int a, b;
        long c = 0;

        System.out.print("\nIntroduce o primer número: ");
        a = teclado.nextInt();
        System.out.print("\nIntroduce o segundo número: ");
        b = teclado.nextInt();

        if (a % 2 != 0)
            a++;

        for (int i = a; i <= b; i += 2) {
             c += i;
        }

        System.out.println(c);
    }
}
