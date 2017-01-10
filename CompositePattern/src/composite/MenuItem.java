package composite;

/**
 * Created by Swin on 2016/5/30.
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name,String description,boolean vegetarian,double price){
        this.description = description;
        this.name = name;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print(){
        System.out.println(" "+getName());
        if(isVegetarian()){
            System.out.println("v");
        }
        System.out.println(" "+getPrice());
        System.out.println(" "+getDescription());
    }

    @Override
    public String toString(){
        return "name:"+name+"\n"+"description:"+description+"\n"+
                "vegetarian"+vegetarian+"\n"+"price:"+price+"\n";
    }

}
