package singleton;

public class ExampleSecond {
    private static ExampleSecond singleton = new ExampleSecond();

    private ExampleSecond() {

    }

    public static ExampleSecond getInstance() {
        return singleton;
    }

}
