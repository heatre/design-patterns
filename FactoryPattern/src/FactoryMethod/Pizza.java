package FactoryMethod;

import java.util.ArrayList;

/**
 * Created by Swin on 2016/5/18.
 */
public abstract class Pizza {
    protected String name;
    protected String dough;//生面团
    protected String sauce;//酱料
    protected ArrayList<String> topping = new ArrayList<>();

    public void prepare(){
        System.out.println("Prepare");
    }

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
        return name+":"+sauce+":"+dough+":";
    }
}
