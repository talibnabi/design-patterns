package singleton;

public class ExampleFirst {
    private static ExampleFirst singleton;

    private ExampleFirst() {

    }

    public static ExampleFirst getInstance() {
        if (singleton == null) {
            synchronized (ExampleSecond.class) {
                if (singleton == null) {
                    singleton = new ExampleFirst();
                }
            }
        }
        return singleton;
    }

}
