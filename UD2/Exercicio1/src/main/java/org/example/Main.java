package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Pide á nota e indica se estás aprobado ou suspenso.

public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        double nota;

        System.out.print("Escriba a nota: ");

        nota = teclado.nextDouble();


        if (nota <0 || nota >10){

            System.out.println("A nota introducida non é válida");

        }

        else

            if (nota >= 5) {

            System.out.println("Estás aprobado");

            }

            else {

            System.out.println("Estás suspenso");

            }



    }
}
