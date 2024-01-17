// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class exerc08 {
    public static void main(String[] args){

        // Criação do objeto para realização do input e coleta do texto.
        Scanner strObj = new Scanner(System.in);
        System.out.print("Escreva uma palavra: ");

        // Alocação da informação na variável String.
        String texto = strObj.nextLine();

        // Classe que manipula a String e inverte seu texto.
        String invertida = new StringBuilder(texto).reverse().toString();

        // Exebição final
        System.out.println("Seu texto invertido: " + invertida);
    }
}
