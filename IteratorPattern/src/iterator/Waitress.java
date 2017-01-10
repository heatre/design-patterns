package iterator;

import java.util.Iterator;

/**
 * Created by Swin on 2016/5/30.
 */
public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu,DinerMenu dinerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        printMenu(pancakeIterator);
        printMenu(dinerIterator);

    }

    private void printMenu(Iterator iterator){
        if(iterator.hasNext()){
            MenuItem item = (MenuItem)iterator.next();
            System.out.println(item.toString());
        }
    }

}
