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

        FirstTask firstTask = new FirstTask();
        SecondTask secondTask = new SecondTask();

        firstTask.executeFirstTask();
        secondTask.executeSecondTask();
    }
}
