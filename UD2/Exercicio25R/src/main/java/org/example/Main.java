package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        byte contador = 0;
        while (contador <10) {
            contador ++;
            if (contador == 10)
                System.out.println("acción");

        }

        System.out.println("O contador é: " + contador);

    }
}
