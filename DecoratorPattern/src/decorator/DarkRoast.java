package decorator;

/**
 * Created by Swin on 2016/5/18.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        setDescription("Dark roast");
    }

    @Override
    public double cost(){
        return 3.0;
    }
}
