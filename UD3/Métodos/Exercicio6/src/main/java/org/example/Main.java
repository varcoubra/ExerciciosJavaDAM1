package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int mes, ano;
        System.out.println("Escribe o mes e o ano separados por un espacio");
        mes = teclado.nextInt();
        ano = teclado.nextInt();
        int dias = getDiasAno(mes, ano);
        System.out.println("O mes " + mes + " do ano " + ano + " ten " + dias + " días");
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
}
