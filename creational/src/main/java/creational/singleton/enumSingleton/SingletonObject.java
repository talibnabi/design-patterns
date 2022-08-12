package creational.singleton.enumSingleton;

public enum SingletonObject {
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }

    public static void main(String[] args) {
        System.out.println(SingletonObject.INSTANCE.toString());
    }
}
