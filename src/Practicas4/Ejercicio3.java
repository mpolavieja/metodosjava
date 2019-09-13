package Practicas4;

import java.util.Scanner;

public class Ejercicio3 {
    public static int mcm(int a, int b){
        int i;
        if (a > b) {
            i = a;
        }
        else {
            i = b;
        }
        while (i % a != 0 || i % b != 0) {
            System.out.println(i + "," + a + "," + (i % a) + "||||" + b +"," + (i % b));
            i++;

        }
        System.out.println("lo que para el bucle y ya no se ejecuta es: " + i + "," + a +"," + (i % a));
        return i;
    }

    public static void main(String[] args) {
        int a, b, res;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce número 1: ");
        a = teclado.nextInt();
        System.out.println("Introduce número 2: ");
        b = teclado.nextInt();

        res = mcm(a, b);

        System.out.println("El mcm es " + res);

    }
}
