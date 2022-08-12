package creational.singleton.usingReflectionToDestroySingleton;

import creational.singleton.eagerInitialization.*;

import java.lang.reflect.Constructor;

public class ReflectionUsing {
    /*Reflection can be used to destroy all the singleton implementation approaches.*/
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        SingletonObject singletonObject1 = null;
        try {
            Constructor[] constructors = SingletonObject.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                singletonObject = (SingletonObject) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        assert singletonObject1 != null;
        System.out.println(singletonObject.hashCode());
    }
    /*When you run the above test class, you will notice that hashCode of both the instances is not same that destroys the singleton pattern.
     Reflection is very powerful and used in a lot of frameworks like Spring and Hibernate*/
}
