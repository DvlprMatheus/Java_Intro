// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class exerc05 {
    public static void main(String[] args){

        // Criação do objeto para realização do input e coleta do número.
        Scanner nmrObj = new Scanner(System.in);
        System.out.print("Digite um número: ");

        // Alocação da informação na variável int.
        int nmr = nmrObj.nextInt();

        // Validação se o número é maior que zero, menor que zero ou igual a zero.
        if(nmr > 0){
            System.out.println("O número é positivo!");
        } else if(nmr < 0){
            System.out.println("O número é negativo!");
        } else {
            System.out.println("O número é zero!");
        }
    }
}