package exerciciosScanner;
import java.util.Scanner;
public class RelacionamentoDeOrdem {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor 1 :");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o valor 2 :");
        int valor2 = scanner.nextInt();

        scanner.close();

        
       

        System.out.println(valor1+" == "+valor2+" ? "+(valor1 == valor2));
        System.out.println(valor1+" != "+valor2+" ? "+(valor1 != valor2));
        System.out.println(valor1+" > "+valor2+" ? "+(valor1 > valor2));
        System.out.println(valor1+" < "+valor2+" ? "+(valor1 < valor2));
        System.out.println(valor1+" >= "+valor2+" ? "+(valor1 >= valor2));
        System.out.println(valor1+" <= "+valor2+" ? "+(valor1 <= valor2));


    }    
}
