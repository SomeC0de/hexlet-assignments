package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> objectsList, int objectsToDisplay) {
        List<String> sortedObjects = new ArrayList<String>();
        sortedObjects = objectsList.stream().sorted((o1, o2)->o1.compareTo(o2);
        return sortedObjects;
    }
}
// END
