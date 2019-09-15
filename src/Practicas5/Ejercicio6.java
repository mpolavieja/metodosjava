package Practicas5;

public class Ejercicio6 {
    public static void main(String[] args) {
        int N = 5, suma = 0;
        int v[] = new int[N];
        int u[] = new int[N];

        for (int i = 0; i < N; i++) {
            v[i] = (int)((Math.random())*5+1);
            u[i] = (int)((Math.random())*5+1);
            suma = suma + v[i]*u[i];
            System.out.print(v[i]+ " ");
            System.out.println(u[i]);
        }
        System.out.println("El producto escalar es: " + suma);
    }



}
