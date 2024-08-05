package colecoes.interfaceComparableEComparator;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private Integer idade;
    
    public Aluno(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // metodo que decide a forma de ordenacao da lista de Objetos dessa classe que implementou Comparable 
    // ordenacao crescente por algum atributo da classe, no caso nome
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }
    
}
