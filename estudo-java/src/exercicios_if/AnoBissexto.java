package exercicios_if;
import java.util.Scanner;


public class AnoBissexto {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();

        scanner.close();
       
        

        if (ano % 4  != 0 || ano % 100 == 0 && ano % 400 != 0){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }
}
