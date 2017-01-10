package composite;

/**
 * Created by Swin on 2016/5/30.
 */
public class CompositeTest {
    public static void main(String [] args){
        MenuComponent pancakeMenu = new Menu("pancake menu","breakfast");
        MenuComponent dinerMenu = new Menu("diner menu","diner");
        MenuComponent coffeeMenu = new Menu("cafe menu","cafe");
        MenuComponent allMenus = new Menu("all menu","all menu");

        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);

        dinerMenu.add(new MenuItem("diner menu","diner",true,1.0));
        coffeeMenu.add(new MenuItem("cafe menu item","cafe",false,2.0));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }
}
