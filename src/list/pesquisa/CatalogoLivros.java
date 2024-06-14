package list.pesquisa;

import java.util.*;

public class CatalogoLivros {
    public List<Livro> livros;

    public CatalogoLivros(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }

    public void pesquisarPorAutor(String autor) {
        if(!this.livros.isEmpty()){
            for (Livro livro : this.livros) {
                if (livro.getAutor().equals(autor)) {
                    System.out.println(livro.getTitulo());
                    System.out.println(livro.getAutor());
                    System.out.println(livro.getAnoPublicacao());
                }
            }
        } else {
            System.out.println("Não há livros disponíveis no catálogo");
        }
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        if(!this.livros.isEmpty()){
            for (Livro livro : this.livros) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    System.out.println("-------------------------------------------------------------");
                    System.out.println(livro.getTitulo());
                    System.out.println(livro.getAutor());
                    System.out.println(livro.getAnoPublicacao());
                }
            }
        } else {
            System.out.println("Não há livros disponíveis no catálogo");
        }
    }

    public void pesquisarPorTitulo(String titulo) {
        if(!this.livros.isEmpty()){
            for (Livro livro : this.livros) {
                if (livro.getTitulo().equals(titulo)) {
                    System.out.println(livro.getTitulo());
                    System.out.println(livro.getAutor());
                    System.out.println(livro.getAnoPublicacao());
                }
            }
        } else {
            System.out.println("Não há livros disponíveis no catálogo");
        }
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        Livro livro1 = new Livro("Livro 1", "Autor 1", 2000);
        Livro livro2 = new Livro("Livro 2", "Autor 2", 2005);
        Livro livro3 = new Livro("Livro 3", "Autor 3", 2010);

        catalogo.adicionarLivro(livro1);
        catalogo.adicionarLivro(livro2);
        catalogo.adicionarLivro(livro3);

        catalogo.pesquisarPorAutor("Autor 1");
        catalogo.pesquisarPorIntervaloAnos(2000, 2008);
        catalogo.pesquisarPorTitulo("Livro 3");
    }
}
