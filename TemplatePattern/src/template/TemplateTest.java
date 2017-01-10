package template;

/**
 * Created by Swin on 2016/5/20.
 */
public class TemplateTest {
    public static void main(String[] args){
        CaffeineBeverage caffeineBeverage = new Coffee();
        caffeineBeverage.prepareRecipe();

        caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();
    }
}
