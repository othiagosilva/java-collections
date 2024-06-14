package map;

import java.util.*;

public class AgendaContatos {
    private Map<String, Integer> agendaContato;

    public AgendaContatos(){
        this.agendaContato = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContato.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContato.isEmpty() && agendaContato.containsKey(nome)){
            agendaContato.remove(nome);
        } else {
            System.out.println("Contato não encontrado");
        }
    }

    public void exibirContatos() {
        if(!agendaContato.isEmpty()){
            System.out.println(agendaContato);
        } else {
            System.out.println("Agenda vazia");
        }
    }

    public void pesquisarContato(String nome){
        if(!agendaContato.isEmpty() && agendaContato.containsKey(nome)){
            System.out.println(agendaContato.get(nome));
        } else {
            System.out.println("Contato não encontrado");
        }
    }

    public void ordenarContato(){
        if(!agendaContato.isEmpty()){
            Map<String, Integer> agendaOrdenada = new TreeMap<>(agendaContato);
            System.out.println(agendaOrdenada);
        } else {
            System.out.println("Agenda vazia");
        }
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Joaquim", 123456789);
        agenda.adicionarContato("Maria", 987654321);

        agenda.exibirContatos();

        agenda.pesquisarContato("Maria");
        agenda.removerContato("Maria");

        agenda.exibirContatos();

        agenda.pesquisarContato("Maria");
        
        agenda.adicionarContato("Ana", 123456789);
        agenda.adicionarContato("Thiago A.", 123456789);
        agenda.adicionarContato("Thiago S.", 123456789);

        agenda.ordenarContato();
    }
}
