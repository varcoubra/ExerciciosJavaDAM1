package org.example;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduce un número binario: ");
        int binario = teclado.nextInt();
        while (!comprobarBinario(binario)) {
            System.out.print("\nIntroduce un número binario: ");
            binario = teclado.nextInt();
        }
        System.out.println("\nBinario: " + binario + ", Decimal: " + calcularDecimal(binario));
    }

    public static int calcularDecimal(int n) {
        int calculo = 0;
        int posicion = 0;
        while (n > 0) {
            int dixito = n % 10;
            calculo = calculo + (dixito *  Math.powExact(2, posicion));
            n /= 10;
            posicion++;
        }
        return calculo;
    }

    public static boolean comprobarBinario(int n) {
        boolean binario = true;
        while (n > 0 && binario) {
            int dixito = n % 10;
            if (dixito > 1)
                binario = false;
            n /= 10;
        }
        return binario;
    }
}

