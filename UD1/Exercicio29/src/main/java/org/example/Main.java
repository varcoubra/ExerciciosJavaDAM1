package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        final double G = 6.673E-8;

        double m1 = 10, m2 = 5, d = 2;

        double fuerza;

        fuerza = G * m1 * m2 / Math.pow(d, 2) ;

        System.out.println(fuerza);

    }
}
