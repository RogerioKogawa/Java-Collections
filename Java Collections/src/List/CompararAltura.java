package List;
import java.util.Comparator;

/**
* Classe para comparar objetos do tipo Pessoa por altura
* */
public class CompararAltura implements Comparator<Pessoa> {
    /**
    *Função que compara dois objetos por altura
    * @param o1 Primeiro objeto.
    * @param o2 Segundo objeto.
    * @return caso: o1 > o2, retorna 1; caso: o1 < o2 retorna -1; caso: o1 = o2 retorna 0.
    * */
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        if(o1.getAltura() < o2.getAltura())
            return -1;
        if(o1.getAltura() > o2.getAltura())
            return 1;
        return 0;
    }
}
