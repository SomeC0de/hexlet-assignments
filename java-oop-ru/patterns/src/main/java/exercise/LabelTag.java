package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String tagParent;
    TagInterface tagChild;

    public LabelTag(String tagParent, TagInterface tagChild) {
        this.tagParent = tagParent;
        this.tagChild = tagChild;
    }

    @Override
    public String render() {
        StringBuilder sb = new StringBuilder();
        sb.append("<label>").append(tagParent).append(tagChild.render()).append("</label>");
        return sb.toString();
    }
}
// END
