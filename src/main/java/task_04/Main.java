package task_04;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

/**
 * Created by artem on 29.06.17.
 */
public class Main {

    public static void main(String[] args) throws Exception{


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String usersInput = reader.readLine();

        char[] array = new char[7];
        char[] newWord = new char [7];

        try {
            usersInput.getChars(0, 10, array, 0);

        }catch (Exception ex){

        }

        for(int i = 0; i < 7; ++i ){

            if(i%2 != 0){

                newWord[i] = array[i];
            }
        }

        String word = new String(array);
        System.out.println(word);

        String argentina = "АРГЕНТИНА МАНИТ НЕГРА";
        String priest = "ПОТ КАК ПОТОП";
        String rose = "А РОЗА УПАЛА НА ЛАПУ АЗОРА";

        argentina = argentina.replace(" ", "");
        priest = priest.replace(" ","");
        rose = rose.replace(" ","");

        StringBuffer argentinaReversed = new StringBuffer(argentina);
        argentinaReversed.reverse();

        StringBuffer priestReversed = new StringBuffer(priest);
        priestReversed.reverse();

        StringBuffer roseReversed = new StringBuffer(rose);
        roseReversed.reverse();

        System.out.println(argentinaReversed);
        System.out.println(priestReversed);
        System.out.println(roseReversed);

    }
}
