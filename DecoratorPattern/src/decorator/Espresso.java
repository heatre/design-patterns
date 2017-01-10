package decorator;

/**
 * Created by Swin on 2016/5/18.
 */
public class Espresso extends Beverage {

    public Espresso(){
        setDescription("decorator.Espresso");
    }

    @Override
    public double cost(){
        return 2.0;
    }
}
