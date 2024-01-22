// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class Numero {
    public static void main(String[] args){
        // Criação da instância para ler o valor digitado pelo usuário.
        Scanner scan = new Scanner(System.in);

        // Tenta esse bloco de código previnindo erros.
        try{
            // Input do número.
            System.out.print("Digite um número: ");
            int numero = scan.nextInt();

            // Condição que verifica qual é a classificão do número.
            if(numero > 0){
                System.out.println("O número é positivo!");
            } else if(numero < 0){
                System.out.println("O número é negativo!");
            } else {
                System.out.println("O número é zero!");
            } // Cria uma exceção que trata o erro.
        } catch (Exception e){
            System.out.println("Valor inválido, digite apenas números.");
        }
    }
}