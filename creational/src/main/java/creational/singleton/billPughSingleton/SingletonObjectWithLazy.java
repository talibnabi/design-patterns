package creational.singleton.billPughSingleton;

public final class SingletonObjectWithLazy {
    private SingletonObjectWithLazy() {

    }

    public static final class SingletonHelperLazy {
        private static SingletonObjectWithLazy INSTANCE;

        private SingletonHelperLazy() {

        }

        private static SingletonObjectWithLazy getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new SingletonObjectWithLazy();
            }
            return INSTANCE;
        }
    }

    public static SingletonObjectWithLazy getInstance() {
        return SingletonHelperLazy.getInstance();
    }

    public static void main(String[] args) {
        SingletonObjectWithLazy singletonObjectWithLazy = SingletonObjectWithLazy.getInstance();
        SingletonObjectWithLazy singletonObjectWithLazy1 = SingletonObjectWithLazy.getInstance();
        System.out.println(singletonObjectWithLazy1.hashCode() == singletonObjectWithLazy.hashCode());
    }
}
