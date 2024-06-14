package set;

import java.util.*;

public class ConjuntoConvidados {
    public Set<Convidado> convidado;

    public ConjuntoConvidados(Set<Convidado> convidado) {
        this.convidado = new HashSet<>();
    }

    public void adicionarConvidado(Convidado convidado) {
        this.convidado.add(convidado);
    }

    public void removerConvidado(int codigoConvite) {
        if(!this.convidado.isEmpty()){
            this.convidado.removeIf(c -> c.getCodigoConvite() == codigoConvite);
        } else {
            System.out.println("Não há convidados para remover");
        }
    }

    public void contarConvidados() {
        System.out.println(this.convidado.size());
    }

    public void exibirConvidados() {
        if (!this.convidado.isEmpty()) {
            for (Convidado c: this.convidado) {
                System.out.println(c.getNome());
            }
        } else {
            System.out.println("Não há convidados para mostrar");
        }
    }

    public void pesquisarConvidado(int codigoConvite) {
        if(!this.convidado.isEmpty()){
            if(this.convidado.iterator().next().getCodigoConvite() == codigoConvite){
                System.out.println(this.convidado.iterator().next().getNome());
            } else {
                System.out.println("Convidado não encontrado");
            }
        } else {
            System.out.println("Não há convidados para pesquisar");
        }
    }

    public Set<Convidado> exibirConvidadosPorCodigoConvite() {
        Set<Convidado> convidados = new TreeSet<>(new ComparatorCodigoConvite());
        if (!this.convidado.isEmpty()) {
            convidados.addAll(convidado);
            return convidados;
        } else {
            throw new RuntimeException("Não há convidados para mostrar");
        }
    }

    public static void main(String[] args){
        ConjuntoConvidados convidados = new ConjuntoConvidados(new HashSet<>());

        Convidado convidado1 = new Convidado("Joaquina", 1);
        Convidado convidado2 = new Convidado("João", 2);
        Convidado convidado3 = new Convidado("Joaquim", 3);
        
        convidados.adicionarConvidado(convidado1);
        convidados.adicionarConvidado(convidado2);
        convidados.adicionarConvidado(convidado3);
        
        convidados.exibirConvidados();
        convidados.contarConvidados();
        convidados.removerConvidado(1);
        convidados.exibirConvidados();
        convidados.contarConvidados();

        convidados.pesquisarConvidado(2);

        convidados.exibirConvidadosPorCodigoConvite();

        System.out.println(convidados.exibirConvidadosPorCodigoConvite());
    }
}