package exercise;

import java.util.*;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String tagBody;
    private List<Tag> children;

    public PairedTag(String name, Map<String, String> attributes, String tagBody, List<Tag> children) {
        super(name, attributes);
        this.tagBody = tagBody;
        this.children = new ArrayList<>(children);
    }

    @Override
    final public String toString() {
        StringJoiner sj = new StringJoiner("", "<" + super.getName(), "</" + super.getName() + ">");

        Map<String, String> attributes = new LinkedHashMap<>(super.getAttributes());
        attributes.forEach((key, value) -> sj.add(String.format(" %s=\"%s\"", key, value)));
        sj.add(">" + this.tagBody);
        children.forEach(m->sj.add(String.format("%s", m.toString())));

        return sj.toString();
    }
}
// END
