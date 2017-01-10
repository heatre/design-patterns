package decorator;

/**
 * Created by Swin on 2016/5/18.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        setDescription("House blend");
    }

    @Override
    public double cost(){
        return 1.0;
    }
}
