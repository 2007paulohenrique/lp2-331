package metodosDeUtilidadeDeObjeto;

public class Pessoa{
    private String nome;
    private Integer idade;
    
    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // metodos de utilidade de objeto
    // metodos que fornecem funcionalidades essenciais para a manipulacao e a interacao basica com os objetos

    // hashCode() - utilizado para gerar um valor hash que representa o objeto - codigo numerico int
    // equals(Object obj) - utilizado para comparar a igualdade entre dois objetos
    // toString() - utilizado para obter uma representação em string do objeto
    // todos eles precisam ser sobrescritos
    
    // equals
    @Override
    public boolean equals(Object obj) {
        // caso o objeto que invocou o metodo tenha o mesmo espaco na memoria que o obj
        if (this == obj) 
            return true;
        
        if (obj == null) 
            return false;
        
        // caso a classe do objeto que invocou o metodo seja diferente da classe do obj
        if (getClass() != obj.getClass()) 
            return false;
        
        // cast do obj para a mesma classe do objeto que invoca o metodo
        Pessoa outra = (Pessoa) obj;

        // comparar atributos
        if (nome == null) {
            if (outra.nome != null) 
                return false;

        } else if (!nome.equals(outra.nome)) // compara os valores dos atributos caso eles nao sejam nulos
            return false;
        
        if (idade == null) {
            if (outra.idade != null) 
                return false;

        } else if (!idade.equals(outra.idade)) 
            return false;

        return true;
    }

    // hashCode
    @Override
    public int hashCode() {
        int primo = 7; // declaracao de um numero primo
        int resultado = 1; 
        resultado = primo * resultado + ((nome == null) ? 0 : nome.hashCode()); // operacao para gerar o hashcode
        // repetir operacao para cada atributo da classe
        resultado = primo * resultado + ((idade == null) ? 0 : idade.hashCode()); 
        return resultado; // retorna o codigo hash do objeto
    }

    // toString
    @Override
    public String toString() {
        // forma de representar o objeto numa string, logo e bom incluir o valor dos atributos no retorno, ex
        return nome + "@idade=" + idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    
}
