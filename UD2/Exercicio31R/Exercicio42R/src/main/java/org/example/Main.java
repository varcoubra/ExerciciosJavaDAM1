package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        // 0 = Graza, 1 = Leve, 2 = Grave.

        // Estado  1    2       3
        //   0     1    2       0
        //   1     1    2       0
        //   2     2    2       2

        // estado 3 = salvación, 4 = purgatorio, 5 = condena eterna;

        Scanner teclado = new Scanner(System.in);
        int estado = 0;
        int entrada;

        do {

            System.out.println("1. Falta Leve");
            System.out.println("2. Falta grave");
            System.out.println("3. Arrepentimento");
            System.out.println("4. Morte");
            System.out.println("******************");
            System.out.print("Qué cometiches?: ");
            entrada = teclado.nextInt();


            // 0 = Graza, 1 = Leve, 2 = Grave.

            // Estado  1    2       3
            //   0     1    2       0
            //   1     1    2       0
            //   2     2    2       2

            // estado 3 = salvación, 4 = purgatorio, 5 = condena eterna;

            if (estado == 0) {
                if (entrada == 1)
                    estado = 1;
                if (entrada == 2)
                    estado = 2;
                if (entrada == 4)
                    estado = 3;
            }
            if (estado == 1) {
                if (entrada == 2)
                    estado = 2;
                if (entrada == 3)
                    estado = 0;
                if (entrada == 4)
                    estado = 4;
            }
            if (estado == 2) {
                if (entrada == 4)
                    estado = 5;
            }

            switch (estado) {
                case 0 -> System.out.println("Alma en estado: Graza");
                case 1 -> System.out.println("Alma en estado: Leve");
                case 2 -> System.out.println("Alma en estado: Grave");
                case 3 -> System.out.println("Tes a salvación");
                case 4 -> System.out.println("Estás no purgatorio, e tendrás a salvación");
                case 5 -> System.out.println("Estás condenado eternamente");
            }
            System.out.println("**************\n");

        } while (entrada >= 1 && entrada < 4);



    }
}
