// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class exerc03 {
    public static void main(String[] args){
        // Criação do objeto para realização do input e coleta do nome.
        Scanner NomeObj = new Scanner(System.in);
        System.out.print("Digite seu nome: ");

        // Alocação da informação aplicada na variável String.
        String nome = NomeObj.nextLine();

        // Armazenamento da primeira letra do nome.
        char prm_letra = nome.charAt(0);

        // Switch utilizado para validação se começa com uma vogal ou consoante.
        switch(prm_letra){
            // Verificando vogais minúsculas
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

            // Verificando vogais maiúsculas
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Seu nome começa com " + prm_letra + ", que é uma vogal!");
                break;
            default:
                System.out.println("Seu nome começa com " + prm_letra + ", que é uma consoante!");
        }
    }
}
