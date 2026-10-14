import java.util.Scanner;
import java.util.Arrays;

//      Author: Raul Evangelista

public class Treino08 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Sistema de Cadastro de Nomes de Discentes com o Uso de Arrays Otimizado (For - Each) |\n");

//      Entradas
        System.out.println("Digite a quantidade de discentes a serem cadastrados: ");
        int quantidade = leitor.nextInt();

//      Validação
        if (quantidade <= 0) {
            System.out.println("A quantidade de discentes não pode ser menor ou igual a zero.\n");
            System.out.println(" | Fim do Programa | ");
            leitor.close();
            return;
        }

//      Consumindo o Enter Pendente
        leitor.nextLine();

//      Declarando e Definindo o Tamanho do Array
        String[] nomesDiscentes = new String[quantidade];

//      Entradas Repeticionais
        for (int indice01 = 0; indice01 < nomesDiscentes.length; indice01++) {
            System.out.printf("Digite o nome do discente %02d: ", indice01 + 1);
            nomesDiscentes[indice01] = leitor.nextLine();
        }

//      Pulando uma linha
        System.out.println();

//      Saída Repeticional
        Arrays.sort(nomesDiscentes, String.CASE_INSENSITIVE_ORDER);
        int contador = 0;

        System.out.println("Os nomes dos(as) discentes organizados em ordem alfabética:\n");

        for (String nomeDiscente : nomesDiscentes) {
            contador++;
            System.out.printf("%02d - %s%n", contador, nomeDiscente);
        }    

//      Saída
        System.out.println("\n | Fim do Programa | ");
        leitor.close();

    }
}
