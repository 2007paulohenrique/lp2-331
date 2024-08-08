package Collections.InterfacesDeComparacaoDeObjetos.interfaceComparator;

public class Aluno {
    private String nome;
    private Integer idade;
    
    public Aluno(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
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
