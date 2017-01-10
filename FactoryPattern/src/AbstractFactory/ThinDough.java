package AbstractFactory;

/**
 * Created by Swin on 2016/5/19.
 */
public class ThinDough implements Dough{
    private String name = "thin dough";
    @Override
    public String getName(){
        return name;
    }
}
