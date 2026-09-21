package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        double media = 7, exame = 6, proxecto = 8 ;

        double notaFinal;

        notaFinal = (media * 0.55) + (exame * 0.30) + (proxecto * 0.15);

        System.out.printf("A nota final é: %.3f" , notaFinal);
    }
}
