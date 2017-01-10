package AbstractFactory;

/**
 * Created by Swin on 2016/5/19.
 */
public class MozzarellaCheese implements Cheese {
    private String name = "mozzarella cheese";
    @Override
    public String getName(){
        return name;
    }
}
