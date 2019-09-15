package Practicas5;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int N = 10, dato;
        int v[] = new int[N];
        boolean respuesta;
        for (int i = 0; i < N; i++) {
            v[i] = (int)((Math.random()*5)+1);
            System.out.print(v[i] + " ");
        }
        dato = pedirDato();
        respuesta = estaEnVector(dato, v);
        if (respuesta == true) {
            System.out.println("El dato está en el vector");
        } else {
            System.out.println("El dato NO está en el vector");
        }
    }
    public static int pedirDato() {
        int dato;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el dato: ");
        dato = teclado.nextInt();
        return dato;

    }
    public static boolean estaEnVector(int dato, int vector[]){
        int N = vector.length;
        boolean res = false;
        for (int i = 0; i < N; i++) {
            if (vector[i] == dato) {
                res = true;
            }


        }
        return res;
    }
}
