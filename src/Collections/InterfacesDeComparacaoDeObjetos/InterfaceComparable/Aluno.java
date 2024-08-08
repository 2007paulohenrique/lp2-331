package Collections.InterfacesDeComparacaoDeObjetos.InterfaceComparable;

// Comparable - implementada em uma classe para comparar, e assim ordenar seus objetos 
// usada para definir uma ordem natural para objetos de uma classe
// deve sobrescrever o metodo compareTo()

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private Integer idade;
    
    public Aluno(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // compareTo() - metodo de comparable usado para comparar um objeto com outro do mesmo tipo para ordenacao 
    // define a ordem natural dos objetos da classe
    // ordena baseado em atributos da classe
    // retorna um int negativo se o objeto atual for menor que o passado como parametro
    // retorna zero se o objeto atual for igual ao passado como parametro
    // retorna um int positivo se o objeto atual for maior que o passado como parametro

    @Override
    public int compareTo(Aluno aluno) {
        // caso eu compare numeros, a ordenacao sera por ordem numerica (do menor pro maior)
        // caso eu compare strings, a ordenacao sera por ordem alfabetica (do menor pro maior)
        // para inverter a ordem (do maior pro menor):
        // return aluno.getNome().compareTo(this.nome);

        return this.nome.compareTo(aluno.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }
}
