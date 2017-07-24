package task_05;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by artem on 30.06.17.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Bubble_Sort launchSorting = new Bubble_Sort();

        launchSorting.fillArray();
        launchSorting.showElementsOfArray();
        launchSorting.Sorting();
        launchSorting.showElementsOfArray();
    }

}
