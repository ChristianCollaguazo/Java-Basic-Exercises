package com.ccollaguazo;

// Pago en estacionamiento
// En una playa de estacionamiento cobran S/. 2.00 por hora o fracción los días Lunes,
// Martes y Miércoles, S/. 2.50 los días Jueves y Viernes, S/. 3.00 los días Sábado y
// Domingo. Se considera fracción de hora cuando haya pasado de 5 minutos. Diseñe un
// programa que determine cuánto debe pagar un cliente por su estacionamiento en un
// solo día de la semana. Si el tiempo ingresado es incorrecto imprima un mensaje de
// error.
public class PagoEstacionamiento {

    public void getPagoEstacionamiento(int minutos, int dia) {
        if (minutos < 0 || dia < 1 || dia > 7) { // !(minutos >= 0 && dia >= 1 && dia <= 7)
            throw new Error("Tiempo o dia ingresado es incorrecto");
        }
        double tarifario[] = { 2, 2, 2, 2.5, 2.5, 3, 3 };
        String dias[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

        // Formula para calcular horas y minutos: horas = [minutos / 60] y
        // minutosrestantes = minutos - horas * 60
        int horas = (int) Math.floor(minutos / 60); // 3.5 3 4.3 4 7.1 7}
        int minutosRestantes = minutos - horas * 60;
        int fraccion = minutosRestantes > 5 ? 1 : 0;
        int totalHoras = horas + fraccion;

        double totalPagar = tarifario[dia - 1] * totalHoras;

        System.out.println("El total a pagar es: " + totalPagar + "$ por el dia: " + dias[dia - 1]
                + " con el tiempo de estacionamiento de: " + horas + " horas y " + minutosRestantes + " minutos");

    }
}
