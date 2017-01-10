package facade;

/**
 * Created by Swin on 2016/5/20.
 */
public class FacadeTest {
    public static void main(String[] args){
        TV tv = new TV();
        DVD dvd = new DVD();
        Tuner tuner = new Tuner();
        HomeTheater homeTheater = new HomeTheater(tv,dvd,tuner);
        homeTheater.watchMovie();
        homeTheater.stop();
    }
}
