package creational.singleton.billPughSingleton;

public class SingletonObjectWithLazy {

    public static class SingletonHelperLazy {
        private static SingletonHelperLazy INSTANCE;

        private SingletonHelperLazy() {

        }

        private static SingletonHelperLazy getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new SingletonHelperLazy();
            }
            return INSTANCE;
        }
    }

    public static SingletonHelperLazy getInstance() {
        return SingletonHelperLazy.getInstance();
    }

    public static void main(String[] args) {
        
    }
}
