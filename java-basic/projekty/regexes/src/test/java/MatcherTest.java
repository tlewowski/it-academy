import org.junit.Assert;
import org.junit.Test;

public class MatcherTest {
    @Test
    public void simpleRegexMatches() {
        String pattern = "[[INFO][WARN]]";
        String match = "Elabama";
        String matcher2 = " laos";
        String match3 = "brala";
        String match4 = "bral[a-e]";
        String nonMatch = "texas";

        //Assert.assertTrue(GrepMatcher.match(pattern, match));
       // Assert.assertTrue(GrepMatcher.match(pattern, matcher2));
        Assert.assertTrue(GrepMatcher.match(pattern, match3));

        Assert.assertFalse(GrepMatcher.match(pattern, nonMatch));
    }
    @Test
    public void complexRegexMatcher()
    {
        //String pattern = "^\\[(INFO)|(WARN)\\]";
        String pattern = "^\\[INFO|WARN\\]";
        String match5 = "[INFO|WARN]";
        String match = "[INFO]";
        String match2 = "[WARN]";
        String match3 = "[ERROR]";
//        String match4 = "[INFO[WARN]";
        Assert.assertTrue(GrepMatcher.match(pattern, match5));
        Assert.assertTrue(GrepMatcher.match(pattern, match));
        Assert.assertTrue(GrepMatcher.match(pattern, match2));
// ???        Assert.assertFalse(GrepMatcher.match(pattern, match4));
        Assert.assertFalse(GrepMatcher.match(pattern, match3));
    }
    @Test
    public void matcher()
    {
        String pattern = "^[0-9]{2}-[0-9]{3}" +
                " [A-Z][a-z]{2,}([ -][A-Z][a-z]{2,})?$";
        String match1 = "50-111 Jelenia-Gora";
        String match2 = "510-111";
        String match3 = "51-111 Wro";

        Assert.assertTrue(GrepMatcher.match(pattern, match1));
        Assert.assertFalse(GrepMatcher.match(pattern, match2));
        Assert.assertTrue(GrepMatcher.match(pattern, match3));
        Assert.assertTrue(GrepMatcher.match(pattern, match1));
        Assert.assertTrue(GrepMatcher.match(pattern, match1));

    }
    @Test
    public void matcher3()
    {
        String pattern = "[0-9]{9}|[a-z]{9}";
        String match1 = "789456123";
        String match2 = "abcdefghi";
        String match3 = "abc123123";

        Assert.assertTrue(GrepMatcher.match(pattern, match1));
        Assert.assertTrue(GrepMatcher.match(pattern, match2));
        Assert.assertFalse(GrepMatcher.match(pattern, match3));


}
}
