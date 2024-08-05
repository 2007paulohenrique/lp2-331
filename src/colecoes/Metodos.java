package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Metodos {
    public static void main(String[] args) {
        //principais metodos de List
        List<Object> colecao = new ArrayList<>();
        List<Object> colecao2 = new ArrayList<>();
        Object obj = "abc";

        // adiciona um objeto à coleção
        colecao.add(obj);

        // return true se a coleção estiver vazia e false se não estiver
        System.out.println(colecao.isEmpty());

        // remove um objeto da coleção se ele estiver presente nela
        colecao.remove(obj);
        
        // limpa todos os elementos da coleção
        colecao.clear();
        
        // retorna true se a coleção conter um objeto e false se não conter
        colecao.contains(obj); 

        // adiciona todos os elementos da colecao passada como parametro ao final de outra coleção
        colecao.addAll(colecao2); 

        // remove todos os elementos de uma coleção se eles estiverem contidos na colecao passada como parametro
        colecao.removeAll(colecao2);

        // retorna o número de elementos da coleção
        colecao.size(); 
    }
}