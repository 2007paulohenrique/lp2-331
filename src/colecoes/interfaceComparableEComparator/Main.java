package colecoes.interfaceComparableEComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // metodos de ordenacao - coloca os elementos de uma sequencia em uma certa ordem
        
        // Collections.sort(List<T>, Comparator) - ordena os elementos da lista pelo comparator, 
        // caso nao seja passado um comparator a lista sera ordenada por ordem crescente

        // interface Comparable - se implementada, oferece meios para ordenar uma lista de objetos de uma classe
        // permite ao programador definir uma regra de comparação e ordenação de objetos
        // metodo compareTo -  permite estabelecer uma ordem natural sobre objetos da classe que implementam Comparable
        // listas de objetos que implementam a interface Comparable podem ser ordenadas por Collections.sort()

        List<String> strings = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();

        strings.add("aa");
        strings.add("ggg");
        strings.add("b");
        strings.add("abajur");
        strings.add("dado");

        ints.add(4);
        ints.add(67);
        ints.add(44);
        ints.add(100);
        ints.add(55);

        Collections.sort(strings, Collections.reverseOrder());
        System.out.println(strings);
        Collections.sort(ints, Collections.reverseOrder());
        System.out.println(ints);

        Collections.sort(strings);
        System.out.println(strings);
        Collections.sort(ints);
        System.out.println(ints);

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("paulo", 16));
        alunos.add(new Aluno("ricardo", 23));
        alunos.add(new Aluno("joao", 12));
        alunos.add(new Aluno("ana", 18));

        Collections.sort(alunos);
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " " + aluno.getIdade());
        }

        Comparator<Aluno> comparadorPelaIdade = new CompararAlunosIdade();

        Collections.sort(alunos, comparadorPelaIdade);
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " " + aluno.getIdade());
        }

        // metodos de Collections - somente listar podem ser passadas como parametro
        List<String> copiados = new ArrayList<>();
        copiados.add("cop1");
        copiados.add("cop2");
        copiados.add("cop3");

        // ordena os elementos por ordem crescente
        Collections.sort(strings);

        // procura por um valor numa colecao e retorna sua posicao, mas a colecao precisa estar ordenada (sort)
        Collections.binarySearch(strings, "paulo");

        // inverte a ordem dos elementos
        Collections.reverse(strings);

        // embaralha os elementos
        Collections.shuffle(strings);

        // substitui todos os elementos por um valor
        Collections.fill(strings, "igual");

        // substitui os elementos de uma lista (dest) pelos de outra lista (src)
        // a lista de src nao e alterada
        // a lista de dest precisa ser igual ou maior a de src
        // o tamanho da lista de dest e mantido
        // os valores da lista de dest sao substituidos de acordo com a correspondencia de indices entre os valores das listas
        // ex: dest = [1, 2, 3, 4] src = [10, 15] Collections.copy(dest, src) dest = [10, 15, 3, 4]
        Collections.copy(strings, copiados);
    }
}