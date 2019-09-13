package Practicas5;

public class Ejercicio3 {
    public static void main(String[] args) {
        int N = 10, suma = 0;
        int v[] = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = (int) ((Math.random() * 20) + 1);
            System.out.print(v[i]+" ");
            suma = suma + v[i];
        }
        System.out.print(suma);

    }
}
