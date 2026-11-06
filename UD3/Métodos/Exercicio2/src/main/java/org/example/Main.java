package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int l1, l2, l3;
        do {
            System.out.print("\nIndica a lonxitude do primeiro lado: ");
            l1 = teclado.nextInt();
            System.out.print("\nIndica a lonxitude do segundo lado: ");
            l2 = teclado.nextInt();
            System.out.print("\nIndica a lonxitude do terceiro lado: ");
            l3 = teclado.nextInt();
        } while (!eTriangulo(l1, l2, l3));

        if (eEquilatero(l1, l2, l3))
            System.out.println("Triángulo equilátero");
        if (eIsosceles(l1, l2, l3))
            System.out.println("Triángulo isósceles");
        if (!eEquilatero(l1, l2, l3) && !eIsosceles(l1, l2, l3))
            System.out.println("Triángulo escaleno");

    }

    public static boolean eTriangulo(int l1, int l2, int  l3) {
        boolean etriangulo = l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1;
        return etriangulo;
    }

    public static boolean eEquilatero(int l1, int l2, int l3) {
        boolean eEquilatero = l1 == l2 && l1 == l3;
        return eEquilatero;
    }

    public static boolean eIsosceles(int l1, int l2, int l3) {
        boolean eIsosceles = l1 == l2 && l1 != l3|| l1 == l3 && l1 != l2 || l2 == l3 && l2 != l1;
        return eIsosceles;
    }
}
