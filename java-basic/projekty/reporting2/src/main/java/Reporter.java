import java.util.List;
import java.util.Map;

public interface Reporter {
    Map<String, String> makeReport(List<Deal> listDeal);

}
