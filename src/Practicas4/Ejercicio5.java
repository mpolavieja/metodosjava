package Practicas4;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("1. Calcular Factorial");
            System.out.println("2. Calcular potencias con bucles");
            System.out.println("3. Calcular sumatorio hasta que se introduzca un valor negativo");
            System.out.println("4. Cociente mediante restas");
            System.out.println("0. Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El factorial del número es " + factorial());
                    break;
                case 2:
                    System.out.println("La potencia de base y exponente es: " + potencia());
                    break;
                case 3:
                    System.out.println("El sumatorio es: " + sumatorio());
                    break;
                case 4:
                    dividirPorRestas();
                    break;
                case 0:
                    System.out.println("Gracias por usar esta calculadora");
                    break;
            }
        } while (opcion != 0);
    }

    public static int pedirNumero() {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num = teclado.nextInt();
        return num;
    }

    public static int factorial() {
        int producto = 1;
        int num = pedirNumero();
        for (int i = num; i > 0; i--) {
            producto = producto * i;
        }
        return producto;
    }
    
    public static int potencia() {
        int base = pedirNumero();
        int exponente = pedirNumero();
        int pot = 1;

        for (int i = 0; i < exponente; i++) {
            pot = pot * base;
        }
        return pot;
    }

    public static int sumatorio() {
        int suma = 0;
        int num = pedirNumero();

        while (num >= 0) {
            suma = suma + num;
            num = pedirNumero();
        }
        return suma;
    }

    public static void dividirPorRestas() {
        int dividendo = pedirNumero();
        int divisor = pedirNumero();
        int cociente = 0;

        while (dividendo >= divisor) {
            dividendo = dividendo - divisor;
            cociente++;
        }
        System.out.println("El cociente es: " + cociente);
        System.out.println("El resto es: " + dividendo);
    }
}
