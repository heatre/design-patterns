package composite;

/**
 * Created by Swin on 2016/5/30.
 */
public class Waitress  {
    MenuComponent allMenus;
    public Waitress(MenuComponent menuComponent){
        allMenus = menuComponent;
    }

    public void printMenu(){
        allMenus.print();
    }
}
