package AbstractFactory;

/**
 * Created by Swin on 2016/5/19.
 */
public class FrozenClams implements Clams {
    private String name = "frozen clams";
    @Override
    public String getName(){
        return name;
    }
}
