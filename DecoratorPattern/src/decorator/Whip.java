package decorator;

/**
 * Created by Swin on 2016/5/18.
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage b){
        beverage = b;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription()+":decorator.Whip";
    }

    @Override
    public double cost(){
        return beverage.cost()+0.4;
    }
}
