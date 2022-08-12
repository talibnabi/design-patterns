package creational.singleton.lazyInitialization;

public final class SingletonObject {
    private static SingletonObject singletonObject;

    private SingletonObject() {

    }

    public SingletonObject getInstance() {
        if (singletonObject == null) {
            singletonObject = new SingletonObject();
        }
        return singletonObject;
    }

    public static void main(String[] args) {

    }
}
