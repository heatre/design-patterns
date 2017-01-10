package remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by Swin on 2016/6/16.
 */
public class GumballMachineMonitorTest {
    public static final String REMOTE_URL = "rmi://localhost:8888/gumballMachine";
    public static void main(String[] args) {
        try {
            GumballMachineRemote machineRemote = (GumballMachineRemote) Naming.lookup(REMOTE_URL);
            GumballMonitor monitor = new GumballMonitor(machineRemote);
            monitor.report();
        } catch (MalformedURLException e) {
            System.out.println("url exception");
        } catch (RemoteException e) {
            System.out.println("look up remote machine failed");
        } catch (NotBoundException e) {
            e.printStackTrace();
        }

    }
}
