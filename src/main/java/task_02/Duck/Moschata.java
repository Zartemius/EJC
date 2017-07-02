package task_02.Duck;
import task_02.Interface_Fly_and_inheritors.FlyNoWay;

/**
 * Created by artem on 02.07.17.
 */
public class Moschata extends Duck {

    public Moschata(){

        fly = new FlyNoWay();
    }
}
