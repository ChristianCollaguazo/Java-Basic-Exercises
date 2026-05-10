package com.ccollaguazo;

public class Pi {
    public void getPi(int n) {
        double suma = 0.0;
        for(int i = 0; i <= n; i++) {
            suma += Math.pow(-1, -i) / (2 * i + 1);
        }
        suma = suma * 4;
        System.err.println("Pi es: " + suma);
    }
}
