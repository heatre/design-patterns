package command;

/**
 * Created by Swin on 2016/5/19.
 */
public class Stereo {
    public void on(){
        System.out.println("stereo on");
    }

    public void off(){
        System.out.println("stereo off");
    }

    public void setCD(){
        System.out.println("stereo set CD");
    }

    public void setVolume(int volume){
        System.out.println("setereo set volume "+volume);
    }
}
