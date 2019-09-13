package Practicas4;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        String opcion = null;
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2;

        do {
            System.out.println("Sumar (+)");
            System.out.println("Restar (-)");
            System.out.println("Multiplicar (*)");
            System.out.println("Dividir (/)");
            System.out.println("Salir (S/s)");
            opcion = teclado.nextLine();

            switch (opcion) {
                case "+":
                    numero1 = pedirNumero();
            }
        } while (!opcion.equals('s') && !opcion.equals('S'));
    }

    public static int pedirNumero(int a) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce número por favor: ");
        a = teclado.nextInt();
        return a;
    }

    public static int sumar(int a, int b) {
        int res;
        res = a + b;
        return res;
    }

    public static int restar(int a, int b) {
        int res;
        res = a - b;
        return res;
    }

    public static int multiplicar(int a, int b) {
        int res;
        res = a * b;
        return res;
    }

    public static int dividir(int a, int b){
        int res;
        res = a/b;
        return res;
    }
}
