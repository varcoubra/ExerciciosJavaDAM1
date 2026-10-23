package org.example;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        int n = 0, suma = 0;

        do {
            n++;
            suma += n;
        } while (suma <= 10000);

        System.out.println("Valor de n: " + n);
        System.out.println("Suma: " + suma);

    }
}
