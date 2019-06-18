public class main5 {
    public static void main(String[] args)
    {
        for(int i = 0 ; i<100;i++)
        {
            if(i%7==0)
            {
                generate(i, (char) ('a'+i/7 - 1));
            }

        }
    }

    private static void generate(int i,char s) {
        for(int j = 0;j<i;j++)
        {
            System.out.print(s);
        }
        System.out.println();
    }
}
