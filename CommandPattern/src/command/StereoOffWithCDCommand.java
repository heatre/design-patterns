package command;

/**
 * Created by Swin on 2016/5/19.
 */
public class StereoOffWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOffWithCDCommand(Stereo s) {
        stereo = s;
    }

    @Override
    public void excute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
