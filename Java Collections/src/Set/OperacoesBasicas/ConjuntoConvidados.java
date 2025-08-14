package Set.OperacoesBasicas;

import java.util.*;

public class ConjuntoConvidados {

    //Como a ordem dos elementos não importa, é melhor usar o HashSet.
    Set<Convidado> convidados = new HashSet<>();

    /**
    * Adiciona um convidado a variavel convidados utilizando os parâmetros do construtor
    * da classe Convidado.
    * @param nome Nome do convidado.
    * @param codigoConvite código único de convite para cada convidado.
    * */
    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }


    /**
    * Tenta remover um candidato pelo código de convite
    * @param codigoConvite código único para cada convidado.
    * @return caso exista um convidado com o código de convite passado, ele é removido
    * da lista retornando true, caso contrário retorna false.
    * */
    public boolean removerConvidadoPorCodigoConvite(int codigoConvite){
        //utilizando uma expressão lambda que compara cada código de convite dos n con-
        //vidados até encontrar(ou não) o correspondete com o codigo de convite passado
        //como parâmetro
        if(convidados.removeIf(c -> c.getCodigoConvite() == codigoConvite)){
            System.out.println("Convidado removido.");
            return true;
        }else{
            System.out.println("Convidado não encontrado");
            return false;
        }
    }

    /**
    * Mostra o tamanho do HashSet convidados
    * */
    public int contarConvidados(){
        return convidados.size();
    }

    /**
    *Lista os convidados, mostrando nome e o código de convidte.
    * */
    public void exibirConvidados(){
        convidados.forEach(c ->{
            System.out.printf("Convidado: %s, código: %d%n", c.getNome(), c.getCodigoConvite());
        });
    }

}
