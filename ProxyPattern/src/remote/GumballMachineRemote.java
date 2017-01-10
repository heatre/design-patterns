package remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Swin on 2016/6/16.
 */
public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;

}
