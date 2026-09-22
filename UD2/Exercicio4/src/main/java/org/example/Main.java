package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3, n4;

        System.out.print("Escriba o primeiro número: ");

        n1 = teclado.nextInt();

        System.out.print("Escriba o segundo número: ");

        n2 = teclado.nextInt();

        System.out.print("Escriba o terceiro número: ");

        n3 = teclado.nextInt();

        System.out.print("Escriba o cuarto número: ");

        n4 = teclado.nextInt();

        if (n1 <= n2 && n1 <= n3 && n1 <= n4) {
            System.out.printf("O número máis pequeno é: %d" , n1);
        }

        else {

            if (n2 <= n1 && n2 <= n3 && n2 <= n4) {
                System.out.printf("O número máis pequeno é: %d" , n2);
            }

            else{

                if (n3 <= n2 && n3 <= n1 && n1 <= n4) {
                    System.out.printf("O número máis pequeno é: %d" , n3);
                }

                else {

                    if (n4 <= n2 && n4 <= n3 && n4 <= n1) {
                        System.out.printf("O número máis pequeno é: %d" , n4);
                    }

                    else {

                        System.out.println("Error");

                    }

                }

            }

        }

    }
}
