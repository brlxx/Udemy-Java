package exercicios_if;
import java.util.Scanner;
/*
Dada uma figura geométrica ( Retângulo, triângulo, círculo ), infromar a sua área

r = base x altura
t = ( base * altura) / 2
c = pi x ( raio x raio )

*/

public class AreaFiguraGeometrica {

    public static void main (String [] arg){
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("( Retângulo = r, Triâmgulo = t, Círculo = c ) ");
        String figura = scanner.nextLine();



      
        
        switch (figura.toLowerCase()) {
            case "r" -> {
            System.out.println("Base:");
            int base = scanner.nextInt();
            System.out.println("Altura:");
            int altura = scanner.nextInt();

            int valor = base * altura;

            System.out.println("Área do retângulo = "+valor);
            }
            case "t" -> {
                System.out.println("Base:");
                int base = scanner.nextInt();
                System.out.println("Altura:");
                int altura = scanner.nextInt();

                int valor = (base * altura) / 2;

                System.out.println("Área do triângulo = "+valor);


            }
            case "c" -> {

                System.out.println("Raio:");
                int raio = scanner.nextInt();

                double valor = 3.145 * (raio * raio);

                System.out.printf("Área do círculo = %.2f \n",valor);

            }
               
        
            default -> {
                break;
            }
                
        }

        scanner.close();
    }

    
}
