package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("\n\nEscriba el número de mes: ");
        int numeroMes = teclado.nextInt();
        String nomeMes="";

        switch(numeroMes){
            case 1:
                nomeMes="Xaneiro";
                break;
            case 2:
                nomeMes="Febreiro";
                break;
            case 3:
                nomeMes="Marzo";
                break;
            case 4:
                nomeMes="Abril";
                break;
            case 5:
                nomeMes="Maio";
                break;
            case 6:
                nomeMes="Xuño";
                break;
            case 7:
                nomeMes="Xullo";
                break;
            case 8:
                nomeMes="Agosto";
                break;
            case 9:
                nomeMes="Setembro";
                break;
            case 10:
                nomeMes="Octubre";
                break;
            case 11:
                nomeMes="Novembro";
                break;
            case 12:
                nomeMes="Decembro";
                break;
            default:
                System.out.println("\n\n Ese mes non existe");

        }

        switch (numeroMes){

            case 1, 3, 5, 7, 8, 10, 12 ->
                System.out.println(nomeMes + " ten 31 días");
            case 2 ->
                System.out.println(nomeMes + " ten 28 días");
            default ->
                System.out.println(nomeMes + " ten 30 días");
        }

    }
}
