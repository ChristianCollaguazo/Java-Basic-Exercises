package com.ccollaguazo;

// Determine el menor valor de 5 números, indicando además a qué orden
// pertenece. No considere que el menor valor puede repetirse. Por ejemplo, si los
// números ingresados fueran: 14, 19, 14, 16, 19. El resultado debe ser: “El menor
// valor ingresado fue 14 y corresponde al 3° número ingresado”.
public class MenorNumero {

    public void getMenorNumero(int[] numeros) {
        if (numeros.length != 5) {
            throw new Error("Debe ingresar 5 numeros");
        }
        int menor = numeros[0];
        int posicion = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
                posicion = i;
            }
        }

        System.out.println(
                "El menor valor ingresado fue: " + menor + " y corresponde al " + (posicion + 1)
                        + "° numero ingresado");
    }
}
