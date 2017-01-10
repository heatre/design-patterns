package command;

/**
 * Created by Swin on 2016/5/19.
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light l) {
        light = l;
    }

    @Override
    public void excute(){
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
