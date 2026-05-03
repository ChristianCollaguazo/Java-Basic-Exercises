package com.ccollaguazo;

public class TrianguloNumeros {
    public void getTriangulo(int n) {
        int ancho = 1;
        int imprimir = 1;
        int index = 0;
        while (imprimir <= n) {
            if (index < ancho) {
                System.out.print(imprimir + " ");
                index++;
            } else {
                System.out.println();
                System.out.print(imprimir + " ");
                ancho++;
                index = 1;
            }
            imprimir++;
        }
    }
}
