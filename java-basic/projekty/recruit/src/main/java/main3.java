import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class main3 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=100;i++)
        {
            list.add(i);
        }
        Random r=new Random();

        System.out.println(r.ints(10).filter(x->x%1==0).map(x->{System.out.println(x);return x;}).sum());
      // int sum= list.stream().filter(x->x%10==0).mapToInt(x->x).sum();
       // System.out.println(list.stream().filter(x->x%10==0).collect(Collectors.toList()));
       // System.out.println(sum);
    }}