import java.util.Scanner;

//      Author: Raul Evangelista

public class Treino03 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Sistema de Situação Acadêmica com Uso do Operador Ternário |\n");

//      Entradas
        System.out.println("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();

//      Processamento
        double mediaArit = (nota1 + nota2 + nota3) / 3;

//      Etapa de Processamento Condicional de Situação Acadêmica
        String situacao = nota1 > 10 || nota1 < 0 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10
            ? "As notas informadas não podem estar fora do intervalo de 0 a 10, inclusive."
            : mediaArit >= 7
                ? "Aluno(a) aprovado(a)."
                : mediaArit >= 5
                    ? "Aluno(a) em recuperação." 
                    : "Aluno(a) reprovado(a).";


//      Saída   
        System.out.println(situacao);
        System.out.println("\n | Fim do Programa | ");

        leitor.close();

    }
}
