package Set.OperacoesBasicas;

public class Convidado {
    private String nome;
    private int codigoConvite;

    //Construtor
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }



    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    /**
    * Como cada elemento no array convidados só tem um código de convite correspondente podemos usar
    * ele como hashCode.
    * @return retorna o codigoConvite como hashCode.
    * */
    @Override
    public int hashCode(){
        return codigoConvite;
    }


    /**
    * Compara se dois convidados são iguais pelo codigo de convite.
    * */
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Convidado))
            return false;
        if(o == this)
            return true;
        Convidado oConvidado = (Convidado) o;

        return oConvidado.getCodigoConvite() == this.codigoConvite;
    }
}
