package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int valor;

        System.out.print("Escriba o número: ");

        valor = teclado.nextInt();

        if (valor == 0) {
            System.out.println("O 0 non se considera nin par nin impar");
        }

        else {

            if (valor %2 == 0) {
                System.out.println("O número é par");
            }

            else {
                System.out.println("O número é impar");
            }
        }
    }
}
