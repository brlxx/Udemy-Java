package exercicios_if;
import java.util.Scanner;
//Leia 3 números e imprama-os em ordem crescente.
public class OrdemCrescente {
    
    public static void main(String[] arg){
        



        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 3 números: ");
        int numero1 = scanner.nextInt(); //15
        int numero2 = scanner.nextInt();//14
        int numero3 = scanner.nextInt();//1

        scanner.close();
        
        System.out.println("A ordem crescente é:");


        int inicio,meio,fim;


        //pos 1 primeiro
        if (numero1 <= numero2 && numero1 <= numero3){
            inicio = numero1;

            //2 maior
            if( numero2 <= numero3){

                meio = numero2;
                fim = numero3;
                

            }else{

                meio = numero3;
                fim = numero2;
            }
        

        //pos 1 primeiro
        }else if(numero2 <= numero1 && numero2 <= numero3){
                inicio = numero2;
            //2 maior e 3 maior
            if(numero1 <= numero3){
                meio = numero1;
                fim = numero3;
            }
            else{
                meio = numero3;
                fim = numero1;
            }

        //pos 1 primeiro
        }else if(numero3 <= numero1 && numero3 <= numero2){
            inicio = numero3;

            //2 maior e 3 maior.
            if(numero2 <= numero1){
                meio = numero2;
                fim = numero1;
            }else{
                meio = numero1;
                fim = numero2;
            }

            System.out.printf("%d / %d / %d ",inicio,meio,fim);
        }

        
    }
}
