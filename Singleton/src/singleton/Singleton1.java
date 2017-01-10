package singleton;

/**
 * Created by Swin on 2016/5/19.
 */
public class Singleton1 {
    private static Singleton1 singleton = new Singleton1();

    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        return singleton;
    }
}
