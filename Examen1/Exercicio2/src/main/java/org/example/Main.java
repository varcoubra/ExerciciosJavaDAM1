package org.example;

import java.util.Scanner;

public class Main {
    static void main() {

        // Declaración de variables. Inicializo as necesarias para que o programa funcione,
        // aínda que algunhas se sobreescriban ese dato máis adiante.

        Scanner teclado = new Scanner(System.in);
        int opcion, alumnos, numeroAprobados;
        double nota, sumatorioNotas, media = 0, porcentaxeAprobados = 0;
        boolean grupoActivo = false, insuficientes = false;

        do {
            // Menú interactivo, realiza a as distintas tarefas según a opción indicada
            // e volve a pedir a opción se non é (0-4)

            System.out.println("""
                    \n=== XESTIÓN ACADÉMICA ===
                    1. Procesar cualificacións do grupo
                    2. Obter estatísticas (media e % aprobados)
                    3. Comprobar existencia de insuficientes graves (< 3.0)
                    4. Saír""");
            System.out.print("Elixe unha opción: ");
            opcion = teclado.nextInt();

            if (opcion == 1) {

                // Reinicio das variables

                sumatorioNotas = 0;
                numeroAprobados = 0;
                insuficientes = false;

                do {

                    // Pide o número de alumnos, se non é correcto volve a pedir

                    System.out.print("\nIntroduce o número de alumnos do grupo (maior que 0): ");
                    alumnos = teclado.nextInt();
                }while (alumnos <= 0);

                // Por cada alumno, pide a nota deste (volve pedila se é errónea)
                // Anota o número de aprobados e se hai algún insuficiente

                for (int i = 1; i <= alumnos; i++) {
                    do {
                    System.out.print("\nAlumno " + i + " -> Introduce nota (0.0 - 10.0): ");
                    nota = teclado.nextDouble();
                    }while (nota < 0.0 || nota > 10.0);

                    if (nota >= 5) {
                        numeroAprobados++;
                    }

                    if (nota < 3) {
                        insuficientes = true;
                    }
                    sumatorioNotas += nota;
                }

                // Realiza as operacións para mostrar os datos nas opción (2-3)

                media = sumatorioNotas / alumnos;
                porcentaxeAprobados = (double) numeroAprobados / alumnos * 100;
                grupoActivo = true;

            }
            else if (opcion == 2) {

                // grupoActivo é utilizado para comprobar se se fixo a opción 1
                // Mostra os datos

                if (grupoActivo) {
                    System.out.printf("""
                            \n--- ESTATÍSTICAS DO GRUPO ---
                            nota media do grupo : %.2f
                            Porcentaxe de aprobados: %.2f
                            """, media, porcentaxeAprobados);
                }else
                    System.out.println("Aviso: Aínda non se procesaron datos de ningún tipo");
            }
            else if (opcion == 3) {

                // grupoActivo é utilizado para comprobar se se fixo a opción 1
                // Mostra os datos

                if (grupoActivo) {
                    if (insuficientes)
                        System.out.println("Atención: Detectouse polo menos unha nota inferior a 3.0 no grupo.");
                    else
                        System.out.println("Non se detectou ningún insuficiente.");
                }else
                    System.out.println("Aviso: Aínda non se procesaron datos de ningún tipo");

            }

            // A opción 4 termina o programa

            else if (opcion == 4)
                System.out.println("Saíndo do programa...");
            else {
                System.out.println("Opción incorrecta");
            }

        }while (opcion!= 4);

    }
}
