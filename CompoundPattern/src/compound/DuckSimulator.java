package compound;

/**
 * Created by Swin on 2016/6/16.
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CounterDuckFactory();

        duckSimulator.simulate(duckFactory);
    }

    public DuckSimulator() {

    }

    public void simulate(AbstractDuckFactory duckFactory) {


        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        Goose goose = new Goose();
        Quackable gooseAdapter = new GooseAdapter(goose);

        FlockDucks flockDucks = new FlockDucks();
        flockDucks.add(mallardDuck);
        flockDucks.add(rubberDuck);
        flockDucks.add(duckCall);
        flockDucks.add(rubberDuck);

        QuackLog quackLog = new QuackLog();
        flockDucks.registerObserver(quackLog);//register the observer

        System.out.println("----------Flock quack-------------");
        simulate(flockDucks);

        System.out.println("\n------Duck simulate--------");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);

        System.out.println("quack times of the duck:" + QuackCounter.getQuackTimes());
    }

    public void simulate(Quackable duck) {
        duck.quack();
    }
}
