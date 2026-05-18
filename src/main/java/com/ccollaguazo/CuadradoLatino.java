package com.ccollaguazo;

public class CuadradoLatino {
    // modulos
    // 1 2 3 4 -> {1 2 3 4}
    // (5 - 1) 5 6 7 -> {4 1 2 3}
    // (8 - 1) 8 9 10 -> {3 4 1 2}
    // (11 - 1) 11 12 13 -> (2 3 4 1)
    public void getCuadradoLatino(int n) {
        int[][] cuadrado = new int[n][n];
        int cont = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cuadrado[i][j] = cont % n == 0 ? n : cont % n;
                cont++;
            }
            cont--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(cuadrado[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // patrones
    // int[] arr = {1, 2, 3, 4, 5}; matriz [0] [j] = {1, 2, 3, 4, 5}
    // int[] arr = {5, 1, 2, 3, 4}; matriz [0] [j] = {5, 1, 2, 3, 4}
    // int[] arr = {4, 5, 1, 2, 3}; matriz [0] [j] = {4, 5, 1, 2, 3}
    public void getCuadradoLatino2(int n) {
        int[] arr = new int[n];
        int[][] cuadrado = new int[n][n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
            cuadrado[0][i - 1] = i;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[j] = arr[j] - 1 == 0 ? n : arr[j] - 1;
                cuadrado[i][j] = arr[j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(cuadrado[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Rotacion
    // int[] arr = {1, 2, 3, 4, 5}; matriz [0] [j] = {1, 2, 3, 4, 5}
    // int[] arr = {5, 1, 2, 3, 4}; matriz [1] [j] = {0, 1, 2, 3, 4}
    // int[] arr = {4, 5, 1, 2, 3}; matriz [2] [j] = {4, 5, 1, 2, 3}
    public void getCuadradoLatino3(int n) {
        int[] arr = new int[n];
        int[][] cuadrado = new int[n][n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
            cuadrado[0][i - 1] = i;
        }

        for (int i = 1; i < n; i++) {
            int temp = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
                cuadrado[i][j] = arr[j];
            }
            arr[0] = temp;
            cuadrado[i][0] = arr[0];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(cuadrado[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
