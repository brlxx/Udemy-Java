package exerciciosScanner;

import java.util.Scanner;

public class PrecoComDesconto {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o valor em R$:");
        double reais = scanner.nextDouble();

        System.out.println("");

        System.out.print("Digite o desconto em %:");
        int desconto = scanner.nextInt();
          System.out.println("");

        double descontoEmReais = (desconto / 100.0) * reais;
        
        double precoComDesconto = reais - descontoEmReais;

        scanner.close();

        

        System.out.printf("R$: %.2f com o desconto de: %d = R$: %.2f e o desconto ficou:  %.2f",reais , desconto,precoComDesconto,descontoEmReais);
        
    }
}
