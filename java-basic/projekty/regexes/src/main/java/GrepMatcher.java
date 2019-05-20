import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrepMatcher {
    static boolean match(String pattern, String line) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(line);
        MatchResult mr = m.toMatchResult();
        return m.find();
    }
}
