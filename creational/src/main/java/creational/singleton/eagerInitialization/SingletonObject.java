package creational.singleton.eagerInitialization;

public final class SingletonObject {
    private static final SingletonObject singletonObject = new SingletonObject();

    private SingletonObject() {

    }

    public static SingletonObject getInstance() {
        return singletonObject;
    }

    public static void main(String[] args) {
        SingletonObject singletonObject1 = SingletonObject.getInstance();
        SingletonObject singletonObject2 = SingletonObject.getInstance();
        System.out.println(singletonObject1.hashCode() == singletonObject2.hashCode());
    }
}
