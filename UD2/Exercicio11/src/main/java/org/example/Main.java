package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int ano;
        System.out.print("\nEscriba o ano: ");
        ano = teclado.nextInt();

        if (ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 !=0)) {
            System.out.println("O ano " + ano + " é bisiesto");
        } else
            System.out.println("O ano " + ano + " non é bisiesto");

    }
}
