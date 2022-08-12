package creational.singleton.billPughSingleton;

public final class SingletonObjectWithEager {


    private SingletonObjectWithEager() {

    }

    public static final class SingletonHelperEager {
        private static final SingletonObjectWithEager INSTANCE = new SingletonObjectWithEager();
    }


    public static SingletonObjectWithEager getInstance() {
        return SingletonHelperEager.INSTANCE;
    }

    public static void main(String[] args) {
        SingletonObjectWithEager singletonObject = SingletonObjectWithEager.getInstance();
        SingletonObjectWithEager singletonObject1 = SingletonObjectWithEager.getInstance();
        System.out.println(singletonObject1.hashCode() == singletonObject.hashCode());
    }
}
