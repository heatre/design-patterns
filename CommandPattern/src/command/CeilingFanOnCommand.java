package command;

/**
 * Created by Swin on 2016/5/19.
 */
public class CeilingFanOnCommand implements Command {
    private CeilingFan ceilingFan;
    private int preSpeed;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void excute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        ceilingFan.setSpeed(preSpeed);
    }

}
