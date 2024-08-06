import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class Maps {
    public static void main(String[] args) {
        // Map 
        // representa uma estrutura de dados que armazena pares de chave-valor
        // cada chave e unica e esta associada a um valor
        // chaves - usadas para acessar os valores
        // valores - podem ser duplicados
        // formato - Map<K, V> - k = tipo da chave, v = tipo do valor

        // tipos principais:

        // HashMap - rapida para operacoes basicas como adição, remoção e busca, mas nao garante a ordem dos elementos

        Map<String, Integer> map = new HashMap<>();

        // TreeMap - elementos sao armazenados ordenados conforme a ordem das chaves

        Map<String, Integer> map = new TreeMap<>();

        // LinkedHashMap - elementos ordenados conforme a ordem de insercao
        
        Map<String, Integer> map = new LinkedHashMap<>();

        // metodos:

        // Adiciona pares chave-valor ao map
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // obter valor associado a uma chave
        map.get("Alice"); 

        // remover par chave-valor
        map.remove("Charlie");

        // verifica se existe uma chave no map 
        map.containsKey("Maçã");

        // verifica se existe um valor no map
        map.containsValue(30);
        
        // obter um Set contendo todas as chaves presentes no map
        map.keySet();
        
        // obter uma Collection contendo todos os valores associados as chaves no map
        map.values();

        // iterar sobre o map
        // .Entry - representa um unico par chave-valor
        // entrySet() - obter um set contendo todas as entradas (todos os Entrys) do map 
        for (Map.Entry<String, Integer> entrada : map.entrySet()) {
            // getKey() - obter chave do Entry (entrada)
            // getValue() - obter valor do Entry
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
