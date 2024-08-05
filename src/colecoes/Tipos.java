package colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
//import java.util.TreeSet;

// interfaces sao um conjunto de regras que devem ser seguidas pelas classes que a implementarem 
// nao podem ser instanciadas
// interface collection - colecoes sao agrupamentos de objetos

public class Tipos {
    /**
     * @param args
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // interfaces de Collection
        // List - colecao ordenada - ordem de entrada - pode armazenar elementos duplicados
        // Set - colecao que nao garante a ordem de entrada - nao permite objetos duplicados
        // Queue - permite a criação de pilha e fila - ordem definida pelas implementações 
        // das interfaces Comparable ou Comparator

        // implementacoes

        // List - ArrayList e LinkedList

        // o tempo para inserir e remover elementos cresce quantos maior o arraylist for - busca rapida de elementos.
        List<Object> arrayList = new ArrayList<>();

        // o tempo de busca cresce quanto maior a linked list for - insercao e remocao de elementos rapida
        List<Object> linkedList = new LinkedList<>();

        // Set - HashSet, LinkedHashSet e TreeSet

        // acesso rapido aos dados
        Set<Object> hashSet = new HashSet<>();

        // elementos ordenados conforme a entrada
        Set<Object> linkedHashSet = new LinkedHashSet<>();

        // acesso lento aos dados - dados ordenados automaticamente
        //Set<Object> treeSet = new TreeSet<>();

        // Queue - PriorityQueue

        // ordenamento natural - o elemento que foi adicionado primeiro sera o primeiro a ser removido
        Queue<Object> priorityQueue = new PriorityQueue<>();
    }
}