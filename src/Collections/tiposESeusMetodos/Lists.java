package Collections.tiposESeusMetodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {
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
        arrayList.add("joao");
        arrayList.add("baba");
        arrayList.add("lapis");

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

        // ordena uma lista de forma crescente lista
        Collections.sort(arrayList);
        System.out.println(arrayList);

        // Collections.reverseOrder() - comparador que pode ser passado como segundo parametro no sort()
        // ordena uma lista de forma decrescente
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println(arrayList);

        // procura por um valor numa lista ordenada de forma crescente e retorna sua posicao
        // caso a lista esteja ordenada de forma decrescente, a posicao retornada sera incorreta
        System.out.println(Collections.binarySearch(arrayList, "baba"));

        // inverte a ordem dos elementos
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        // embaralha os elementos
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        // substitui todos os elementos por um valor
        Collections.fill(arrayList, "igual");
        System.out.println(arrayList);

        // substitui os elementos de uma lista (dest) pelos de outra lista (src)
        // a lista src nao e alterada
        // a lista dest precisa ter tamanho igual ou maior a src
        // o tamanho da lista dest e mantido
        // os valores da lista de dest sao substituidos de acordo com a correspondencia de indices entre os valores das listas
        // ex: dest = [1, 2, 3, 4] src = [10, 15] Collections.copy(dest, src) dest = [10, 15, 3, 4]
        List<String> strings = new ArrayList<>();
        strings.add("primeira");
        strings.add("segunda");
        strings.add("terceira");

        Collections.copy(arrayList, strings);
        System.out.println(arrayList);
    }
}
