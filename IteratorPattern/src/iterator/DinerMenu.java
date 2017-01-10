package iterator;

/**
 * Created by Swin on 2016/5/30.
 */
public class DinerMenu implements Menu  {
    private static final int MAX_ITEMS = 4;
    private int numofItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("diner 1","dener menu 1",true,1.0);
        addItem("diner 2","dener menu 2",true,2.0);
        addItem("diner 3","dener menu 3",true,3.0);
        addItem("diner 4","dener menu 4",true,4.0);
    }

    private void addItem(String name,String description,boolean vegetarian,double price){
        if(numofItems>=MAX_ITEMS) {
            System.out.println("menu is full");
            return;
        }
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems[numofItems] = menuItem;
        numofItems++;
    }

    @Override
    public MyIterator createIterator(){
        MyIterator iterator = new DinerIterator(menuItems);
        return iterator;
    }
}

