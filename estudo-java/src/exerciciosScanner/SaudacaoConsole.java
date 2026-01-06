package exerciciosScanner;

import java.io.Console;


public class SaudacaoConsole extends Object {
    public static void main(String[] args){

        Console console = System.console();

        System.out.println("Qual o seu nome? :");
        String nome = console.readLine();
        System.out.println("Óla, "+nome);

    }
}
