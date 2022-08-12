package creational.singleton.serializationAndSingleton;


import java.io.*;

public class SingletonObjectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonObject singletonObjectFirst = SingletonObject.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(singletonObjectFirst);
        out.close();
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SingletonObject singletonObjectSecond = (SingletonObject) in.readObject();
        in.close();
        System.out.println(singletonObjectFirst.hashCode());
        System.out.println(singletonObjectSecond.hashCode());
    }
}
