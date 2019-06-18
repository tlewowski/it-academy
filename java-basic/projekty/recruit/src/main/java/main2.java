import java.util.*;
import java.util.stream.Collectors;

public class main2 {
    public static int foo(List<String> lista) {
        Collections.sort(lista);
        int n = 0;
        boolean isFirst = true;
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i).equals(lista.get(i + 1))) {
                if (isFirst) {
                    n++;
                    isFirst = false;
                }
                n++;
            } else isFirst = true;
        }
        return n;
    }

    public static Character foo2(List<String> lista) {


       String potezneSlowo= String.join("",lista).toLowerCase();

        HashMap<Character, Integer> elems = new HashMap<>();

        for(char l: potezneSlowo.toCharArray()) {
            elems.put(l, elems.getOrDefault(l, 0) + 1);
        }

        ArrayList<Map.Entry<Character, Integer>> a = new ArrayList<>(elems.entrySet());
        Collections.sort(a, (b, c) -> b.getValue().compareTo(c.getValue()));
        return a.get(0).getKey();
    }
}