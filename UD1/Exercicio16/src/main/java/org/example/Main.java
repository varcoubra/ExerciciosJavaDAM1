package org.example;

// Unha aplicación emprega unha variable enteira chamada contador cuxos valores deben
//estar no rango [0, 10]. Ao incrementar o valor da variable, este debe permanecer
//sempre dentro do rango anterior, funcionando de forma circular. Por exemplo, se o seu
//valor é 8, incrementalo será igual a 9, pero incrementalo de novo será igual a 0.
//Escribe unha aplicación que, independentemente do valor inicial da variable, a
//incremente nunha unidade e permaneza sempre dentro do rango anterior.
//O incremento de variables debe facerse nunha única instrución

public class Main {
    static void main() {

        int contador = 9;

        System.out.println(contador);

        contador = ++contador % 10;

        System.out.println(contador);

    }
}
