package remote;

/**
 * Created by Swin on 2016/6/15.
 */
public class SoldOutState implements State {

    private static final String TAG = "SoldOutState";
    private  transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("gumballs are sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("gumballs are sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("gumballs are sold out");
    }

    @Override
    public void dispense() {
        System.out.println("gumballs are sold out");
    }

    @Override
    public String toString(){
        return TAG;
    }
}
