import java.util.Scanner;

//      Author: Raul Evangelista

public class Treino05 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Sistema de Seleção de Planos de Operadora com Switch Case |\n");
        
//      Entrada
        System.out.println("Digite a opção correspondente a um dos planos disponíveis:\n" 
            + "A - 100 minutos de ligações.\n"
            + "B - 100 minutos de ligações com WhatsApp e Instagram grátis.\n"
            + "C - 100 minutos de ligações com WhatsApp e Instagram grátis mais 5 GB de YouTube."
        );
        String opcao = leitor.next().toLowerCase();

//      Saída Condicional
        switch (opcao) {
            case "a":
                System.out.println("Seu plano (A) com 100 minutos de ligações foi adquirido com sucesso.\n");        
                break;

            case "b":
                System.out.println("Seu plano (B) com 100 minutos de ligações e WhatsApp "
                + "mais Instagram grátis foi adquirido com sucesso.\n"
                );        
                break;

            case "c":
                System.out.println("Seu plano (C) com 100 minutos de ligações "
                + "mais WhatsApp e Instagram grátis e 5 GB de YouTube " 
                + "foi adquirido com sucesso.\n"
                );        
                break;
          
            default:
                System.out.println("Opção de plano escolhida inválida.\n");
                break;
        }        

        System.out.println(" | Fim do Programa | ");
        leitor.close();

    }
}
