package template;

/**
 * Created by Swin on 2016/5/20.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    public void brew(){
        System.out.println("template.Coffee is brewed");
    }

    @Override
    public void addCondiments(){
        System.out.println("add coffee condiments");
    }
}
