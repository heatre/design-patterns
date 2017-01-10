package composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Swin on 2016/5/30.
 */
public class Menu extends MenuComponent {
    private ArrayList menuComponents  = new ArrayList();
    private String name;
    private String description;

    public Menu(String name,String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getDescription(){
        return description;
    }

    @Override
    public void print(){
        System.out.println(getName());
        System.out.println(" "+getDescription());
        System.out.println("---------------------");
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
}
