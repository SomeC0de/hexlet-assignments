package exercise;

// BEGIN
public class InputTag implements TagInterface {
    private final String type;
    private final String value;

    public InputTag(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String render() {
        StringBuilder sb = new StringBuilder();
        sb.append("<input type=\"").append(type).append("\" value=\"").append(value).append("\">");
        return  sb.toString();
    }
}
// END
