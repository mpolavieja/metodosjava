package Practicas4;

import java.util.Scanner;

public class lineaCaracteres {
    public static void main(String[] args) {
        String caracter = null;
        int numcaracter;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el caracter: ");
        caracter = teclado.nextLine();
        System.out.println("Introduce el número de caracteres: ");
        numcaracter = teclado.nextInt();

        for (int i = 0; i < numcaracter; i++) {
            System.out.print(caracter);
        }
    }
}
