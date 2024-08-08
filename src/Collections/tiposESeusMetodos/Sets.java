package Collections.tiposESeusMetodos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Set 
        // nao permite elementos duplicados 
        // nao mantem uma ordem especifica dos elementos, exceto no caso de implementacoes especificas
        // tipos principais:

        // HashSet 
        // baseada em uma tabela hash - rapido acesso a elementos

        Set<String> hashSet = new HashSet<>();

        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("apple"); 

        System.out.println(hashSet);

        // LinkedHashSet
        // mantem uma lista duplamente ligada dos elementos na ordem em que foram inseridos

        Set<Object> linkedHashSet = new LinkedHashSet<>();

        // TreeSet
        // mantem os elementos armazenados em ordem crescente natural ou de acordo com um comparador fornecido

        Set<Object> treeSet = new TreeSet<>();

        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("apple");
        treeSet.add("zebra");
        treeSet.add("amor") ;

        System.out.println(treeSet);
    }
}
