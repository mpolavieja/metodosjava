package Practicas5;

public class Ejercicio10 {
    public static void main(String[] args) {
        int N = 10;
        int v[] = new int[N];
        System.out.println("Del derecho: ");
        for (int i = 0; i < N; i++) {
            v[i] = (int)((Math.random()*10)+1);

            System.out.print(v[i] + " ");
        }
        System.out.println();
        System.out.println("Del revés: ");
        darLaVuelta(v);
    }
    public static void darLaVuelta(int lista[]) {
        int temp[] = new int[lista.length];
        for (int i = 0; i < lista.length; i++) {
            temp[i] = lista[lista.length - 1 - i];
            System.out.print(temp[i] + " ");
        }
    }
}
