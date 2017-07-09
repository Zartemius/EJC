import org.omg.CORBA.SetOverrideType;
import java.util.Date;
/**
 * Created by artem on 23.06.17.
 */
public class lesson3 {
    public static void main (String[] args) {
        Date myDate = new Date();
        System.out.println("Before:" + myDate.getDate());
        changeDate(myDate);
        System.out.println("After:" + myDate.getDate());
    }

    public static void changeDate(Date date){
        System.out.println("      -before change: " + date.getDate());
        date.setDate(12);
        System.out.println("      -after change: " + date.getDate());
    }
}
