package colecoes.interfaceComparableEComparator;

import java.util.Comparator;

public class CompararAlunosIdade implements Comparator<Aluno> {
    // igual a implementacao de Comparable, so que 2 objetos da mesma classe 
    // serao passados como parametro no metodo compare
    public int compare(Aluno aluno1, Aluno aluno2){
        return aluno1.getIdade().compareTo(aluno2.getIdade());
    }
}