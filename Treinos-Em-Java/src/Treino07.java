import java.util.Arrays;
import java.util.Scanner;

//      Author: Raul Evangelista

public class Treino07 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Sistema de Cadastro de Nomes de Discentes com o Uso de Arrays |\n");     
        
//      Entradas
        System.out.println("Informe a quantidade de discentes: ");
        int quantidade = leitor.nextInt();

//      Validação
        if (quantidade <= 0) {
            System.out.println("A quantidade de discentes não pode ser menor ou igual a zero.");
            leitor.close();
            return;
        }

//      Consumindo o Enter Pendente
        leitor.nextLine();

//      Declarando e Definindo o Tamanho do Array 
        String[] nomesDiscentes = new String[quantidade];        
 
        for (int indice01 = 0; indice01 < nomesDiscentes.length; indice01++) {
            System.out.println("Digite os nomes dos discentes: ");
            nomesDiscentes[indice01] = leitor.nextLine();
        }    

//      Saída Repeticional
        Arrays.sort(nomesDiscentes, String.CASE_INSENSITIVE_ORDER);

        System.out.println("\nNomes organizados em ordem alfabética:");

        for (int indice02 = 0; indice02 < nomesDiscentes.length; indice02++) {
            System.out.println((indice02 + 1) + " - " + nomesDiscentes[indice02]);
        }

        System.out.println("\n | Fim do Programa | ");
        leitor.close();
    }
}
