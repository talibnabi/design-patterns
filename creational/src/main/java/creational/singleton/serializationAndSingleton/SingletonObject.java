package creational.singleton.serializationAndSingleton;

import java.io.Serializable;

public final class SingletonObject implements Serializable {
    private static final long serialVersionUID = -7604766932017737115L;

    private SingletonObject() {

    }

    private static class SingletonHelper {
        private static final SingletonObject INSTANCE = new SingletonObject();
    }

    private static SingletonObject getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
