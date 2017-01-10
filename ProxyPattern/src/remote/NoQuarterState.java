package remote;

/**
 * Created by Swin on 2016/6/15.
 */
public class NoQuarterState implements State {
    private static final String TAG = "NoQuarterState";
    private transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you insert quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you have not insert quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("there is no quarter ,please insert quarter first");
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispense");
    }

    @Override
    public String toString(){
        return TAG;
    }
}
