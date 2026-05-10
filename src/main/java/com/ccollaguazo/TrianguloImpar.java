package com.ccollaguazo;

public class TrianguloImpar {
    public void getTriangulo(int priNum, int segNum) {
        if(priNum % 2 != 1) {
            throw new Error("El numero es par");
        }
        int filas = (int) Math.ceil(priNum / 2.0);
        int espacios = filas - 1;
        int columna = 1;

        for(int i = 0; i < filas; i++) {

            for(int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < columna; j++) {
                System.out.print(segNum);
            }

            for(int j = 0; j < espacios + 1; j++) {
                System.out.print(" ");
            }
            System.out.print(segNum);
            System.out.println();
            columna += 2;
            espacios--;
        }   
    }
}
