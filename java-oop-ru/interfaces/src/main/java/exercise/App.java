package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> objectsList, int objectsToDisplay) {
        List<Home> sortedHomes = objectsList.stream().sorted(Home::compareTo).toList();
        List<String> stringHomes = new ArrayList<String>(objectsToDisplay);

        for (var idx = 0; idx < objectsToDisplay; idx++) {
           stringHomes.add(sortedHomes.get(idx).toString());
        }

        return stringHomes;
    }
}
// END
