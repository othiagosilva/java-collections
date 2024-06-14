package list.operacoesBasicas;

import java.util.*;

public class CarrinhoCompras {
    public List<Item> itens;

    public CarrinhoCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public void removerItem(String nome) {
        if(!this.itens.isEmpty()) {
            int tamanhoAtual = this.itens.size();
            for(Item item : this.itens) {
                if(item.getNome().equalsIgnoreCase(nome)) {
                    this.itens.remove(item);
                }
            }
            if(this.itens.size() != tamanhoAtual) {
                System.out.println("Item removido com sucesso");
            } else {
                System.out.println("Item não encontrado");
            }
        } else {
            System.out.println("Não há itens para remover");
        }
    }

    public void calcularValorTotal() {
        if(!this.itens.isEmpty()) {
            double total = 0;
            for(Item item : this.itens) {
                total += item.getPreco();
            }
            System.out.println("O valor total é: " + total);
        } else {
            System.out.println("Não há itens para mostrar");
        }
    }

    public void mostrarItens() {
        if(!this.itens.isEmpty()) {
            for(Item item : this.itens) {
                System.out.println(item.getNome());
                System.out.println(item.getPreco());
                System.out.println(item.getQuantidade());
            }
        } else {
            System.out.println("Não há itens para mostrar");
        }
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarItem(new Item("Leite", 5.0, 2));
        carrinho.adicionarItem(new Item("Arroz", 10.0, 1));
        carrinho.adicionarItem(new Item("Feijão", 15.0, 3));

        carrinho.mostrarItens();
        carrinho.calcularValorTotal();

        carrinho.removerItem("Arroz");
        carrinho.mostrarItens();
        carrinho.calcularValorTotal();
    }
    
}
