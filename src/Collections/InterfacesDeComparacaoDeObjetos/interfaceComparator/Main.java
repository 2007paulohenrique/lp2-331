package Collections.InterfacesDeComparacaoDeObjetos.interfaceComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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

        // criar um Comparator que seja uma instancia da classe que implementou Comparator
        Comparator<Aluno> comparadorPelaIdade = new CompararAlunosPorIdade();

        // sort - ordenar uma lista ou array utilizando um Comparator
        Collections.sort(listaAlunos, comparadorPelaIdade);
        Arrays.sort(arrayAlunos, comparadorPelaIdade);
        
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno.getNome() + " " + aluno.getIdade());
        }

        for (Aluno aluno : arrayAlunos) {
            System.out.println(aluno.getNome() + " " + aluno.getIdade());
        }
    }
}