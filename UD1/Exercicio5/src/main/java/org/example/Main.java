package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        // Declaro as variables
        int a , b , t ;

        // Doulle valores as variables
        a = 5 ;
        b = 25 ;

        System.out.printf("O valor de a é: %d e o valor de b é: %d \n", a , b);

        t = a;
        a = b;
        b = t;

        System.out.printf("O valor de a é: %d e o valor de b é: %d", a , b);
    }
}
