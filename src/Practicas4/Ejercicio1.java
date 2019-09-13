package Practicas4;

import java.util.Scanner;

public class Ejercicio1 {
    public static char obtenerNota(double nota){
        if (nota < 5 && nota >= 0) {
            return 'S';
        }
        else if (nota >= 5 && nota <= 10){
            return 'A';
        }
        else {
            return 'E';
        }
    }

    public static void main(String[] args) {
        int calificacion;
        char res;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una calificación: ");
        calificacion = teclado.nextInt();

        res = obtenerNota(calificacion);
        System.out.println("El resultado es: " + res);
    }
}
