// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class exerc07 {
    public static void main(String[] args){

        // Criação do objeto para realização do input e coleta do texto.
        Scanner strObj = new Scanner(System.in);
        System.out.print("Escreva uma ou várias palavras: ");

        // Alocação da informação na variável String.
        String texto = strObj.nextLine();

        // Variável que guarda quantos caracteres tem na String texto.
        int contagem = texto.length();

        // Execução final com a utilização das duas variáveis.
        System.out.println("Seu texto foi: " + texto + "\nO tamanho da String é de: " + contagem + " caracteres!");
    }
}