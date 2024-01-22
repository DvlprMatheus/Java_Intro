// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class Soma {
    public static void main(String[] args){
        // Criação da instância para ler o valor digitado pelo usuário.
        Scanner scan = new Scanner(System.in);

        // Tenta esse bloco de código previnindo erros.
        try{
            // Input do primeiro número.
            System.out.print("Digite o primeiro número: ");
            int nmr1 = scan.nextInt();

            // Input do segundo número.
            System.out.print("Digite o segundo número: ");
            int nmr2 = scan.nextInt();

            // Variável que soma os dois números e armazena o resultado.
            int soma = nmr1 + nmr2;

            // Exibição do resultado.
            System.out.println("A soma dos dois números é: " + soma);

            // Cria uma exceção que trata o erro.
        } catch (Exception e){
            System.out.println("Valor inválido, digite apenas números.");
        }
    }
}