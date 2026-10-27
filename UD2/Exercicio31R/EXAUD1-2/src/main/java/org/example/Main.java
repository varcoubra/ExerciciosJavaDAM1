package org.example;

import java.util.Scanner;


public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int opcion, n, n1, n2, suma;

        do {
            System.out.println("***************");
            System.out.println("Aritmética Yahoo");
            System.out.println("***************");
            System.out.println("Menú de opcións:");
            System.out.println("1.Operación seguinte");
            System.out.println("2.Operación sumar");
            System.out.println("3.Saír");
            System.out.print("\nElixe unha opción: ");
            opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.println("Operación seguinte");
                System.out.println("Introduce un número (-1 para descoñecido, 5 para moitos):");
                n = teclado.nextInt();
                n++;
                if (n <= 0)
                    System.out.println("Resultado: Descoñecido");
                if (n > 4)
                    System.out.println("Resultado: Moitos");
                if (n > 0 && n <= 4)
                    System.out.println("Resultado: " + n);
            }

            if (opcion == 2) {
                System.out.println("Introduce o primeiro número (-1 para descoñecido, 5 para moitos):");
                n1 = teclado.nextInt();
                System.out.println("Introduce o segundo número (-1 para descoñecido, 5 para moitos):");
                n2 = teclado.nextInt();
                suma = n1 + n2;

                if (n1 < 0 || n2 < 0)
                    suma = -1;
                if (suma < 0)
                    System.out.println("Resultado: Descoñecido");
                if (suma > 4)
                    System.out.println("Resultado: Moitos");
                if (suma >= 0 && suma <= 4)
                    System.out.println("Resultado: " + suma);

            }

            if (opcion < 1 || opcion > 4)
                System.out.println("Opción incorrecta");

        } while (opcion != 3);


    }

}


