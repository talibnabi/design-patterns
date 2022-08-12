package creational.builder.bestPractice.enums;

public enum SchoolName {
    QARAYEV("65"),
    XALQLAR("87"),
    SABUNCU("311"),
    ELMLER("45"),
    NIZAMI("54");


    private final String title;

    SchoolName(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "SchoolName{" +
                "title='" + title + '\'' +
                '}';
    }
}
