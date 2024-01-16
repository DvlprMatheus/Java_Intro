// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class exerc01 {
    public static void main(String[] args){
        // Variável da altura média para comparação.
        double media_alt = 1.80;

        // Criação do objeto para realização do input e coleta da altura.
        Scanner AlturaObj = new Scanner(System.in);
        System.out.print("Digite sua altura: ");

        // Alocação da informação aplicada na variável double.
        double altura = AlturaObj.nextDouble();

        // Comparação entre a altura média e a altura fornecida pelo usuário.
        if(altura >= media_alt){
            System.out.println("Você é alto(a)!");
        } else {
            System.out.println("Você não é tão alto(a)");
        }
    }
}