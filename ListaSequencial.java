package sequencial;

import java.util.ArrayList;

public class ListaSequencial {
	ArrayList<Integer> lista = new ArrayList<Integer>();

	// Inserção no início
	public void inserirNoInicio(int elemento) {
		lista.add(0, elemento);
	}

	// Inserção no final
	public void inserirNoFinal(int elemento) {
		lista.add(elemento);
	}

	// Inserção em posição específica
	public void inserirNaPosicao(int posicao, int elemento) {
		if (posicao < 0 || posicao > lista.size()) {
			throw new IndexOutOfBoundsException("Posição inválida");
		}
		lista.add(posicao, elemento);
	}

	// Remoção do início
	public void removerDoInicio() {
		if (lista.isEmpty()) {
			throw new IllegalStateException("A lista está vazia");
		}
		lista.remove(0);
	}

	// Remoção do final
	public void removerDoFinal() {
		if (lista.isEmpty()) {
			throw new IllegalStateException("A lista está vazia");
		}
		lista.remove(lista.size() - 1);
	}

	// Remoção de posição específica
	public void removerNaPosicao(int posicao) {
		if (posicao < 0 || posicao >= lista.size()) {
			throw new IndexOutOfBoundsException("Posição inválida");
		}
		lista.remove(posicao);
	}

	// Pesquisa por elemento (busca sequencial)
	public int buscarElemento(int elemento) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) == elemento) {
				return i; // Retorna o índice do elemento
			}
		}
		return -1; // Retorna -1 se o elemento não for encontrado
	}

	// Atualização de elemento em posição específica
	public void atualizarElemento(int posicao, int novoValor) {
		if (posicao < 0 || posicao >= lista.size()) {
			throw new IndexOutOfBoundsException("Posição inválida");
		}
		lista.set(posicao, novoValor);
	}

	// Exibição da lista
	public void exibirLista() {
		System.out.println(lista);
	}
}
