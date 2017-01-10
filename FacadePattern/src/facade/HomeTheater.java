package facade;

/**
 * Created by Swin on 2016/5/20.
 */
public class HomeTheater {
    private TV tv;
    private DVD dvd;
    private Tuner tuner;
    public HomeTheater(TV tv,DVD dvd,Tuner tuner){
        this.tv = tv;
        this.dvd = dvd;
        this.tuner = tuner;
    }

    public void watchMovie(){
        tv.on();
        dvd.on();
        tuner.on();
    }

    public void stop(){
        tv.off();
        dvd.off();
        tuner.off();
    }
}
