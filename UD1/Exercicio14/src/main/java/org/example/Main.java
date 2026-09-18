package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

    final int SEGUNDOS = 186455;

        System.out.println(SEGUNDOS + " segundos son:");

        int minutos = SEGUNDOS / 60 ;
        int segSobran = SEGUNDOS % 60;
        int horas = minutos / 60;
        int minSobran = minutos % 60;
        int dias = horas / 24;
        int horasSobran = horas % 24;

        System.out.println(dias + " días " + horasSobran + " horas " + minSobran + " minutos " + segSobran + " segundos");
        System.out.println(horas + " horas " + minSobran + " minutos " + segSobran + " segundos");
        System.out.println(minutos + " minutos " + segSobran + " segundos");


    }
}
