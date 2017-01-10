package remote;

/**
 * Created by Swin on 2016/6/15.
 */
public class WinnerState implements State {

    private static final String TAG = "WinnerState";
    private transient GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you have insert quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you have turn crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("you have turn crank once");
    }

    @Override
    public void dispense() {
        System.out.println("you are a winner! you get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else {
            gumballMachine.releaseBall();
            if(gumballMachine.getCount()>0){
                gumballMachine.setState(gumballMachine.getHasQuarterState());
            }else{
                System.out.println("oops,out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
    @Override
    public String toString(){
        return TAG;
    }
}
