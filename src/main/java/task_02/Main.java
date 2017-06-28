package task_02;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;


/**
 * Created by artem on 28.06.17.
 */
public class Main {


    public static void main(String[] args) throws Exception {

        Duck donald = new Duck();
        Duck dazy = new Duck();
        Duck light = new Duck();
        Duck brave = new Duck();
        Duck driver = new Duck();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean workingloop = true;

        while (workingloop) {
            System.out.println();
            System.out.println("Welcome to the Duck casino.");
            System.out.println("Choose a duck:");
            System.out.println("1.Donald");
            System.out.println("2.Dazy");
            System.out.println("3.Light");
            System.out.println("4.Brave");
            System.out.println("5.Driver");
            System.out.println("6.Exit");
            System.out.println("Your choice:");

            int choice = Integer.parseInt(reader.readLine());

            switch (choice) {

                case 1:

                    donald.gameProcess(donald);

                    break;


                case 2:

                    dazy.gameProcess(dazy);

                    break;


                case 3:

                    light.gameProcess(light);

                    break;


                case 4:

                    brave.gameProcess(brave);

                    break;

                case 5:

                    driver.gameProcess(driver);

                    break;

                case 6:

                    workingloop = false;
                    break;
            }


        }

    }

}



