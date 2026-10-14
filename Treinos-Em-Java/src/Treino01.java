import java.util.Scanner;

//      Author: Raul Evangelista

public class Treino01 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double saldo = 25.00;

//      Introdução 
        System.out.println("| Sistema Eletrônico Simples de Saque | \n");

//      Entrada
        System.out.println("Digite, em reais, o valor do saque: ");
        double valorSolicitado = leitor.nextDouble();

//      Saída Condicional
        if (valorSolicitado <= 0) {
            System.out.println("O valor solicitado para o saque não pode ser menor ou igual a zero. \n");

        } else if (valorSolicitado > saldo) {
            System.out.printf("Saldo de R$ %.2f insuficiente para o saque solicitado.%n%n", saldo);

        } else {
            System.out.printf("Saldo restante: R$ %.2f.%n%n", saldo - valorSolicitado);
        }

        System.out.println(" | Fim do Programa | ");
        leitor.close();

    } 
}
