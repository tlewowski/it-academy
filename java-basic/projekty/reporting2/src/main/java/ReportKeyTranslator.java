public class ReportKeyTranslator {
    public static String translate(String Key){
        if (Key.equals(ReportKeys.TOTAL_PRICE))
            return "Cena całkowita";
            return Key;
    }
}
