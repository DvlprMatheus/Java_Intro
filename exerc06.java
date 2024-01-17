// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class exerc06 {
    public static void main(String[] args){

        // Criação do objeto para realização do input e coleta do primeiro número.
        Scanner nmr1Obj = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");

        // Alocação da informação na variável float.
        float nmr1 = nmr1Obj.nextFloat();

        // Criação do objeto para realização do input e coleta do segundo número.
        Scanner nmr2Obj = new Scanner(System.in);
        System.out.print("Digite o segundo número: ");

        // Alocação da informação na variável float.
        float nmr2 = nmr2Obj.nextFloat();

        // Criação do objeto para realização do input e coleta do terceiro número.
        Scanner nmr3Obj = new Scanner(System.in);
        System.out.print("Digite o terceiro número: ");

        // Alocação da informação na variável float.
        float nmr3 = nmr3Obj.nextFloat();

        // Variável criada para realizar a média dos dados obtidos através da resposta do usuário.
        double media = (nmr1 + nmr2 + nmr3)/3;

        // Exebição final do resultado
        System.out.printf("A média final é: %.2f %n", media);
    }
}
