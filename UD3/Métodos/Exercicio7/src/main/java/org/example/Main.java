package org.example;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduce a data no formato dd/mm/aa: ");
        String data = teclado.nextLine();
        int dia =  parseInt(data.substring(0,2));
        int mes = parseInt(data.substring(3,5));
        int ano = parseInt(data.substring(6));

        if (dataCorrecta(dia, mes, ano))
            System.out.println("A data é correcta");
        else
            System.out.println("A data é incorrecta");

        }

    public static boolean eBisesto(int ano) {
        return ano % 4 == 0 && (ano % 100 != 0 || (ano % 400 == 0));
    }

    public static int getDiasAno(int mes, int ano) {
        int dias;
        switch (mes) {
            case 4, 6, 9, 11 -> dias = 30;
            case 2 -> dias = 28;
            default -> dias = 31;
        }
        if (mes == 2 && eBisesto(ano))
            dias = 29;
        return dias;
    }

    public static boolean dataCorrecta(int dia, int mes, int ano) {
        return mes > 0 && mes < 13 && dia > 0 && dia <= getDiasAno(mes, ano);
    }
}









