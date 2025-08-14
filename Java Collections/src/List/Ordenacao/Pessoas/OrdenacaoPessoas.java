package List.Ordenacao.Pessoas;

import java.util.*;

/**
* Este classe é responsável por armazenar as Pessoas em uma lista e ordenadas.
* */
public class OrdenacaoPessoas{

    //Lista para guardar as Pessoas
    List<Pessoa> pessoas = new LinkedList<>();

    /**
    * Funcao para adicionar uma instância de Pessoa na lista pessoas
    * @param nome Nome da pessoa.
    * @param idade Idade da pessoa.
    * @param altura Altura da pessoa.
    * */
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome,idade, altura));
    }
    /**
     *Função que utiliza o compareTo() para ordenar uma lista.
     *
     * */
    public void ordenarPorIdade(){
        //Utilizando um método estático da classe Collections, sort que recebe como parametro uma lista
        Collections.sort(pessoas);
    }

    public void ordenarPorAltura(){
        Collections.sort(pessoas, new CompararAltura());
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Pessoa pessoa : pessoas) {
            sb.append("Nome: ").append(pessoa.getNome())
                    .append(", Idade: ").append(pessoa.getIdade())
                    .append(", Altura: ").append(pessoa.getAltura())
                    .append("\n");
        }
        return sb.toString();
    }
}


