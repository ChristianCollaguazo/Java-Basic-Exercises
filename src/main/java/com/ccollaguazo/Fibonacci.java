package com.ccollaguazo;

public class Fibonacci {
    public void getFibonacci(int n) {
        int numP = 0;
        int numS = 1;
        
        System.out.print(numS);
        for(int i = 1; i < n; i++) {
            int temp = numS;
            numS = numS + numP;
            numP = temp;
            System.out.print(", " + numS);
        }
    }
}
