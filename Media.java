// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        // Criação da instância para ler o valor digitado pelo usuário.
        Scanner scan = new Scanner(System.in);

        // Tenta esse bloco de código previnindo erros.
        try{
            // Input do primeiro número.
            System.out.print("Digite o primeiro número: ");
            float numero1 = scan.nextFloat();

            // Input do segundo número.
            System.out.print("Digite o segundo número: ");
            float numero2 = scan.nextFloat();

            // Input do terceiro número.
            System.out.print("Digite o terceiro número: ");
            float numero3 = scan.nextFloat();

            // Variável que faz a média e armazena o resultado.
            double media = (numero1 + numero2 + numero3)/3;

            // Exibição do resultado.
            System.out.printf("A média final é: %.2f %n", media);

            // Cria uma exceção que trata o erro.
        } catch (Exception e){
            System.out.println("Valor inválido, digite apenas números.");
        }
    }
}