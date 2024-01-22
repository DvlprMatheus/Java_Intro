// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        // Criação da instância para ler o valor digitado pelo usuário.
        Scanner scan = new Scanner(System.in);

        // Input da String
        System.out.print("Escreva alguma coisa: ");
        String texto = scan.nextLine();
        texto = texto.trim();

        // String que recebe a palavra e inverte.
        String invertida = new StringBuilder(texto).reverse().toString();

        // Exebição final
        System.out.println("Seu texto invertido é: " + invertida);
    }
}