package command;

/**
 * Created by Swin on 2016/5/19.
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light l) {
        light = l;
    }

    @Override
    public void excute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
