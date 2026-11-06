package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe a frase: ");
        String frase = teclado.nextLine();
        int length = frase.length();
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int cont = 0; cont < length; cont++) {
            char caracter = frase.charAt(cont);
            if (eVogal(caracter)) {
                switch (calVogal(caracter)) {
                    case 1 -> a++;
                    case 2 -> e++;
                    case 3 -> i++;
                    case 4 -> o++;
                    case 5 -> u++;
                }
            }
        }
        System.out.println("A: " + a);
        System.out.println("E: " + e);
        System.out.println("I: " + i);
        System.out.println("O: " + o);
        System.out.println("U: " + u);

    }

    public static boolean eVogal ( char caracter){
        return caracter == 'A' | caracter == 'E' | caracter == 'I' | caracter == 'O' | caracter == 'U' |
                caracter == 'a' | caracter == 'e' | caracter == 'i' | caracter == 'o' | caracter == 'u' |
                caracter == 'Á' | caracter == 'É' | caracter == 'Í' | caracter == 'Ó' | caracter == 'Ú' |
                caracter == 'á' | caracter == 'é' | caracter == 'í' | caracter == 'ó' | caracter == 'ú';
    }

    public static int calVogal (char caracter) {
        int calvogal = 0;
        if (caracter == 'A' | caracter == 'a' | caracter == 'Á' | caracter == 'á')
           calvogal = 1;
        if (caracter == 'E' | caracter == 'e' | caracter == 'É' | caracter == 'é')
            calvogal = 2;
        if (caracter == 'I' | caracter == 'i' | caracter == 'Í' | caracter == 'í')
            calvogal = 3;
        if (caracter == 'O' | caracter == 'o' | caracter == 'Ó' | caracter == 'ó')
            calvogal = 4;
        if (caracter == 'U' | caracter == 'u' | caracter == 'Ú' | caracter == 'ú')
            calvogal = 5;
        return calvogal;
    }
}
