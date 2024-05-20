import java.util.Scanner;

public class operacao {
    public static void main(String[] args){
        
        // Ler os numeros digitados pelo usuario.
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = ler.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = ler.nextInt();

        ler.close();

        // Calcular os resultados.
        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        double divisao = (double) n1 / n2;

        // Ler os resultados.
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
