package command;

/**
 * Created by Swin on 2016/5/19.
 */
public class NoCommand implements Command {
    @Override
    public void excute() {
        System.out.println("no command");
    }

    @Override
    public void undo() {
        System.out.println("no command");
    }
}
