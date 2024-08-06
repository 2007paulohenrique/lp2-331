package colecoes.interfacesDeCollection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        // Queue 
        // fila - usada para armazenar elementos de forma que o primeiro elemento inserido seja o primeiro a ser removido
        // tipos principais:

        // LinkedList
        // tambem implementa a interface Queue alem da List

        // PriorityQueue
        // nao garante que os elementos estarao em uma ordem especifica - pode ser ordenado por um Comparator fornecido
        // o menor elemento sempre se torna o primeiro (raiz)

        Queue<Integer> queue = new PriorityQueue<>();
        
        queue.add(7);
        queue.add(1);
        queue.add(3);

        System.out.println(queue);

        // metodos de Queue:

        // adiciona elementos ao final da fila
        queue.offer(6); 
        queue.offer(47);
        queue.offer(21);

        System.out.println(queue);
        
        // obtem e remove o primeiro elemento da fila
        queue.poll();

        System.out.println(queue);
        
        // obtem o primeiro elemento da fila
        System.out.println(queue.peek());  
        
        // remove o primeiro elemento da flla
        queue.remove();

        System.out.println(queue);
    }
}
