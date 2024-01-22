// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        // Criação da instância para ler o valor digitado pelo usuário.
        Scanner scan = new Scanner(System.in);

        // Input da String
        System.out.print("Escreva alguma coisa: ");
        String texto = scan.nextLine();
        texto = texto.trim();

        // Variável que conta quantos caracteres tem na String.
        int contagem = texto.replaceAll(" ", "").length();

        // Exibição final
        System.out.println("Seu texto foi: " + texto + "\nO tamanho da String é de: " + contagem + " caracteres!");
    }
}