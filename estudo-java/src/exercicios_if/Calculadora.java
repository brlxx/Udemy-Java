package exercicios_if;

import java.util.Scanner;
/*Calculadora de dois números

onde vc escolhe a operação!
*/
public class Calculadora {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha entre as operações ( + - x / ):");
        String operacao = scanner.nextLine();
        System.out.println("Escolha os 2 números: ");
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        scanner.close();

        int resultado;

        switch (operacao.toLowerCase()) {

            case "+":
                resultado = valor1 + valor2;
                System.out.printf("Resultado: %d ",resultado);
                break;
            case "-":
                resultado = valor1 - valor2;
                System.out.printf("Resultado: %d ",resultado);
                break;
            case "x":
                resultado = valor1 * valor2;
                System.out.printf("Resultado: %d ",resultado);
                break;
             case "/":
                resultado = valor1 / valor2;
                System.out.printf("Resultado: %.2f ",resultado);
                break;

            default:
                System.out.println("Não existe a operação: "+operacao.toLowerCase());
                break;
            
        }

        
    }
    
}
