package command;

/**
 * Created by Swin on 2016/5/19.
 */
public class ControClient {
    Command[] onCommand;
    Command[] offCommand;

    public ControClient() {
        onCommand = new Command[7];
        offCommand = new Command[7];
        Command noCommand = new NoCommand();

        for(int i = 0;i<7;++i){
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }

    }

    public void setCommand(int slot,Command on,Command off) {
        onCommand[slot] = on;
        offCommand[slot] = off;
    }

    public void onButtonPress(int slot){
        onCommand[slot].excute();
    }

    public void offButtonPress(int slot){
        offCommand[slot].excute();
    }

    @Override
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-----control clint--------\n");
        for(int i = 0;i <onCommand.length;++i){
            stringBuffer.append("slot:"+i+":"+onCommand.getClass().getName()+
            offCommand.getClass().getName()+"\n");
        }
        return stringBuffer.toString();
    }
}
