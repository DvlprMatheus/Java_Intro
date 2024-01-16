// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args){
        // Variável que determina quantos anos vale uma CNH.
        int validade_cnh = 10;

        // Criação do objeto para realização do input e coleta da confirmação.
        Scanner ValidacaoObj = new Scanner(System.in);
        System.out.print("Você possui CNH? ");

        // Alocação da informação aplicada na variável String.
        String confirmacao = ValidacaoObj.nextLine();

        // Validação de acordo com a resposta do usuário, aplicando duas possibilidades.
        if(confirmacao.equals("s") || confirmacao.equals("S") || confirmacao.equals("sim") || confirmacao.equals("Sim")){
            // Possibilidade 1

            // Criação do objeto para realização do input e coleta do ano atual.
            Scanner AnoObj = new Scanner(System.in);
            System.out.print("Digite o ano atual: ");

            // Alocação da informação aplicada na variável Int.
            int ano_atual = AnoObj.nextInt();

            // Criação do objeto para realização do input e coleta do ano de expedição da CNH.
            Scanner ExpedicaoObj = new Scanner(System.in);
            System.out.print("Digite o ano de expedição da sua CNH: ");

            // Alocação da informação aplicada na variável Int.
            int ano_expedicao = ExpedicaoObj.nextInt();

            // Subtração para saber a diferença entre os anos.
            int tempo_vida = ano_atual - ano_expedicao;

            // Comparação entre diferença e a validade.
            if(tempo_vida > validade_cnh){
                System.out.println("Sua CNH está vencida, você não pode dirigir!");
            } else {
                System.out.println("Sua CNH está na validade, você pode dirigir!");
            }
        } else {
            // Possibilidade 2

            // Returno final, caso o usuário não possua CNH.
            System.out.println("Se deseja dirigir, procure retirar sua CNH!");
        }
    }
}
