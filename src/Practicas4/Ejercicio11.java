package Practicas4;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        num = teclado.nextInt();

        System.out.println("El factorial de " + num + " es " + fact(num));
    }

    public static int fact(int num) {
        int res;
        if (num == 1) {
            return 1;
        } else {
            return num * fact(num - 1);
        }

    }
}
