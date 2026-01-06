package exerciciosScanner;

import java.util.Scanner;

// Média Aritmética de 3 alunos = (n1 + n2 + n3) / 3

public class MediaAritmetica {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("escreve as notas");
        double n1 = scanner.nextDouble();

        System.out.println("escreve as notas:");
        double n2 = scanner.nextDouble();

        System.out.println("escreve as notas:");
        double n3 = scanner.nextDouble();

        double calculo = (n1 + n2 + n3) / 3;
        scanner.close();

        System.out.printf("Esse é o valor: %.2f", calculo);

    }
}
