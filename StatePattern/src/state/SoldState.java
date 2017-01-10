package state;

/**
 * Created by Swin on 2016/6/15.
 */
public class SoldState implements State {
    private static final String TAG = "SoldState";
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("waiting,we already giving the gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry,you already turn the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turn crank twice ,but this no more gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0)
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        else {
            System.out.println("out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public String toString(){
        return TAG;
    }
}
