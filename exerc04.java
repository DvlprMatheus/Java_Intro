// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class exerc04 {
    public static void main(String[] args){
        // Criação do objeto e coleta do primeiro número.
        Scanner nmr1_Obj = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");

        // Alocação da informação na variável int.
        int nmr1 = nmr1_Obj.nextInt();

        // Criação do objeto e coleta do segundo número.
        Scanner nmr2_Obj = new Scanner(System.in);
        System.out.print("Digite o segundo número: ");

        // Alocação da informação na variável int.
        int nmr2 = nmr2_Obj.nextInt();

        // Variável criada para fazer a soma dos dois números.
        int soma = nmr1 + nmr2;

        // Exibição do resultado final.
        System.out.println("A soma dos dois números é: " + soma);
    }
}
