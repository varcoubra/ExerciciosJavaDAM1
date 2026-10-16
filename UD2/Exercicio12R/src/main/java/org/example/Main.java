package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIntroduce o número do que queres a tabla de multiplicar: ");
        int n = teclado.nextInt();

       if (n >= 0 && n <= 10){

           System.out.println("TÁBOA DO NÚMERO " + n);

           for (int i = 0; i <= 10; i++){

               System.out.println(n + " X " + i + " = " + (n*i));
           }
        }
       else
           System.out.println("Introduce un número do 1 ao 9");
    }
}
