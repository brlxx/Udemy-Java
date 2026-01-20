package exercicios_if;

import java.util.Scanner;
/*
    Ler 3 notas de um aluno e imprimir se ele foi aprovado ou não.
    Obs: O aluno deve possuir média 7.0 ou maior para ser aprovado

*/
public class AprovadoReprovado {
    boolean dnv;
    public static void main(String[] args){

        AprovadoReprovado teste = new AprovadoReprovado();
        Scanner scanner = new Scanner(System.in);

        do { 

            System.out.println("Digite as 3 notas do aluno:");
            float nota1 = scanner.nextFloat();
            float nota2 = scanner.nextFloat();
            float nota3 = scanner.nextFloat();
            


            System.out.println("Resultado:");
            float resultado = (nota1 + nota2 + nota3) / 3;
            if (resultado >= 7.0){
                System.out.printf("Aprovado com: %.2f",resultado);    
            }else{
                System.out.printf("Reprovado com: %.2f",resultado);
            }


            System.out.println("");

            System.out.println("Deseja continuar?: ");

            String resposta = scanner.next().toLowerCase();
            
            switch (resposta) {
                case "sim":
                    System.out.println("Blz :)");
                    teste.setDnv(true);
                    break;
                case "nao":
                    System.out.println("Blz :)");
                    teste.setDnv(false);
                    break;
                    
            }
            

        } while (teste.getDev());
        scanner.close();
        
    }

    public void setDnv(boolean materiaPrima){
        this.dnv = materiaPrima;
    }

    public boolean getDev(){
        return this.dnv;
    }
    
}