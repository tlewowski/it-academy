import java.util.ArrayList;

public class Mieszkanie extends Lokal{

    public Mieszkanie(ArrayList<Pomieszczenie> listaPokoi) {
        super(listaPokoi);
    }
    public boolean isValid (){
        boolean jestKuchnia = false;
        boolean jestLazienka = false;
        boolean jestSypialnia = false;

        for(Pomieszczenie p:listaPokoi)
        {
            if(p.typ.equals("Sypialnia"))
                jestSypialnia = true;
            if(p.typ.equals("Lazienka"))
                jestLazienka = true;
            if(p.typ.equals("Kuchnia"))
                jestKuchnia = true;
        }
        return jestKuchnia && jestLazienka && jestSypialnia;
    }
    public double cenaJednostkowa(Standard s){
        return s.mieszkanie;
    }

}
