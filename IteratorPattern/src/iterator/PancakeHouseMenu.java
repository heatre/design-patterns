package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Swin on 2016/5/30.
 */
public class PancakeHouseMenu implements Menu{
    private ArrayList menuItems;
    public PancakeHouseMenu(){
        menuItems = new ArrayList();
        addItem("pancake breakfask 1","breakfast 1",false,1.0);
        addItem("pancake breakfask 2","breakfast 2",false,2.0);
        addItem("pancake breakfask 3","breakfast 3",false,3.0);
        addItem("pancake breakfask 4","breakfast 4",false,4.0);
    }

    private void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems(){
        return menuItems;
    }

    @Override
    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
