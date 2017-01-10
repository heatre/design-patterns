package decorator;

/**
 * Created by Swin on 2016/5/18.
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage b){
        beverage = b;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription()+":decorator.Soy";
    }

    @Override
    public double cost(){
        return beverage.cost()+0.3;
    }
}
