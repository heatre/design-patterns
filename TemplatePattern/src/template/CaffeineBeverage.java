package template;

/**
 * Created by Swin on 2016/5/20.
 */
public abstract class CaffeineBeverage {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (needCondiments())
            addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("boiling water");
    }

    public void pourInCup() {
        System.out.println("pour in cup");
    }

    public boolean needCondiments() {
        return true;
    }
}
