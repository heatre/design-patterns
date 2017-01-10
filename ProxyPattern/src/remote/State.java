package remote;

import java.io.Serializable;

/**
 * Created by Swin on 2016/6/15.
 */
public interface State extends Serializable{
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
