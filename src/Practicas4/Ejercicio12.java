package Practicas4;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int limite = pedirDato();
        for (int i = 0; i <= limite; i++) {
            System.out.print(nuevoElemento(i) + " ");
        }
    }
    public static int nuevoElemento(int suma) {
        if (suma == 0) {
            return 0;
        } else if (suma == 1) {
            return 1;
        } else {
            return nuevoElemento(suma-1) + nuevoElemento(suma-2);
        }
    }
    public static int pedirDato() {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de elementos que quieras de la serie");
        num = teclado.nextInt();
        return num;
    }
}
