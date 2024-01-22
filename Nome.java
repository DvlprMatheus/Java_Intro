// Importação do Normalizer e Regex para remover acentos da String.
import java.text.Normalizer;
import java.util.regex.Pattern;

// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class Nome {
    public static void main(String[] args){
        // Criação da instância para ler o valor digitado pelo usuário.
        Scanner scan = new Scanner(System.in);

        // Input do nome, com tratamento de dados.
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        nome = removerAcento(nome.toLowerCase().trim());

        // Variável responsável por armazenar a primeira letra da String.
        char prm_letra = nome.charAt(0);

        // Switch que valida se é uma vogal, consoante ou número.
        switch(prm_letra){
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Seu nome começa com " + prm_letra + ", que é uma vogal!");
                break;
            case '1', '2', '3', '4', '5', '6', '7', '8', '9', '0':
                System.out.println("Nome inválido!");
                break;
            default:
                System.out.println("Seu nome começa com " + prm_letra + ", que é uma consoante!");
        }
    }

    // Função responsável por normalizar a String, retirando os acentos, caso tenha na primeira letra.
    public static String removerAcento(String str) {
        String NormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(NormalizedString).replaceAll("");
    }
}