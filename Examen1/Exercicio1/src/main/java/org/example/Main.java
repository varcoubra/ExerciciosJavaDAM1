package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
/**
 * Queremos atopar x número de músicos que cumplen as seguintes condicións (x = músicos totales):
 * x % 4 == 1       x % 3 == 1      x % 2 == 1      x % 5 == 0
 */
    int musicos = 0;
    while (!(musicos % 4 == 1 && musicos % 3 == 1 && musicos % 2 == 1 && musicos % 5 == 0))
        musicos++;
    System.out.println(musicos);
    }
}
