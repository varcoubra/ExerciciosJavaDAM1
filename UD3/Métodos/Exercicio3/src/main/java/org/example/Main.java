package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("\nIntroduce o número a invertir: ");
        n = teclado.nextInt();
        System.out.println("O número " + n + " invertido é " + invertido(n));
        if(n == invertido(n))
            System.out.println("O número é capicúa");

    }

    static public int invertido(int n) {
        int dixito;
        String invertido = "";
        int intvertido;

        while(n > 0) {
            dixito = n % 10;
            invertido += dixito;
            n /= 10;
        }
        intvertido = Integer.parseInt(invertido);
        return intvertido;
    }
}
