package template;

/**
 * Created by Swin on 2016/5/20.
 */
public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("tea is brewed");
    }

    @Override
    public void addCondiments() {
        System.out.println("add tea condiments");
    }
}
