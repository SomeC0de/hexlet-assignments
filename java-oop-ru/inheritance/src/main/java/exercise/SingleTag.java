package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }

    @Override
    final public String toString() {
        StringJoiner sj = new StringJoiner(" ", "<", ">");
        sj.add(super.getName());

        Map<String, String> attributes = new LinkedHashMap<>(super.getAttributes());
        attributes.forEach((key, value) -> sj.add(String.format("%s=\"%s\"", key, value)));

        return sj.toString();
    }
}
// END
