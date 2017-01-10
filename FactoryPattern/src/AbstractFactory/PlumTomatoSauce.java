package AbstractFactory;

/**
 * Created by Swin on 2016/5/19.
 */
public class PlumTomatoSauce implements Sauce {

    private String name = "plum tomato sauce";

    @Override
    public String getName(){
        return name;
    }
}
