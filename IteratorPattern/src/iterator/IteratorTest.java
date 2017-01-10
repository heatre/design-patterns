package iterator;

/**
 * Created by Swin on 2016/5/30.
 */
public class IteratorTest {
    public static void main(String [] args){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress  = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}
