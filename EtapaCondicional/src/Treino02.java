import java.util.Scanner;

//      Author: Raul Evangelista

public class Treino02 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println("| Sistema de Situação Acadêmica |\n");

//      Entradas
        System.out.println("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();
    

//      Processamento
        double mediaArit = (nota1 + nota2 + nota3) / 3;

//      Saída Condicional
        if (nota1 > 10 || nota1 < 0 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10)
            System.out.println("As notas não podem estar fora do intervalo de 0 a 10, inclusive.");

        else if (mediaArit >= 7)
            System.out.printf("Aluno(a) aprovado(a) com a seguinte média: %.2f.%n%n",mediaArit);

        else if (mediaArit >= 5)
             System.out.printf("Aluno(a) de recuperação com a seguinte média: %.2f.%n%n",mediaArit);

        else 
             System.out.printf("Aluno(a) reprovado(a) com a seguinte média: %.2f.%n%n",mediaArit);


        leitor.close();

        System.out.println(" | Fim do Programa | ");
        
    }
}
