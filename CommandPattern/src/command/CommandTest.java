package command;

/**
 * Created by Swin on 2016/5/19.
 */
public class CommandTest {
    public static void main(String [] args) {
        ControClient controClient = new ControClient();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        controClient.setCommand(0, lightOnCommand, lightOffCommand);
        controClient.onButtonPress(0);
        controClient.offButtonPress(0);
        System.out.println(controClient);

        CeilingFan ceilingFan = new CeilingFan("living room");
        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        controClient.setCommand(1,ceilingFanOnCommand,ceilingFanOffCommand);
        controClient.onButtonPress(1);
        controClient.offButtonPress(1);
        System.out.println(controClient);

    }
}
