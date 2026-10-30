package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        // f(x, y ,z) =  (x * x) + (2 * x * y) - (3 * y * z) + (x * z)

        int x, y, z, f;
        final int LIMITEMENOR = -5;
        final int LIMITEMAIOR = 7;
        int best = Integer.MIN_VALUE, xG = 0, yG = 0, zG = 0;

        x = LIMITEMENOR;
        y = LIMITEMENOR;
        z = LIMITEMENOR;

       for (x = LIMITEMENOR; x <= LIMITEMAIOR; x++) {

           f = (x * x) + (2 * x * y) - (3 * y * z) + (x * z);
           if (f > best) {
               best = f;
               xG = x;
               yG = y;
               zG = z;
           }
           for (y = LIMITEMENOR; y <= LIMITEMAIOR; y++) {

               f = (x * x) + (2 * x * y) - (3 * y * z) + (x * z);
               if (f > best) {
                   best = f;
                   xG = x;
                   yG = y;
                   zG = z;
               }
               for (z = LIMITEMENOR; z <= LIMITEMAIOR; z++) {

                   f = (x * x) + (2 * x * y) - (3 * y * z) + (x * z);
                   if (f > best) {
                       best = f;
                       xG = x;
                       yG = y;
                       zG = z;
                   }
               }
           }
       }
        System.out.println("Valor máximo da función en [" + LIMITEMENOR + "," + LIMITEMAIOR + "]: " + best);
        System.out.println("Os valores que fan máxima a función son:");
        System.out.println("x: " + xG);
        System.out.println("y: " + yG);
        System.out.println("z: " + zG);
    }
}
