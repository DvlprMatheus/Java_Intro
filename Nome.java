// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class Nome {
    public static void main(String[] args){
        // Criação da instância para ler o valor digitado pelo usuário.
        Scanner scan = new Scanner(System.in);

        // Input do nome.
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        nome = nome.toLowerCase().trim();

        // Variável que extraí a primeira letra do nome.
        char prm_letra = nome.charAt(0);

        // Switch que valida se a primeira letra é uma vogal ou uma consoante.
        switch(prm_letra){
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Seu nome começa com " + prm_letra + ", que é uma vogal!");
                break;
            default:
                System.out.println("Seu nome começa com " + prm_letra + ", que é uma consoante!");
        }
    }
}