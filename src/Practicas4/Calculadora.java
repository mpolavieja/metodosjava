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
            System.out.println("Introduce una opción: ");
            opcion = teclado.nextLine();

            switch (opcion) {
                case "+":
                    int res;
                    numero1 = pedirNumero();
                    numero2 = pedirNumero();
                    res = sumar(numero1, numero2);
                    System.out.println("La suma es: " + res);
                    break;
                case "-":
                    numero1 = pedirNumero();
                    numero2 = pedirNumero();
                    System.out.println("La resta es: " + restar(numero1, numero2));
                    break;
                case "*":
                    numero1 = pedirNumero();
                    numero2 = pedirNumero();
                    System.out.println("La multiplicación es: " + multiplicar(numero1, numero2));
                    break;
                case "/":
                    numero1 = pedirNumero();
                    numero2 = pedirNumero();
                    System.out.println("La división es: " + dividir(numero1, numero2));
                    break;
                case "s": case "S":
                    System.out.println("Gracias por usar la calculadora");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (!opcion.equals("s") || !opcion.equals("S"));
    }

    public static int pedirNumero() {
        int a;
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
