package exerciciosScanner;

import java.util.Scanner;

//Tabuada de 1 e 2


public class Tabuada {
    public static void main(String[] args) {

        System.out.println("Escreva o número:");
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        scanner.close();

        System.out.println("O número "+valor+" na tabuada de 1 e 2: 1 x "+valor+" = "+(1*valor)+" / 2 x "+valor+" = "+(2*valor)+".");
    }
}
