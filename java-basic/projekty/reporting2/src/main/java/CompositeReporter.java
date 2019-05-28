import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompositeReporter implements Reporter {
List<Reporter> Components;
CompositeReporter(List<Reporter> components){
    Components = components;
}


    @Override
    public Map<String, String> makeReport(List<Deal> listDeal) {
    Map <String,String> map1 = new HashMap<>();
    for (Reporter r : Components){
            Map<String, String> part = r.makeReport(listDeal);
            for (Map.Entry<String, String> p : part.entrySet()){
                map1.put(p.getKey(), p.getValue());

            }

        }
        return map1;
    }
}
