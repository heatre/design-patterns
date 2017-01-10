package decorator;

/**
 * Created by Swin on 2016/5/18.
 */
public abstract class Beverage {
    private static final String TAG = "decorator.Beverage";
    private String description = "Unknow beverage";

    public String getDescription(){
        return description;
    }

    public void setDescription(String d){
        description = d;
    }

    public abstract double cost();

}
