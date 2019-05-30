import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Main {
    public static void main(String[] arg) throws IOException {

        System.out.println("=== RAPORT===");
        SourceReader src=new SourceReader();
        Path p= Paths.get( arg[0]);


        Map<String, String> map2 = new Reporter().makeReport(src.fromCSV(p));
        System.out.println("Liczba transakcji: "+map2.get("liczba transakcji"));
        System.out.println("=== KONIEC===");
    }
}
