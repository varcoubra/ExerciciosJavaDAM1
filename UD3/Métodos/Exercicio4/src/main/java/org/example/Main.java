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
        for (int i = 0; i < length; i++) {
            char caracter = frase.charAt(i);
            if (eVogal(caracter))
                System.out.println(caracter + " é vogal");
            else if (eConsoante(caracter))
                System.out.println(caracter + " é consoante");
            else if (eNumero(caracter))
                System.out.println(caracter + " é número");
            else if (eSimbolo(caracter))
                System.out.println(caracter + " é símbolo");
        }
    }
    public static boolean eVogal ( char caracter){
        return caracter == 'A' | caracter == 'E' | caracter == 'I' | caracter == 'O' | caracter == 'U' |
                caracter == 'a' | caracter == 'e' | caracter == 'i' | caracter == 'o' | caracter == 'u' |
                caracter == 'Á' | caracter == 'É' | caracter == 'Í' | caracter == 'Ó' | caracter == 'Ú' |
                caracter == 'á' | caracter == 'é' | caracter == 'í' | caracter == 'ó' | caracter == 'ú';
    }

    public static boolean eLetra (char caracter) {
        return caracter >= 'a' && caracter <= 'z' || caracter >= 'A' && caracter <= 'Z';
    }

    public static boolean eConsoante (char caracter) {
        return !eVogal(caracter) && eLetra(caracter);
    }

    public static boolean eNumero (char caracter) {
        return caracter >= '0' && caracter <= '9';
    }

    public static boolean eSimbolo (char caracter) {
        return !eLetra(caracter) && !eNumero(caracter);
    }
}
