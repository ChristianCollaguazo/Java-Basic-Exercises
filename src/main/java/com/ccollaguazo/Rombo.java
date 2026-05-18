package com.ccollaguazo;

// Dibuja un rombo con asteriscos, el número de filas se ingresa por parámetro.
// El número de filas debe ser un número impar mayor o igual a 3. Por ejemplo, 
// si el número de filas es 5, el resultado sería el siguiente:
// |  * 2 - 2 <-> 1 -> 3
// | *** 1 - 3 <-> 0 - 4
// |***** 0 - 4 <-> -1 - 5
// | ***  -1 - 5
// |  *

// 1 2 3 4 5
// 0 1 2 3 4
public class Rombo {
    public void getRombo(int filas) {
        if (filas < 3 || filas % 2 == 0) {
            System.out.println("El número de filas debe ser un número impar mayor o igual a 3.");
            return;
        }
        int mitad = (int) Math.ceil(filas / 2.0) - 1;
        int inicio = mitad;
        int fin = mitad;

        for (int i = 0; i < filas; i++) {
            if (i <= mitad) {
                for (int j = 0; j < inicio; j++) {
                    System.out.print(" ");
                }
                for (int j = inicio; j <= fin; j++) {
                    System.out.print("*");
                }
                inicio--;
                fin++;
            } else {
                if (i == mitad + 1) {
                    inicio += 2;
                    fin -= 2;
                }
                for (int j = 0; j < inicio; j++) {
                    System.out.print(" ");
                }
                for (int j = inicio; j <= fin; j++) {
                    System.out.print("*");
                }
                inicio++;
                fin--;
            }

            System.out.println();

        }
    }
}
