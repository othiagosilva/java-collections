package list.pesquisa;

import java.util.*;

public class SomaNumeros {
    public List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int somarNumeros() {
        int soma = 0;
        for (int numero : this.numeros) {
            soma += numero;
        }
        return soma;
    }

    public void encontrarMaiorNumero() {
        int maior = this.numeros.get(0);
        for (int numero : this.numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println(maior);
    }

    public void encontrarMenorNumero(){
        int menor = this.numeros.get(0);
        for(int numero : this.numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println(menor);
    }

    public void exibirNumeros() {
        System.out.println(numeros);
    }

    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);

        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.somarNumeros());

        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();
    }
}
