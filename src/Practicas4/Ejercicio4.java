package Practicas4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero entero >= 0: ");
            numero = sc.nextInt();
        } while (numero < 0);
        System.out.println("Binario: " + aBinario(numero));
    }

    public static int aBinario(int num) {
        int exp, digito;
        int binario;
        exp = 0;
        binario = 0;
        while (num != 0) {
            digito = num % 2;
            binario = binario + digito * (int) Math.pow(10, exp);
            exp++;
            num = num / 2;
            System.out.println("digito " + digito + " binario " + binario + " exp " + exp + " num " + num);
        }
        return binario;
    }
}
