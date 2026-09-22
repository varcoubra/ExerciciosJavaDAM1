package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        int unidades;
        double prezo;

        System.out.print("Escriba o número de unidades: ");

        unidades = teclado.nextInt();


        System.out.println("Escriba o prezo do artigo: ");

        prezo = teclado.nextDouble();

        double desconto;

        if (unidades >= 100) {
            desconto = 0.4;

        }

        else {

            if (unidades >= 25 && unidades <= 100) {
                desconto = 0.2;
            }

            else {
                if (unidades >= 10 && unidades <= 24) {
                    desconto = 0.1;
                }
                else {
                    desconto = 0;
                }
            }

        }

        double prezoFinal;

        prezoFinal = prezo * (1 - desconto) * unidades;

        System.out.println("O prezo final é: " + prezoFinal);








    }
}
