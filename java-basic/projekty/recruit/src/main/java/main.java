import javafx.util.Pair;

public class main {
    public static void main(String[] args)
    {


    }
    public static Pair<Integer, Integer> f (int[] tab)
    {
        if(tab.length>1) {


            Pair<Integer, Integer> r = null;
            int min = tab[0] + tab[1];
            r = new Pair<>(tab[0], tab[1]);
            for (int i = 1; i < tab.length - 1; i++) {
                if (tab[i] + tab[i + 1] < min) {
                    r = new Pair<>(tab[i], tab[i + 1]);
                    min = tab[i] + tab[i + 1];

                }


            }
            return r;
        }
        return null;
    }
}
