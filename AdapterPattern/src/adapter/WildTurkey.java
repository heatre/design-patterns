package adapter;

/**
 * Created by Swin on 2016/5/20.
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble(){
        System.out.println("gobble");
    }
    @Override
    public void fly(){
        System.out.println("Wild turkey fly");
    }
}
