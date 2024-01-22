// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class Altura {
    public static void main(String[] args){
        // Criação da variável que recebe o valor da altura média.
        double mediaAlt = 1.80;

        // Criação da instância para ler o valor digitado pelo usuário.
        Scanner scan = new Scanner(System.in);

        // Tenta esse bloco de código previnindo erros.
        try{
            // Input da altura.
            System.out.print("Digite sua altura: ");
            double altura = scan.nextDouble();

            if(altura > 2.5){
                System.out.println("Você não pode ser tão alto assim!");
            } else {
                // Condição que valida a altura digitada pelo usuário com a altura média.
                if(altura >= mediaAlt){
                    System.out.println("Você é alto(a)!");
                } else {
                    System.out.println("Você não é tão alto(a)");
                }
            } // Cria uma exceção que trata o erro.
        } catch (Exception e){
            System.out.println("Altura Inválida!");
        }
    }
}