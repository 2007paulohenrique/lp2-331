package Collections.InterfacesDeComparacaoDeObjetos.interfaceComparator;

import java.util.Comparator;

// Comparator deve ser implementada em uma classe focada em comparar
// com base em algum atributo

public class CompararAlunosPorIdade implements Comparator<Aluno> {
    // como o metodo de ordenacao esta em uma classe diferente da classe dos objetos a serem comparados,
    // dois objetos da mesma classe devem ser passados como parametro
    // mesmo funcionamento do compareTo() da interface Comparable
    // o primeiro parametro e comparado com o segundo
    
    public int compare(Aluno aluno1, Aluno aluno2){
        return aluno1.getIdade().compareTo(aluno2.getIdade());
    }
}