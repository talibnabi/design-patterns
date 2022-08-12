package creational.singleton.serializationAndSingleton;

import java.io.Serializable;

public final class SingletonObject implements Serializable {
    private static final long serialVersionUID = -7604766932017737115L;

    private SingletonObject() {

    }

    private static class SingletonHelper {
        private static final SingletonObject INSTANCE = new SingletonObject();
    }

    public static SingletonObject getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        SingletonObject singletonObject1 = SingletonObject.getInstance();
        System.out.println(singletonObject1.hashCode() == singletonObject.hashCode());
    }
}
