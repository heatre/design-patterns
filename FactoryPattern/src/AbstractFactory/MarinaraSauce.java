package AbstractFactory;

/**
 * Created by Swin on 2016/5/19.
 */
public class MarinaraSauce implements Sauce {
    private String name = "marinara sauce";
    @Override
    public String getName(){
        return name;
    }
}
