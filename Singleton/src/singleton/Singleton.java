package singleton;

/**
 * Created by Swin on 2016/5/19.
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton(){

    }
    public static synchronized Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
