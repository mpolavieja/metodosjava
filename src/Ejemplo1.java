import java.util.Scanner;

public class Ejemplo1 {

    public static int sumar(int a, int b) {
        int res;
        res = a + b;
        return res;
    }

    public static void main(String[] args) {
        int numero1, numero2, res;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce primer número: ");
        numero1 = teclado.nextInt();
        System.out.println("Introduce segundo número: ");
        numero2 = teclado.nextInt();

        res = sumar(numero1, numero2);
        System.out.println("El resultado es: " + res);
    }
}
