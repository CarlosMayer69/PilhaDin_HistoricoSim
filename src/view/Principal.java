package view;

import java.util.Scanner;
import controller.HistoricoController;
import br.edu.fateczl.pilhastrings.Pilha;

public class Principal {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HistoricoController historicoController = new HistoricoController();
        Pilha historico = new Pilha();

        int opcao;
        String endereco;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir novo endereço");
            System.out.println("2. Remover último endereço");
            System.out.println("3. Consultar último endereço");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o endereço a ser inserido: ");
                        scanner.nextLine(); // Limpar o buffer do teclado
                        endereco = scanner.nextLine();
                        historicoController.inserirEndereco(endereco, historico);
                        System.out.println("Endereço inserido com sucesso!");
                        break;
                    case 2:
                        System.out.println("Último endereço removido: " + historicoController.removerUltimoEndereco(historico));
                        break;
                    case 3:
                        System.out.println("Último endereço consultado: " + historicoController.consultarUltimoEndereco(historico));
                        break;
                    case 4:
                        System.out.println("Encerrando programa...");
                        break;
                    default:
                        System.out.println("Opção inválida! Digite novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 4);

        scanner.close();
    }
}
