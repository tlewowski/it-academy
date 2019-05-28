import java.util.Map;

public class ReportPrinter {
    public static void printReport (Map<String, String> reports){
        System.out.println("=== RAPORT ===");
        for (Map.Entry<String, String> p : reports.entrySet())
            System.out.println(String.format("%s: %s", ReportKeyTranslator.translate(p.getKey()), p.getValue()));
        System.out.println("=== KONIEC ===");
    }
}
