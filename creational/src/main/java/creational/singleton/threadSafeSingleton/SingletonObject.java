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

    public static SingletonObject getInstanceUsingDoubleLocking() {
        if (singletonObject == null) {
            synchronized (SingletonObject.class) {
                singletonObject = new SingletonObject();
            }
        }
        return singletonObject;
    }

    public static void main(String[] args) {
        SingletonObject singletonObject1 = SingletonObject.getInstance();
        SingletonObject singletonObject2 = SingletonObject.getInstance();
        System.out.println(singletonObject1.hashCode() == singletonObject2.hashCode());
        System.out.println("*------------------------------------------------------------------------------------*");
        SingletonObject singletonObject3 = SingletonObject.getInstanceUsingDoubleLocking();
        SingletonObject singletonObject4 = SingletonObject.getInstanceUsingDoubleLocking();
        System.out.println(singletonObject3.hashCode() == singletonObject4.hashCode());
    }
}
