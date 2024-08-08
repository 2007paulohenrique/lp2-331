package Collections.tiposESeusMetodos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MetodosDeCollection {
    public static void main(String[] args) {
        // principais metodos comuns das interfaces de Collection abaixo
        // para List, Set e Queue
        // Map possui metodos diferentes

        // para exemplo, serao usados ArrayLists e um Object qualquer

        List<Object> colecao = new ArrayList<>();
        List<Object> colecao2 = new ArrayList<>();
        Object obj = "abc";

        // adiciona um objeto a colecao
        colecao.add(obj);

        // retorna true se a colecao estiver vazia e false se nao estiver
        colecao.isEmpty();

        // remove um objeto da colecao se ele estiver presente nela
        colecao.remove(obj);
        
        // limpa todos os elementos da colecao
        colecao.clear();
        
        // retorna true se a colecao conter um objeto e false se nao conter
        colecao.contains(obj); 

        // adiciona todos os elementos da colecao passada como parametro ao final de outra colecao
        colecao.addAll(colecao2); 

        // remove todos os elementos de uma colecao se eles estiverem contidos na colecao passada como parametro
        colecao.removeAll(colecao2);

        // remove os elementos de uma colecao caso eles nao estejam na colecao do parametro
        // mantem os elementos comuns as duas colecoes - a colecao do parametro nao e afetada
        colecao.retainAll(colecao2);

        // retorna o número de elementos da colecao
        colecao.size(); 


        colecao.add("abc");
        colecao.add("ajajabc");
        colecao.add("paulo");
        colecao.add("henrique");
        colecao.add("barba");

        // usado para obter um iterador que permite percorrer os elementos de uma colecao de forma sequencial
        // Iterator - metodos:
        // hasNext() - verificar se ha mais elementos na colecao
        // next() - obter proximo elemento
        // remove() - remover elemento atual
        Iterator<Object> iterador = colecao.iterator();

        // iterar sobre os elementos de uma colecao
        while (iterador.hasNext()) {
            Object elemento = iterador.next();
            System.out.println("Elemento: " + elemento);

            if ("Elemento2".equals(elemento)) {
                iterador.remove();
            }
        }

        // retorna todos os elementos de uma colecao em forma de array
        colecao.toArray();
    }
}