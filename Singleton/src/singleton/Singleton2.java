package singleton;

/**
 * Created by Swin on 2016/5/19.
 */
public class Singleton2 {
    private  volatile static Singleton2 singleton;
    private Singleton2(){

    }
    public static Singleton2 getInstance(){
        if(singleton == null){
            synchronized (Singleton2.class){
                singleton = new Singleton2();
            }
        }
        return singleton;
    }
}
