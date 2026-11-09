package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        String  sexo = "";
        int altura;
        do {
            System.out.print("\nIntroduce o sexo (M o F): ");
            sexo = teclado.next();
            System.out.print("Introduce a altura en cm: ");
            altura = teclado.nextInt();
                System.out.println("\nA súa talla é: " + tipoTalla(sexo, altura));
        } while (altura != 0);

    }

    public static String tipoTalla(String sexo, int altura) {
        String talla = "";
        if(sexo.equalsIgnoreCase("m") && altura <= 160 || sexo.equalsIgnoreCase("f") && altura <= 150)
            talla = "Baixa";
        else if (sexo.equalsIgnoreCase("m") && altura >= 175 || sexo.equalsIgnoreCase("f") && altura >= 165)
            talla = "Alta";
        else
            talla = "Normal";
        return talla;
    }
}
