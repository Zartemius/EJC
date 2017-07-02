package task_02.Duck;
import task_02.Interface_Fly_and_inheritors.*;

/**
 * Created by artem on 02.07.17.
 */
public class Indi extends Duck {

    public Indi(){

        fly = new FlyNoWay();
    }
}
