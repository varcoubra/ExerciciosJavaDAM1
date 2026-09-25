package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        int hora, minutos;

        System.out.println("Indica a hora e minutos (separados por espacio): ");
        hora = teclado.nextInt();
        minutos = teclado.nextInt();

        //Cálculos
        if (hora >23 || hora < 0 || minutos > 59)
            System.out.println("Esa hora es incorrecta");
        else
            if (hora >= 12) {
                if (hora > 12)
                    hora -= 12; // horas = horas - 12
                System.out.printf("%02d:%02d PM %n", hora, minutos);
            }
            else
                if (hora == 0)
                    hora +=12;
                System.out.printf("%02d:%02d AM %n", hora, minutos);



    }
}
