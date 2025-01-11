package sequencial;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ListaSequencial lista = new ListaSequencial();
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Inserir no início");
            System.out.println("2. Inserir no final");
            System.out.println("3. Inserir em posição específica");
            System.out.println("4. Remover do início");
            System.out.println("5. Remover do final");
            System.out.println("6. Remover de posição específica");
            System.out.println("7. Buscar elemento");
            System.out.println("8. Atualizar elemento");
            System.out.println("9. Exibir lista");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            try {
                switch (opcao) {
                    case 1: {
                        System.out.print("Digite o elemento a ser inserido no início: ");
                        int elemento = scanner.nextInt();
                        lista.inserirNoInicio(elemento);
                        break;
                    }
                    case 2: {
                        System.out.print("Digite o elemento a ser inserido no final: ");
                        int elemento = scanner.nextInt();
                        lista.inserirNoFinal(elemento);
                        break;
                    }
                    case 3: {
                        System.out.print("Digite a posição: ");
                        int posicao = scanner.nextInt();
                        System.out.print("Digite o elemento: ");
                        int elemento = scanner.nextInt();
                        lista.inserirNaPosicao(posicao, elemento);
                        break;
                    }
                    case 4: lista.removerDoInicio(); break;
                    case 5: lista.removerDoFinal(); break;
                    case 6: {
                        System.out.print("Digite a posição a ser removida: ");
                        int posicao = scanner.nextInt();
                        lista.removerNaPosicao(posicao);
                        break;
                    }
                    case 7: {
                        System.out.print("Digite o elemento a ser buscado: ");
                        int elemento = scanner.nextInt();
                        int indice = lista.buscarElemento(elemento);
                        if (indice != -1) {
                            System.out.println("Elemento encontrado na posição: " + indice);
                        } else {
                            System.out.println("Elemento não encontrado.");
                        }
                        break;
                    }
                    case 8: {
                        System.out.print("Digite a posição a ser atualizada: ");
                        int posicao = scanner.nextInt();
                        System.out.print("Digite o novo valor: ");
                        int novoValor = scanner.nextInt();
                        lista.atualizarElemento(posicao, novoValor);
                        break;
                    }
                    case 9: lista.exibirLista(); break;
                    case 0: System.out.println("Encerrando o programa..."); break;
                    default: System.out.println("Opção inválida. Tente novamente."); 
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 0);

        scanner.close();
    }
}
