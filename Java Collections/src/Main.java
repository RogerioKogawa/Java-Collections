import List.Ordenacao.Pessoas.OrdenacaoPessoas;
import Set.OperacoesBasicas.ConjuntoConvidados;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        //Testando a ordenação de pessoas, List
        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.60);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.90);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.50);

        System.out.println("Pessoas na ordem de inserção:\n" + ordenacaoPessoas.toString());
        System.out.println("=============================");

        System.out.printf("Lista organizada por idade: ");
        ordenacaoPessoas.ordenarPorIdade();
        System.out.println(ordenacaoPessoas.toString());
        System.out.println("=============================");

        System.out.printf("Lista organizada por altura: ");
        ordenacaoPessoas.ordenarPorAltura();
        System.out.println(ordenacaoPessoas.toString());

        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println("=============================");
        ConjuntoConvidados conjunto = new ConjuntoConvidados();

        //Testando o Set, HashSet.
        conjunto.adicionarConvidado("João", 123);
        conjunto.adicionarConvidado("Maria", 456);
        conjunto.adicionarConvidado("Carlos", 789);
        //Note que Ana tem o mesmo código de convite que João logo não
        //será inclusa em convidados.
        conjunto.adicionarConvidado("Ana", 124);


        System.out.println("\nLista de convidados:");
        conjunto.exibirConvidados();
        System.out.println("=============================");
        System.out.println("\nTotal de convidados: " + conjunto.contarConvidados());

        //Removendo Maria
        conjunto.removerConvidadoPorCodigoConvite(456);

        System.out.println("\nLista de convidados após remoção:");
        conjunto.exibirConvidados();
        System.out.println("=============================");
        //Tentando remover um convidado com codigoConvite = 999.
        conjunto.removerConvidadoPorCodigoConvite(999);

        System.out.println("\nTotal de convidados: " + conjunto.contarConvidados());
    }
}