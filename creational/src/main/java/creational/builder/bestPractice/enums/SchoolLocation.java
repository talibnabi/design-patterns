package creational.builder.bestPractice.enums;

public enum SchoolLocation {
    BAKU("baku"),
    SAMAXI("samaxi"),
    BORCALI("borcali"),
    QUBA("quba"),
    QAZAX("qazax");
    private final String title;

    SchoolLocation(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "SchoolLocation{" +
                "title='" + title + '\'' +
                '}';
    }
}
