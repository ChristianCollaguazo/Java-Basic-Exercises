package com.ccollaguazo;

public class TrianguloPascal {
    public void getTrianguloPascal(int altura) {
        // 1 * 2 - 1 = 1
        // 2 * 2 - 1 = 3
        // 3 * 2 - 1 = 5
        // 4 * 2 - 1 = 7
        // altura * 2 - 1 = ancho

        int ancho = altura * 2 - 1;
        int inicio = (int) Math.ceil(ancho / 2.0);
        int fin = (int) Math.ceil(ancho / 2.0);
        int[][] triangulo = new int[altura][ancho];

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                triangulo[i][j] = 0;
            }
        }
        triangulo[0][inicio - 1] = 1;
        for (int i = 1; i <= altura; i++) {

            for (int j = 1; j <= fin; j++) {

                if (j >= inicio && j <= fin) {
                    if (j == inicio && i >= 2) {
                        triangulo[i - 1][j - 1] = triangulo[i - 2][j - 1 + 1];
                    } else if (j == fin && i >= 2) {
                        triangulo[i - 1][j - 1] = triangulo[i - 2][j - 1 - 1];
                    } else if (i >= 2) {
                        triangulo[i - 1][j - 1] = triangulo[i - 2][j - 1 - 1] + triangulo[i - 2][j - 1 + 1];
                    }
                    if (triangulo[i - 1][j - 1] != 0) {
                        System.out.print(triangulo[i - 1][j - 1] + "\t");
                    } else {
                        System.out.print("\t");
                    }

                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
            inicio--;
            fin++;
        }
    }

    public void getTrianguloPascalMejorado(int altura) {

        int arrayAnterior[] = new int[1];
        int ancho = altura - 1;
        for (int i = 0; i < altura; i++) {
            int[] arrayActual = new int[i + 1];
            arrayActual[0] = 1;
            arrayActual[i] = 1;
            for (int j = 1; j < i; j++) {
                arrayActual[j] = arrayAnterior[j - 1] + arrayAnterior[j];
            }
            for (int j = 0; j < ancho; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < arrayActual.length; j++) {
                System.out.print(arrayActual[j] + "\t\t");

            }
            ancho--;
            arrayAnterior = arrayActual;
            System.out.println();

        }
    }

}
