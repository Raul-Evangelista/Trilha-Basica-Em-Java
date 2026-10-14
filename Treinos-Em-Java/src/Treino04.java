import java.util.Scanner;

//      Author: Raul Evangelista

public class Treino04 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Sistema de Medida com Uso do Switch Case |\n");

//      Entrada
        System.out.println("Digite a sigla de uma das opções listadas:\n"
            + "P - Pequeno. \n"
            + "M - Médio. \n"
            + "G - Grande."
        );
        String opcao = leitor.next().toLowerCase();

//      Saída Condicional
        switch (opcao) {
            case "p":
                System.out.println("Opção escolhida: pequeno.");
                break;
        
            case "m":
                System.out.println("Opção escolhida: médio.");
                break;

            case "g":
                System.out.println("Opção escolhida: grande.");
                break;

            default:
                System.out.println("Opção escolhida inválida.");
                break;
        }

        System.out.println(" | Fim do Programa | ");
        leitor.close();

    }
}
