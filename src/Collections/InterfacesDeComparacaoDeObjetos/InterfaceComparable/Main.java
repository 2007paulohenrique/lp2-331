package Collections.InterfacesDeComparacaoDeObjetos.InterfaceComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // colecoes e arrays de objetos da classe que implementou Comparable podem ser ordenados

        List<Aluno> listaAlunos = new ArrayList<>();
        Aluno[] arrayAlunos = new Aluno[4];

        listaAlunos.add(new Aluno("paulo", 16));
        listaAlunos.add(new Aluno("ricardo", 23));
        listaAlunos.add(new Aluno("joao", 12));
        listaAlunos.add(new Aluno("ana", 18));

        arrayAlunos[0] = new Aluno("paulo", 16);
        arrayAlunos[1] = new Aluno("ricardo", 23);
        arrayAlunos[2] = new Aluno("joao", 12);
        arrayAlunos[3] = new Aluno("ana", 18);

        // sort - ordena uma lista ou array de objetos da classe que sobreescreveu compareTo(), 
        // com base na ordenacao natural definida nele

        // so pode ser usada caso a classe dos objetos a ordenar implemente comparable ou caso seja fornecido um Comparator
        // lanca uma excessao caso haja um valor nulo
        Collections.sort(listaAlunos);
        Arrays.sort(arrayAlunos);

        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno.getNome() + " " + aluno.getIdade());
        }

        for (Aluno aluno : arrayAlunos) {
            System.out.println(aluno.getNome() + " " + aluno.getIdade());
        }
    }
}
