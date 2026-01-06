package exerciciosScanner;
import java.util.Scanner;

/*EstoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2

EX: quantidadeMinima = 3, quantidadeMaxima = 7: O estoque médio é de 5 unidades.
*/
public class EstoqueMedio {

   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Média do estoque:");
    System.out.print("quantidadeMinima: ");
    int quantidadeMinima = scanner.nextInt();
    
    System.out.println("");

    System.out.print("quantidadeMaxima: ");
    int quantidadeMaxima = scanner.nextInt();

    System.out.println("");
    scanner.close();

    double mediaTotal = (quantidadeMinima + quantidadeMaxima) / 2;

    System.out.printf("QuantidadeMaxima: %d, QuantidadeMinima: %d :A média é: %.1f", quantidadeMaxima, quantidadeMinima, mediaTotal);
    
   }
    
}
