import java.util.Scanner;

//      Author: Raul Evangelista

public class Treino10 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


//      Introdução
        System.out.println(" | Sistema de Chamada Telefônica Simples |\n");

//      Entradas
        int numeroDeChamadas = 0;
        char opcao;
        String mensagem;

        do {
            numeroDeChamadas++;

            System.out.println("Telefone tocando...\n");

            System.out.println("Digite A para atender.\n" 
                + "Digite E para encerrar a chamada.\n"
            );
            opcao = leitor.next().toLowerCase().charAt(0);


            if (opcao == 'a') {
                mensagem = "Ligação atendida";

            } else if (opcao == 'e') {
                mensagem = "Ligação encerrada";

            } else {
                mensagem = "Ligação não atendida";
    
            }
            
        } while (opcao != 'a' && opcao != 'e' && numeroDeChamadas < 6);

//      Pulando uma linha
        System.out.println();

//      Saída
        System.out.println(mensagem + ": o telefone tocou "
            + numeroDeChamadas
            + (numeroDeChamadas == 1 ? " vez." : " vezes.")
        );

        leitor.close();
    }
}
