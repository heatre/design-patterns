package remote;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by Swin on 2016/6/16.
 */
public class GumballRemoteMachineTest {
    public static final String REMOTE_URL = "rmi://localhost:8888/gumballMachine";
    public static void main(String[] args) {

        GumballMachineRemote gumballMachine = null;
        int count = 10;
        String location = "China";
        String url = "localhost";

        try {
            gumballMachine = new GumballMachine(count, location);

            LocateRegistry.createRegistry(8888);
            Naming.bind(REMOTE_URL, gumballMachine);
            System.out.println("bind remote machine success");
        }catch (RemoteException e){
            System.out.println("create remote server failed");
        }catch (AlreadyBoundException e){
            System.out.println("bind remote server failed");
        }catch (MalformedURLException e){
            System.out.println("url exception");
        }
    }
}
