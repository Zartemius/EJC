package task_02.Interface_Fly_and_inheritors;
import task_02.Interface_Fly_and_inheritors.Fly;
import java.util.Random;

/**
 * Created by artem on 27.06.17.
 */
public class FlyWIthWings implements Fly {

    private int maxSpeed = 70;
    Random randNumber = new Random();

    public int toFly(){

        int speed = randNumber.nextInt(maxSpeed)<< 10;

        return speed;
    }
}
