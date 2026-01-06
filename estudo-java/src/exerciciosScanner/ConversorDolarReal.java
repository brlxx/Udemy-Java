package exerciciosScanner;

import java.util.Scanner;

public class ConversorDolarReal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dólares $:");
        double dolar =  scanner.nextDouble();

        System.out.println("");

        double valorEmReal = dolar * 5.41 ;

        scanner.close();

        System.out.printf("$%.2f em reais é: R$%.2f", dolar, valorEmReal);

    }
}