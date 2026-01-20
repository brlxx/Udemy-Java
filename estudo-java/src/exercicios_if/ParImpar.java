package exercicios_if;

import java.util.Scanner;
//Leia um número e imprima se ele é par ou ímpar.
public class ParImpar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();

        scanner.close();

        if(numero % 2 == 0){
            System.out.println("par");
        }else if(numero % 2 == 1){
            System.out.println("Ímpar");
        }
    }
}
