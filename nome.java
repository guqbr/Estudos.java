import java.util.Scanner;

public class nome{
   public static void main(String[] args){

    // Criar um objeto Scanner para ler entradas do teclado.
    Scanner ler = new Scanner(System.in);

    // Exibir uma pergunta ao usuario
    System.out.println("Qual o seu nome?");
    // Ler o que o usuario escreveu
    String nome = ler.nextLine();

    // Exibir o que o usuario digitou
    System.out.println("Olá, " + nome + "!");

    // Fechar o scanner para liberar recursos
    ler.close();
   }
}
