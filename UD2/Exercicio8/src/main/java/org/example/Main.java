package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        int n, a, b, c, d;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba el número de 4 dígitos a redondear a la centena: ");

        n = teclado.nextInt();

        a = n / 1000;
        b = n % 1000 / 100;
        c = n % 1000 % 100 / 10;
        d = n % 1000 % 100 % 10;

        System.out.printf("Millares: %d Centenas: %d Decenas: %d Unidades: %d", a, b, c, d);

        if(c >= 5) {
            b += 1;
            c = 0;
            d = 0;
        }
        else {
            c = 0;
            d = 0;
        }

        System.out.printf("\n%d%d%d%d\n", a, b, c, d);

    }
}
