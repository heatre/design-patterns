package state;

import java.util.Random;

/**
 * Created by Swin on 2016/6/15.
 */
public class HasQuarterState implements State {
    private static final String TAG = "HasQuarterState";
    private GumballMachine gumballMachine;
    private Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you had insert quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println(" eject the quarter you insert");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned");
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else
            gumballMachine.setState(gumballMachine.getSoldState());
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
