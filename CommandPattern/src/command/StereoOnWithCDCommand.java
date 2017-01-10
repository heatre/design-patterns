package command;

/**
 * Created by Swin on 2016/5/19.
 */
public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo s) {
        stereo = s;
    }

    @Override
    public void excute() {
        stereo.on();
        stereo.on();
        stereo.setCD();
        stereo.setVolume(10);
    }

    @Override
    public void undo(){
        stereo.off();
    }
}
