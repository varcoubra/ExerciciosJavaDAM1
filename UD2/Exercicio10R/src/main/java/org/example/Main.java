package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIndica o número de termos: ");
        int n = teclado.nextInt();
        int termo = 1;

        for (int i = 0; i < n; i++){
            System.out.print(termo + " ");
            termo *= -2;
        }
    }
}
