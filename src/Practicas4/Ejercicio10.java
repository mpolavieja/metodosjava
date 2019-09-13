package Practicas4;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("1. Dibujar cuadrado");
            System.out.println("2. Dibujar rectángulo");
            System.out.println("3. Dibujar triángulo");
            System.out.println("0. Salir");
            System.out.println("Introduce la opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    dibujarCuadrado();
                    break;
                case 2:
                    dibujarRectangulo();
                    break;
                case 3:
                    dibujarTriangulo();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar nuestro dibujante");
                    break;
                default:
                    System.out.println("Te has equivocado");
                    break;
            }
        } while (opcion != 0);
    }

    public static int pedirDato() {
        int dato;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el dato: ");
        dato = teclado.nextInt();
        return dato;
    }

    public static void dibujarCuadrado() {
        int base;
        base = pedirDato();
        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < base-2; i++) {
            System.out.println("* " + "                   ".substring(0, base + 1) + "* ");
        }
        // System.out.println();
        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void dibujarRectangulo() {
        int base = pedirDato();
        int altura = pedirDato();

        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < altura-2; i++) {
            System.out.println("* " + "                   ".substring(0, base) + "* ");
        }
        // System.out.println();
        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
        System.out.println();

    }

    public static void dibujarTriangulo() {
        int altura = pedirDato();

        System.out.println("*");
        for (int i = 0; i < altura - 2; i++) {
            System.out.println("* " + "                   ".substring(0, i+1) + "* ");
        }
        // System.out.println();
        for (int i = 0; i < altura; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
