package com.ccollaguazo;

public class Caracol {

    public void getCaracol(int filas, int columnas) {
        int totalNumeros = filas * columnas;
        int numeroActual = 1;
        String estado = "derecha";
        int[][] matrizCaracol = new int[filas][columnas];
        int[] pE1 = { 0, 0 };
        int[] pE2 = { 1, columnas - 1 };
        int[] pE3 = { filas - 1, columnas - 2 };
        int[] pE4 = { filas - 2, 0 };
        int iE1 = columnas;
        int iE2 = filas - 1;
        int iE3 = columnas - 1;
        int iE4 = filas - 2;

        while (numeroActual <= totalNumeros) {
            switch (estado) {
                case "derecha":
                    for (int i = pE1[1]; i < pE1[1] + iE1; i++) {
                        matrizCaracol[pE1[0]][i] = numeroActual;
                        // System.out.println(i + "," + numeroActual + ", R" + ",");
                        numeroActual++;

                    }
                    pE1[0] = pE1[0] + 1;
                    pE1[1] = pE1[1] + 1;
                    iE1 -= 2;
                    estado = "abajo";

                    break;
                case "abajo":
                    for (int i = pE2[0]; i < pE2[0] + iE2; i++) {
                        matrizCaracol[i][pE2[1]] = numeroActual;
                        // System.out.println(i + "," + numeroActual + ", D" + ",");
                        numeroActual++;
                    }
                    pE2[0] = pE2[0] + 1;
                    pE2[1] = pE2[1] - 1;
                    iE2 -= 2;
                    estado = "izquierda";
                    break;
                case "izquierda":
                    for (int i = pE3[1]; i > pE3[1] - iE3; i--) {
                        matrizCaracol[pE3[0]][i] = numeroActual;
                        // System.out.println(i + "," + numeroActual + ", L" + ",");
                        numeroActual++;

                    }
                    pE3[0] = pE3[0] - 1;
                    pE3[1] = pE3[1] - 1;
                    iE3 -= 2;
                    estado = "arriba";
                    break;
                case "arriba":
                    for (int i = pE4[0]; i > pE4[0] - iE4; i--) {
                        matrizCaracol[i][pE4[1]] = numeroActual;
                        // System.out.println(i + "," + numeroActual + ", U" + ",");
                        numeroActual++;
                    }
                    pE4[0] = pE4[0] - 1;
                    pE4[1] = pE4[1] + 1;
                    iE4 -= 2;
                    estado = "derecha";
                    break;
                default:
                    break;
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizCaracol[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
