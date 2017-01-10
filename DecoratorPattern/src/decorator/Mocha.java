package decorator;

/**
 * Created by Swin on 2016/5/18.
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage b){
        beverage = b;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription()+":decorator.Mocha";
    }

    @Override
    public double cost(){
        return beverage.cost()+0.2;
    }
}
