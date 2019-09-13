package Practicas4;

import java.util.Scanner;

// nos pide 10 números y un método los suma
public class Ejercicio2 {
    static final int LONGITUD = 10;

    public static int suma() {
        int suma = 0, num = 0;
        int v[];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < LONGITUD; i++) {
            System.out.println("Introduce número: ");
            num = teclado.nextInt();
            suma = suma + num;
        }

        return suma;
    }

    public static void main(String[] args) {
        int respuesta;
        respuesta = suma();

        System.out.println("La suma es: " + respuesta);
    }
}
