import List.*;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();



        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.60);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);

        System.out.println("Pessoas na ordem de inserção:\n" + ordenacaoPessoas.toString());
        System.out.println("===============");
        System.out.printf("Lista organizada: ");
        ordenacaoPessoas.ordenarPorIdade();
        System.out.println(ordenacaoPessoas.toString());
    }
}