package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        // Declaro as variables.
        int q, n;
        q=2;
        n=10;

        // Primeira operación
        q=++n*3;
        System.out.println(q);

        // Segunda operación
        n=10;
        q=n++*3;
        System.out.println(q);

    }
}
