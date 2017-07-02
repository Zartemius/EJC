package task_02.Duck;
import task_02.Interface_Fly_and_inheritors.Fly;
import java.util.Random;

/**
 * Created by artem on 27.06.17.
 */
public abstract class Duck {

    Fly fly;

    private String m_colour;
    private String m_name;

    public Duck(){

    }

    public void setColourOfDuck(){

        Random randColour = new Random();
        int result = randColour.nextInt(5);

        if(result == 1){

            m_colour = "white";
        }
        else if(result == 2){

            m_colour = "green";
        }
        else if(result == 3){

            m_colour = "yellow";
        }
        else if(result == 4){

            m_colour = "red";
        }
        else if(result == 5){

            m_colour = "blue";
        }
    }

    public void setNameOfDuck(){

        Random randNumber = new Random();
        int result = randNumber.nextInt(5);

        if(result == 1){

            m_name = "Dazy";
        }
        else if(result == 2){

            m_name = "Donald";
        }
        else if(result == 3){

            m_name = "Richard";
        }
        else if(result == 4){

            m_name = "Clar";
        }
        else if(result == 5){

            m_name = "Dexter";
        }
    }

    public String getColour(){

        setColourOfDuck();
        return m_colour;
    }

    public String getName(){

        setNameOfDuck();
        return m_name;
    }

    public int perfomFly(){
        int result = fly.toFly();
        return result;
    }
}

