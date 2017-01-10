package command;

/**
 * Created by Swin on 2016/5/19.
 */
public class CeilingFanOffCommand implements Command{
    private CeilingFan ceilingFan;
    private int preSpeed;
    public CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void excute(){
        ceilingFan.off();
        preSpeed = ceilingFan.getSpeed();
    }

    @Override
    public void undo(){
        ceilingFan.setSpeed(preSpeed);
    }
}
