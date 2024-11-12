package exercise;

import java.util.*;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage dBase) {
        Map<String, String> dBaseSwap = new HashMap<>();

        for (Map.Entry<String,String> entry : dBase.toMap().entrySet()) {
            dBaseSwap.put(entry.getValue(), entry.getKey());
        }

        List<String> keyList = new ArrayList<>(dBase.toMap().keySet());

        for (var key : keyList) {
            dBase.unset(key);
        }

        for (Map.Entry<String,String> entry : dBaseSwap.entrySet()) {
            dBase.set(entry.getKey(), entry.getValue());
        }
    }
}
// END
