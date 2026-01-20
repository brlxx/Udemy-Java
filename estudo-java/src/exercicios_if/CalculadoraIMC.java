package exercicios_if;
import java.util.Scanner;

/*
Calcula o IMC

Menor que 18,5    -> MAGREZA
Entre 18,5 e 24,9 -> NORMAL
Entre 25 e 29,9   -> SOBREPESO
Entre 30 e 39.9   -> OBESIDADE
Maior que 40      -> OBESIDADE GRAVE

IMC = peso / altura * altura

*/
public class CalculadoraIMC {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso e altura: ");
        float peso = scanner.nextFloat();
        float altura = scanner.nextFloat();

        scanner.close();

        float imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.println("MAGREZA");
        }else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("NORMAL");
        }else if (imc >= 25 && imc <= 29.9){
            System.out.println("SOBREPESO");
        }else if (imc >= 30 && imc <= 39.9){
            System.out.println("OBESIDADE");
        }else if (imc >= 40){
            System.out.println("OBESIDADE GRAVE");
        }else{
            System.out.println("Faz o L");
        }
    }
}
