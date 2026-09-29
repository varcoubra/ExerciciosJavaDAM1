package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        int dia, mes, ano, a, b, c, d, e, f;
        System.out.print("\nIntroduzca a data separada por espacios (dia mes ano): ");
        dia = teclado.nextInt();
        while (dia < 1 || dia > 31) {
            System.out.print("Ese día non é válido.\nIntroduce un día válido: ");
            dia = teclado.nextInt();
        }
        mes = teclado.nextInt();
        ano = teclado.nextInt();

        double g, h, i, j;

        a = (12 - mes) / 10;
        b = ano - a;
        c = mes + (12 * a);
        d = b / 100;
        e = d / 4;
        f = 2 - d + e;
        g = Math.floor(365.25 * b);
        h = Math.floor(30.6001 * (c + 1));
        i = f + g + h + dia + 5;
        j = i % 7;
        int diaSemana = (int) j;

        switch (diaSemana) {
            case 0:
                System.out.println("Sábado");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Luns");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Mércores");
                break;
            case 5:
                System.out.println("Xoves");
                break;
            case 6:
                System.out.println("Venres");
                break;
        }
    }
}
