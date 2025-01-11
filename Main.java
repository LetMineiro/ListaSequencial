package sequencial;

public class Main {
    public static void main(String[] args) {
        ListaSequencial lista = new ListaSequencial();

        // Inserindo elementos
        lista.inserirNoInicio(10);
        lista.inserirNoFinal(20);
        lista.inserirNaPosicao(1, 15);

        // Exibindo a lista
        lista.exibirLista();

        // Removendo elementos
        lista.removerDoInicio();
        lista.exibirLista();

        // Atualizando elemento
        lista.atualizarElemento(0, 30);
        lista.exibirLista();

        // Buscando elemento
        int indice = lista.buscarElemento(30);
        System.out.println("Elemento 30 encontrado no índice: " + indice);
    }
}
