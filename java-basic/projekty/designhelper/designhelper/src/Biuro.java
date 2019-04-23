import java.util.ArrayList;

public class Biuro extends Lokal{

    public Biuro(ArrayList<Pomieszczenie> listaPokoi) {
        super(listaPokoi);
    }
    public boolean isValid (){
        boolean jestGabinet = false;
        boolean jestPoczekalnia = false;
        boolean jestSypialnia = false;

        for(Pomieszczenie p:listaPokoi)
        {
            if(p.typ.equals("Sypialnia"))
                jestSypialnia = true;
            if(p.typ.equals("Poczekalnia"))
                jestPoczekalnia = true;
            if(p.typ.equals("Gabinet"))
                jestGabinet = true;
        }
        return jestPoczekalnia && jestGabinet &&!jestSypialnia;
    }
    public double cenaJednostkowa(Standard s){
        return s.biuro;
    }

}
