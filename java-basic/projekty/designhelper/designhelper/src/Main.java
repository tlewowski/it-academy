import jdk.nashorn.internal.ir.IfNode;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("Out.txt");
        System.setOut(ps);
        Scanner sc = new Scanner(new File("In.txt")); // System.in
        String typLokalu = sc.next();
        Standard st = Standard.valueOf(sc.next());
        ArrayList<Pomieszczenie>Pomieszczenia = new ArrayList<>();
        while (sc.hasNext()){
            String nazwa = sc.next();
            Double rozmiar = sc.nextDouble();
            Pomieszczenia.add(new Pomieszczenie(nazwa, rozmiar));
        }
        Lokal l = null;
        if (typLokalu.equals("Willa")) l=new Lokal(Pomieszczenia);
        else if (typLokalu.equals("Mieszkanie")) l=new Mieszkanie (Pomieszczenia);
        else if (typLokalu.equals("Biuro")) l=new Biuro (Pomieszczenia);
        System.out.println("Czy lokal z pliku jest poprawny? ");
        System.out.println(l.isValid());
        System.out.print("Cena lokalu z pliku wynosi: ");
        System.out.println(l.cena(Standard.BASIC));
        ArrayList<Pomieszczenie> listaPokoi=new ArrayList<>();
        listaPokoi.add(new Pomieszczenie("Kuchnia",20));
        listaPokoi.add(new Pomieszczenie("Lazienka",25));
        listaPokoi.add(new Pomieszczenie("Sypialnia",5));
        Lokal lokal = new Lokal(listaPokoi);
        System.out.println("Czy lokal jest poprawny? ");
        System.out.println(lokal.isValid());
        System.out.print("Cena lokalu wynosi: ");
        System.out.println(lokal.cena(Standard.BASIC));
        ArrayList<Pomieszczenie> listaPokoi2=new ArrayList<>();
        listaPokoi2.add(new Pomieszczenie("Gabinet",20));
        listaPokoi2.add(new Pomieszczenie("Gabinet",25));
        listaPokoi2.add(new Pomieszczenie("Poczekalnia",5));
        Lokal biuro = new Biuro(listaPokoi2);
        System.out.println("Czy biuro jest poprawny? ");
        System.out.println(biuro.isValid());
        System.out.print("Cena lokalu wynosi: ");
        System.out.println(biuro.cena(Standard.BASIC));

        Mieszkanie mieszkanie = new Mieszkanie(listaPokoi);
        System.out.println("Czy mieszkanie jest poprawne? ");
        System.out.println(mieszkanie.isValid());
        System.out.print("Cena mieszkania wynosi: ");
        System.out.println(mieszkanie.cena(Standard.BASIC));
    }
}
