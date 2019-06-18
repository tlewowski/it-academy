import java.util.ArrayList;

public class main4 {
    public static void main(String[] args)
    {
        //ArrayList<Integer> list=new ArrayList<>();
        int fizz = 0;
        int buzz=0;
        int fizzBuzz=0;

        for(int i=1;i<=100;i++)
        {
            if(i%3==0&i%5==0)
            {
                fizz+=i;
                buzz+=i;
                fizzBuzz+=i;
             System.out.println(i+" Fizz Buzz "+fizzBuzz);
            }
            else if(i%3==0)
            {
                fizz+=i;
                System.out.println(i+" Fizz poprzednie "+fizz);
            }
            else if(i%5==0)
            {
                buzz+=i;
                System.out.println(i+" Buzz "+buzz);

            }
            else
            {

                int sum = 0;
                for(int j = 1;j<=i;j++)
                {
                    sum+=j;
                }
                System.out.println(i+" suma poprzednich "+sum);
               // System.out.print();
            }

        }

    }
}
