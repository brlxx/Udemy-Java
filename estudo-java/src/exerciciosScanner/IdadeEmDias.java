package exerciciosScanner;

import java.util.Scanner;

//Exercício que fala a idade em dias!

public class IdadeEmDias {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("idade: ");

        int diasCalculo = scanner.nextInt() * 365;

        scanner.close();

        System.out.printf("Idade em dias é: %d",diasCalculo);
    }
}
