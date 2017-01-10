package decorator;

/**
 * Created by Swin on 2016/5/18.
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage b){
        beverage = b;
    }

    @Override
    public String getDescription(){
     return beverage.getDescription()+":decorator.Milk";
    }

    @Override
    public double cost(){
        return beverage.cost()+0.1;
    }
}
