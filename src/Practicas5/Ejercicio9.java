package Practicas5;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int N = 5;
        int v[] = new int[N];

        Scanner teclado = new Scanner(System.in);
        for( int i = 0 ; i<N ; i++ ) {
            System.out.println("Introduce dato");
            v[i] = teclado.nextInt();
            System.out.print(v[i] + " ");
        }
        if (estaOrdenado(v) == true) {
            System.out.println("El vector está ordenado");
        } else {
            System.out.println(("El vector NO está ordenado"));
        }
            }

    public static boolean estaOrdenado(int vector[]) {
        boolean ordenado = false;
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] >= vector[i-1]) {
                ordenado = true;
            } else {
                ordenado = false;
                break;
            }
        }
        return ordenado;

    }
}
