package Collections.tiposESeusMetodos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Map 
        // representa uma estrutura de dados que armazena pares de chave-valor
        // cada chave e unica e esta associada a um valor
        // chaves - usadas para acessar os valores
        // valores - podem ser duplicados
        // formato - Map<K, V> - k = tipo da chave, v = tipo do valor

        // tipos principais:

        // HashMap - rapida para operacoes basicas como adição, remoção e busca, mas nao garante a ordem dos elementos
    
        Map<String, Integer> hashMap = new HashMap<>();

        // TreeMap - elementos sao armazenados ordenados conforme a ordem das chaves

        Map<String, Integer> treeMap = new TreeMap<>();

        // LinkedHashMap - elementos ordenados conforme a ordem de insercao
        
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // metodos de Map:

        // Adiciona pares chave-valor ao map
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 25);
        hashMap.put("Charlie", 35);

        // obter valor associado a uma chave
        hashMap.get("Alice"); 

        // remover par chave-valor
        hashMap.remove("Charlie");

        // verifica se existe uma chave no map 
        hashMap.containsKey("Maçã");

        // verifica se existe um valor no map
        hashMap.containsValue(30);
        
        // obter um Set contendo todas as chaves presentes no map
        hashMap.keySet();
        
        // obter uma Collection contendo todos os valores associados as chaves no map
        hashMap.values();

        // iterar sobre o map
        // .Entry - representa um unico par chave-valor
        // entrySet() - obter um set contendo todas as entradas (todos os Entrys) do map 
        for (Map.Entry<String, Integer> entrada : hashMap.entrySet()) {
            // getKey() - obter chave do Entry (entrada)
            // getValue() - obter valor do Entry
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
