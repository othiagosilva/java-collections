package list.operacoesBasicas;

import java.util.*;

public class ListaDeTarefas {
    public List<Tarefa> listaDeTarefas;

    public ListaDeTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if(!listaDeTarefas.isEmpty()){
            int tamanhoAtual = this.listaDeTarefas.size();
            for(Tarefa tarefa : this.listaDeTarefas) {
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    this.listaDeTarefas.remove(tarefa);
                }
            }
            if(this.listaDeTarefas.size() != tamanhoAtual) {
                System.out.println("Tarefa removida com sucesso");
            } else {
                System.out.println("Tarefa não encontrada");
            }
        } else {
            System.out.println("Não há tarefas para remover");
        }
    }

    public void obterNumeroTotalTarefas() {
        System.out.println("A lista possui: " + this.listaDeTarefas.size() + " tarefa(s)");
    }

    public void obterDescricoesTarefas() {
        if(!this.listaDeTarefas.isEmpty()) {
            for(Tarefa tarefa : this.listaDeTarefas) {
                System.out.println(tarefa.getDescricao());
            }
        } else {
            System.out.println("Não há tarefas para mostrar");
        } 
    }

    public static void main(String[] args) {
        ListaDeTarefas listaTarefa = new ListaDeTarefas();
        
        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para o exame");
        listaTarefa.adicionarTarefa("Fazer exercícios");
    
        listaTarefa.obterNumeroTotalTarefas();
    
        listaTarefa.obterDescricoesTarefas();
        
        // Removendo tarefa que não existe
        listaTarefa.removerTarefa("Trabalhar");
    
        listaTarefa.obterNumeroTotalTarefas();
    
        listaTarefa.obterDescricoesTarefas();
    
        // Removendo tarefa que existe
        listaTarefa.removerTarefa("Estudar para o exame");
    
        listaTarefa.obterNumeroTotalTarefas();
        listaTarefa.obterDescricoesTarefas();
      }
}