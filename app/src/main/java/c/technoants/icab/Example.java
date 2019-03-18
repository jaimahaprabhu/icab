package c.technoants.icab;

public class Example {
    private String _id = "example_id";
    private String _rev = null;
    private boolean isExample;

    public Example(boolean isExample) {
        this.isExample = isExample;
    }

    public String toString() {
        return "{ id: " + _id + ",\nrev: " + _rev + ",\nisExample: " + isExample + "\n}";
    }
}

