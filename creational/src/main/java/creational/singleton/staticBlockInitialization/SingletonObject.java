package creational.singleton.staticBlockInitialization;

public final class SingletonObject {
    private static SingletonObject singletonObject;

    private SingletonObject() {

    }

    static {
        try {
            singletonObject = new SingletonObject();
        } catch (Exception exception) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static SingletonObject getInstance() {
        return singletonObject;
    }

    public static void main(String[] args) {
        SingletonObject singletonObject1 = SingletonObject.getInstance();
        SingletonObject singletonObject2 = SingletonObject.getInstance();
        System.out.println(singletonObject1 == singletonObject2);
    }
}
