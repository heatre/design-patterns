package remote;

import java.rmi.RemoteException;

/**
 * Created by Swin on 2016/6/16.
 */
public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote gumball) {
        this.machine = gumball;
    }

    public void report() {
        try {
            System.out.println("Gumball machine:" + machine.getLocation());
            System.out.println("Gumballs count:" + machine.getCount());
            System.out.println("GumballMachine state:" + machine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
