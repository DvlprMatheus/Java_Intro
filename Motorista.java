// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

public class Motorista {
    public static void main(String[] args){
        // Criação da variável que armazena quantos anos vale uma CNH.
        int validadeCNH = 10;

        // Criação da instância para ler o valor digitado pelo usuário.
        Scanner scan = new Scanner(System.in);

        // Input de confirmação, retirando espaços desnecessários e colocando em lower case.
        System.out.print("Você possui CNH? ");
        String confirmacao = scan.nextLine();
        confirmacao = confirmacao.toLowerCase().trim();

        // Condição que verifica a resposta do usuário.
        if(confirmacao.equals("s") || confirmacao.equals("si") || confirmacao.equals("sim")){

            // Tenta esse bloco de código previnindo erros.
            try{
                // Input do ano atual.
                System.out.print("Digite o ano atual: ");
                int anoAtual = scan.nextInt();

                // Condição que verifica se o ano é válido.
                if(anoAtual < 1950 || anoAtual > 2100){
                    System.out.println("Digite um ano válido.");
                } else {
                    // Input do ano de expedição.
                    System.out.print("Digite o ano de expedição da sua CNH: ");
                    int anoExpedicao = scan.nextInt();

                    // Condição que verifica se o ano de expedição é válido, ou menor que o ano atual.
                    if(anoExpedicao < 1950 || anoExpedicao > 2100 || anoExpedicao > anoAtual){
                        System.out.println("Digite um ano válido.");
                    } else {
                        // Variável que subtrai os valores e obtém a diferença entre os anos.
                        int tempoVida = anoAtual - anoExpedicao;

                        // Condição que verifica se o tempo de vida é maior que a validade.
                        if(tempoVida > validadeCNH){
                            System.out.println("Sua CNH está vencida, você não pode dirigir!");
                        } else {
                            System.out.println("Sua CNH está na validade, você pode dirigir!");
                        }
                    }
                } // Cria uma exceção que trata o erro.
            } catch (Exception e){
                System.out.print("Número inválido!");
            }
        } else {
            System.out.println("Se deseja dirigir, procure retirar sua CNH!");
        }
    }
}