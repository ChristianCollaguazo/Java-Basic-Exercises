package com.ccollaguazo;

public class Factorial {
    public void getFactorial(int numero) {
        if (numero < 0) {
            throw new Error("El numero deber ser entero positivo");
        }
        int factorial = 1;
        for (int i = numero; i >= 2; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
