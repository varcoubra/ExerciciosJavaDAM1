package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduzca o número a pasar a binario: ");
        int n = teclado.nextInt();

        System.out.println("En binario é: " + binario(n));
    }

    public static String binario (int n) {

        String binario = "";
        while (n >= 1) {
            binario = (n % 2) + binario;
            n /= 2;
        }
        return binario;
    }
}
