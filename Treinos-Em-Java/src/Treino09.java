import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.math.BigDecimal;

//      Author: Raul Evangelista

public class Treino09 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Sistema de Compra de Doces com Preços Aleatórios (Entre 2,00 e 8,00, inclusive) |\n");

//      Entrada
        System.out.println("Digite, em reais, o valor disponível para a compra de doces:");
        BigDecimal valorDisponivel = new BigDecimal(leitor.next().replace(',', '.'));

//      Validação
        if (valorDisponivel.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("O valor disponível para a compra de doces não pode ser menor ou igual a zero.\n");
            System.out.println(" | Fim do Programa | ");
            leitor.close();
            return;
        }

//      Pulando uma linha
        System.out.println();

//      Processamento Repeticional e Condicional
        int quantidade = 0;
        BigDecimal valorMinimo = new BigDecimal("2.00");

        while (valorDisponivel.compareTo(valorMinimo) >= 0) {
            BigDecimal valorDoDoce = BigDecimal.valueOf(ThreadLocalRandom.current().nextInt(200, 801), 2);
            if (valorDisponivel.compareTo(valorDoDoce) >= 0) {
                valorDisponivel = valorDisponivel.subtract(valorDoDoce);    
                quantidade++;

            } else {
                break;

            }    
        }

//      Saída
        System.out.println("Quantidade de doces comprados: " + quantidade);
        System.out.printf("O valor disponível restante: R$ %.2f.%n%n", valorDisponivel);
        System.out.println(" | Fim do Programa | ");
        leitor.close();
    }
}
