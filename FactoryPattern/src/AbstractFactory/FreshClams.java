package AbstractFactory;

/**
 * Created by Swin on 2016/5/19.
 */
public class FreshClams implements Clams {
    private String name = "fresh clams";
    @Override
    public String getName(){
        return name;
    }
}
