package Practicas5;

public class Ejercicio4 {
    public static void main(String[] args) {
        int N = 10, producto = 1;
        int v[] = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = (int) ((Math.random() * 5) + 1);
            System.out.print(v[i]+" ");
            producto = producto * v[i];
        }
        System.out.print(producto);

    }
}
