package creational.builder.bestPractice.enums;

public enum SchoolName {
    QARAYEV("65"),
    BOZCULAR("87"),
    DERELEYEZ("311"),
    PIRQULU("45"),
    SALAHLI("54");


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
