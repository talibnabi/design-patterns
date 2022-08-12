package creational.singleton.staticBlockInitialization;

public final class SingletonObject {
    private static SingletonObject singletonObject;

    private SingletonObject() {

    }

    static {
        try {
            singletonObject = new SingletonObject();
        } catch (Exception exception) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static SingletonObject getInstance() {
        return singletonObject;
    }

    public static void main(String[] args) {
        
    }
}
