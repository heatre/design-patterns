package decorator;

/**
 * Created by Swin on 2016/5/18.
 */
public class Decaf extends Beverage {

    public Decaf(){
        setDescription("decorator.Decaf");
    }

    @Override
    public double cost(){
        return 4.0;
    }
}
