package List.Ordenacao.Pessoas;
//A interface Comparable esta no dentro do pacote java.lang.
import java.lang.*;

//Implementando a interface Comparable que precisa de um objeto como parametro, no caso Pessoa.

/**
* Esta classe pelas instâncias de pessoas e contém a lógica de ordenação por Comparable
* */
public class Pessoa implements Comparable<Pessoa>{

    //Atributos da classe
    private String nome;
    private int idade;
    private double altura;


    //Construtor com todos os atributos da classe
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }


    /**
    *A função faz uma comparação de acordo com a idade da pessoa.
    *Sobrescrita da função compareTo da Interface Comparable
    *@param pessoaComparada Objeto da classe Pessoa comparado com a instancia que chamou o metodo
    *@return Retorna um inteiro , -1, 0 ou 1, caso o objeto que chamou o metodo é menor, igual ou
    * maior, respectivamente -> esteObjeto < pessoaComparada, esteObjeto = pessoaComparada, este
    * objeto > pessoaComparada.
    * */
    @Override
    public int compareTo(Pessoa pessoaComparada){
        //Fazendo um casting para String.
        return Integer.toString(idade).compareTo(Integer.toString(pessoaComparada.idade));
    }


    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
