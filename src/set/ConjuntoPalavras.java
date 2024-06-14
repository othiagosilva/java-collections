package set;

import java.util.*;

public class ConjuntoPalavras {
    public Set<String> palavras;

    public ConjuntoPalavras() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(!this.palavras.isEmpty()){
            if(this.palavras.contains(palavra)){
                this.palavras.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada");
            }
        } else {
            System.out.println("Não há palavras para remover");
        }
    }

    public void verificarPalavra(String palavra) {
        if(!this.palavras.isEmpty()){
            if(this.palavras.contains(palavra)){
                System.out.println("A palavra está no conjunto");
            } else {
                System.out.println("A palavra não está no conjunto");
            }
        } else {
            System.out.println("Não há palavras para verificar");
        }
    }

    public void exibirPalavras() {
        if (!this.palavras.isEmpty()) {
            for (String palavra: this.palavras) {
                System.out.println(palavra);
            }
        } else {
            System.out.println("Não há palavras para mostrar");
        }
    }

    public static void main (String[] args) {
        ConjuntoPalavras conjunto = new ConjuntoPalavras();
        conjunto.adicionarPalavra("Java");
        conjunto.adicionarPalavra("Python");
        conjunto.adicionarPalavra("JavaScript");
        conjunto.adicionarPalavra("C++");

        conjunto.exibirPalavras();

        conjunto.verificarPalavra("Java");

        conjunto.removerPalavra("Java");
        conjunto.exibirPalavras();
    }
    
}
