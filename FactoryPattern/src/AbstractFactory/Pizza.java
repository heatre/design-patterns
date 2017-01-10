package AbstractFactory;


/**
 * Created by Swin on 2016/5/19.
 */
public abstract class Pizza {
    protected String name;
    protected Dough dough;//生面团
    protected Sauce sauce;//酱料
    protected Cheese cheese;
    protected Clams clams ;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake");
    }

    public void cut(){
        System.out.println("Cut");
    }

    public void box(){
        System.out.println("Box");
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return dough.getName()+":"+sauce.getName()+":";
    }
}
