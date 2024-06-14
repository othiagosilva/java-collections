package set;

import java.util.Comparator;
import java.util.Objects;

public class Convidado {

    public String nome;
    public int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    @Override 
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado c)) return false;
        return getCodigoConvite() ==  c.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}

class ComparatorCodigoConvite implements Comparator<Convidado>{

    @Override
    public int compare(Convidado c1, Convidado c2) {
        return Integer.compare(c1.getCodigoConvite(), c2.getCodigoConvite());
    }
}