package state;

/**
 * Created by Swin on 2016/6/15.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
