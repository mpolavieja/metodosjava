package Practicas5;

public class Ejercicio5 {
    public static void main(String[] args) {
        int N = 10, producto = 1;
        int v[] = new int[N];
        int u[] = new int[N];
        int w[] = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = (int) ((Math.random() * 5) + 1);
            System.out.print(v[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            u[i] = (int) ((Math.random() * 5) + 1);
            System.out.print(u[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            w[i] = v[i] + u[i];
            System.out.print(w[i]+" ");
        }
        }
    }
