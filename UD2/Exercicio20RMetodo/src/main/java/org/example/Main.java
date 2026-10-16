package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        int opcion = menu();

        do {
            opcion = menu();
            switch (opcion) {
                case 1 -> System.out.println("\nElixiches cadrado");
                case 2 -> System.out.println("\nElixiches rectángulo");
                case 3 -> System.out.println("\nElixiches triángulo");
                case 4 -> System.out.println("\nElixiches círculo");
                case 0 -> System.out.println("\nSaíndo do programa");
                default -> System.out.println("\nA opción seleccionada non existe");
            }
        } while (opcion != 0);
    }

    public static int menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n     MENÚ   ");
        System.out.println("***************");
        System.out.println("\n1. Cadrado.");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("4. Círculo");
        System.out.println("0. Saír");
        System.out.print("\nTeclee unha opción: ");
        int op = teclado.nextInt();

        return op;
    }

}
