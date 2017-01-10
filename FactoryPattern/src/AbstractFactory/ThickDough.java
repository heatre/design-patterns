package AbstractFactory;

/**
 * Created by Swin on 2016/5/19.
 */
public class ThickDough implements Dough {
    private String name = "thick dough";

    @Override
    public String getName(){
      return name;
    }
}
