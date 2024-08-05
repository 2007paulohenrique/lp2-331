package metodosDeUtilidadeDeObjeto;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("paulo", 16);
        Pessoa pessoa2 = new Pessoa("rodrigo", 33);
        Pessoa pessoa3 = new Pessoa("rodrigo", 33);
        Pessoa pessoa4 = pessoa;

        System.out.println(pessoa.equals(pessoa2));
        System.out.println(pessoa.equals(pessoa4));
        System.out.println(pessoa2.equals(pessoa3));
        
        System.out.println(pessoa.hashCode());
        System.out.println(pessoa2.hashCode());
        System.out.println(pessoa3.hashCode());
        System.out.println(pessoa4.hashCode());

        System.out.println(pessoa.toString());
        System.out.println(pessoa2.toString());
    }
}