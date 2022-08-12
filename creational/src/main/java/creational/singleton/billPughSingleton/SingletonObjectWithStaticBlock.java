package creational.singleton.billPughSingleton;

public final class SingletonObjectWithStaticBlock {
    public static final class SingletonHelperStatic {
        private static final SingletonObjectWithStaticBlock singletonObjectWithStaticBlock;

        private SingletonHelperStatic() {

        }

        static {
            try {
                singletonObjectWithStaticBlock = new SingletonObjectWithStaticBlock();
            } catch (Exception exception) {
                throw new RuntimeException("Exception occurred in creating singleton instance");
            }
        }

        private static SingletonObjectWithStaticBlock getInstance() {
            return singletonObjectWithStaticBlock;
        }
    }

    public static SingletonObjectWithStaticBlock getInstance() {
        return SingletonHelperStatic.getInstance();
    }

    public static void main(String[] args) {
        SingletonObjectWithStaticBlock singletonObjectWithStaticBlock = SingletonObjectWithStaticBlock.getInstance();
        SingletonObjectWithStaticBlock singletonObjectWithStaticBlock1 = SingletonObjectWithStaticBlock.getInstance();
        System.out.println(singletonObjectWithStaticBlock1.hashCode() == singletonObjectWithStaticBlock.hashCode());
    }
}
