/**
 * Created by artem on 21.06.17.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    boolean a, b;
    boolean c = true, d = true;
    boolean e;



    public boolean isTrueA(boolean a, boolean b) {


        return !a && b;
    }

    public boolean isTrueB(boolean b, boolean c) {

        return b || c;
    }

    public boolean isTrueC(boolean a, boolean b, boolean c) {

        return a && b != c;
    }

    public boolean isTrueD(boolean b, boolean c, boolean e) {

        return b || c || e;
    }

    public boolean isTrueE(boolean a, boolean c, boolean e) {

        return a || c && e;
    }

    public String isEven (int count){

        if(count%2 == 0){
            return "Even";
        }
        else{
            return "not Even";
        }
    }








    public static void main(String[] args) {


/*        Barsik barsik = new Barsik();
        Cat cat = new Cat();
        Murzik murzik = new Murzik();
        Snezshok snezshok = new Snezshok();

        Main m = new Main();
        System.out.println(barsik instanceof Cat);

        System.out.println(murzik instanceof Murzik);
        System.out.println(murzik instanceof Barsik);*/

        /*Main task = new Main ();

        System.out.println(task.isTrueA(task.a,task.b));
        System.out.println(task.isTrueB(task.b, task.c));
        System.out.println(task.isTrueC(task.a, task.b,task.c));
        System.out.println(task.isTrueD(task.b, task.c, task.e));
        System.out.println(task.isTrueE(task.a, task.c, task.e));*/

        //System.out.print("Hello world");

        /*BigInteger num1, num2, bigNumI;
        numI1 = BigInteger.valueof(1_000_000_000_000L);

        numI2 = numI1.multiply(numI1);
        System.out.print(numI2);

        numI2 = numI1.multiply(numI1)
                .multiply(numI1);
        System.out.print(numI2);

        numI2 = numI1.multiply(numI1)
                .multiply(numI1)
                .multiply(numI1);
        System.out.print(numI2);

        numI2 = numI1.multiply(numI1)
                .multiply(numI1)
                .multiply(numI1)
                .multiply(numI1);
        System.out.print(numI2); */

        /*try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) {
            Main main = new Main();
    System.out.println(main.isEven(Integer.parseInt(reader.readLine()));
        }

        catch(IOException e){

            e.printStack.Trace();*/


        }


}