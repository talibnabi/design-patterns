package creational.singleton.threadSafeSingleton;

public final class SingletonObject {
    private static SingletonObject singletonObject;

    private SingletonObject() {

    }

    public static synchronized SingletonObject getInstance() {
        if (singletonObject == null) {
            singletonObject = new SingletonObject();
        }
        return singletonObject;
    }

    public static void main(String[] args) {
        SingletonObject singletonObject1 = SingletonObject.getInstance();
        SingletonObject singletonObject2 = SingletonObject.getInstance();
        System.out.println(singletonObject1.hashCode() == singletonObject2.hashCode());
    }
}
