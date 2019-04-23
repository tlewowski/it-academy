import java.util.ArrayList;

public class Lokal {

    ArrayList<Pomieszczenie> listaPokoi;
    public Lokal(ArrayList<Pomieszczenie> listaPokoi) {
        this.listaPokoi = listaPokoi;
    }
    public boolean isValid (){
        return true;
    }
    public double cenaJednostkowa(Standard s)
    {
        return s.willa;
    }
    public double cena (Standard s)
    {
        double suma=0;
        for(Pomieszczenie p:listaPokoi)
        {
            suma+=p.metraz;
        }
      return suma*cenaJednostkowa(s);
    }

}
