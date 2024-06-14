package list.ordenacao;

import java.util.*;

public class OrdenacaoPessoa{
    public List<Pessoa> pessoas;

    public OrdenacaoPessoa(){
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa){
        this.pessoas.add(pessoa);
    }

    public void ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
        if(!pessoas.isEmpty()) {
            Collections.sort(pessoasPorIdade);
            for (Pessoa pessoa : pessoasPorIdade) {
                System.out.println(pessoa.getNome());
                System.out.println(pessoa.getIdade());
                System.out.println("------------------------------------");
            }
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        if(!pessoas.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main (String[] args){
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa(new Pessoa("João", 20, 1.75));
        ordenacaoPessoa.adicionarPessoa(new Pessoa("Maria", 30, 1.65));

        ordenacaoPessoa.ordenarPorIdade();
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
