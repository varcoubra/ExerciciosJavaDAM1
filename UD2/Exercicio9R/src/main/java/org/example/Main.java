package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduce o número a factorizar: ");
        int num = teclado.nextInt();
        long factorial = 1;

        if (num <= 1)
            factorial = 1;
        else {
            for (int i = 1; i <= num; i++){
                factorial *= i;
            }
        }

        System.out.println("O factorial é: " + factorial);

    }
}
