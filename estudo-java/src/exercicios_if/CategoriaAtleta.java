package exercicios_if;

import java.util.Scanner;

/* Idade do atleta.

    Mirim: 10 a 12.
    Infantil: 13 a 15.
    Juvenil: 16 a 18.

*/ 
public class CategoriaAtleta {
    public static void main(String[] arg ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Idade do atleta: ");

        int idade = scanner.nextInt();

        scanner.close();

        if(idade >= 10 && idade <= 12){
            System.out.println("Mirim");
        }else if(idade >= 13 && idade <= 15){
            System.out.println("Infantil");
        }else if (idade >= 16 && idade <= 18) {
            System.out.println("Juvenil");
        }else{
            System.out.println("Esse Atleta ai não tem idade pae!!");
        }
    }
}
