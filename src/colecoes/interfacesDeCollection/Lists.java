package colecoes.interfacesDeCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // List 
        // colecao ordenada - permite elementos duplicados - a ordem dos elementos e mantida pela posicao baseada em indice
        // tipos principais:

        // ArrayList 
        // baseada em um array redimensionavel - boa para acessos aleatorios e buscas rapidas
        // insercoes e remocoes podem ser lentas se feitas no meio da lista

        List<String> arrayList = new ArrayList<>();

        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("apple");

        System.out.println(arrayList);

        // LinkedList 
        // implementada como uma lista duplamente ligada - boa para insercoes e remocoes rapidas
        // acesso aleatorio mais lento

        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("apple");

        // metodos de List:
        
        // obter item em uma posicao
        linkedList.get(1);
        
        // substitui o elemento em uma posicao por outro
        linkedList.set(1, "NovoElemento");
        
        // adiciona um elemento em uma posicao
        linkedList.add(2, "ElementoNoMeio"); 
        
        // remove o elemento em uma posicao
        linkedList.remove(2); 
        
        // obtem a posicao da primeira ou ultima ocorrencia de um elemento
        linkedList.indexOf("Elemento1");
        linkedList.lastIndexOf("Elemento1");
        
        // Obtem a sub-lista dos elementos de uma posicao ate outra da colecao
        linkedList.subList(0, 2);
    }
}
