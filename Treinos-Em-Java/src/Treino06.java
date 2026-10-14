import java.util.Scanner;

//      Author: Raul Evangelista

public class Treino06 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Sistema de Impressão de Carneirinhos com uso do For |\n");

//      Entrada
        System.out.println("Digite a quantidade de carneiros a serem enumerados:");
        int quantidade = leitor.nextInt();

//      Saída Condicional e Repeticional
        if (quantidade <= 0) {
            System.out.println("A quantidade de carneirinhos não pode ser menor ou igual a zero.");

        } else {
            for (int carneirinhos = 1; carneirinhos <= quantidade; carneirinhos++) {
                System.out.println("Carneirinho " + carneirinhos);
            }    
        }    

        System.out.println("\n | Fim do Programa | ");
        leitor.close();

    }
}
