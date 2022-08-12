package creational.singleton.billPughSingleton;

public final class SingletonObject {

    private SingletonObject() {

    }

    public static class SingletonHelper {
        private static final SingletonObject INSTANCE = new SingletonObject();
    }

    public static void main(String[] args) {

    }
}
