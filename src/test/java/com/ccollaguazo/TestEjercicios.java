package com.ccollaguazo;

import org.junit.jupiter.api.Test;

public class TestEjercicios {

    @Test
    void testMenorNumero() {
        MenorNumero menorNumero = new MenorNumero();
        int[] numeros = { 14, 19, 13, 16, 1 };
        menorNumero.getMenorNumero(numeros);
    }

    @Test
    void testPagoEstacionamiento() {
        PagoEstacionamiento pagoEstacionamiento = new PagoEstacionamiento();
        int minutos = 126;
        int dia = 2;
        pagoEstacionamiento.getPagoEstacionamiento(minutos, dia);
    }

    @Test
    void testFactorial() {
        Factorial factorial = new Factorial();
        factorial.getFactorial(5);
        factorial.getFactorial(10);
        factorial.getFactorial(0);
        factorial.getFactorial(-1);
    }

    @Test
    void testTrianguloPascal() {
        TrianguloPascal trianguloPascal = new TrianguloPascal();
        trianguloPascal.getTrianguloPascalMejorado(9);
    }

    @Test
    void testTrianguloNumeros() {
        TrianguloNumeros trianguloNumeros = new TrianguloNumeros();
        trianguloNumeros.getTriangulo(16);
    }

}
