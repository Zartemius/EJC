package task_03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by artem on 26.06.17.
 */

    public class Main{

    public static void main(String[] args) throws Exception{

        GameProcess gamer = new GameProcess();
        Battlefield check = new Battlefield();

        int usersleftIndex = 0;
        int userrightIndex = 0;
        boolean userAnswer = true;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        gamer.createOneDeckShip();
        gamer.createTwoDeckShip();
        gamer.createThreeDeckShip();
        gamer.createFourDeckShip();
        System.out.println("Welcome to Sea Battle");

        while(userAnswer) {
            System.out.println("Enter 1 for exit and 0 to continue the game  ");
            int answer = Integer.parseInt(reader.readLine());
            if(answer == 1){
                userAnswer = false;
                break;
            }

            System.out.println("Enter coordinates of aim:");
            usersleftIndex = Integer.parseInt(reader.readLine());
            userrightIndex = Integer.parseInt(reader.readLine());

            System.out.println("You have entered coordinates:" + " " + usersleftIndex + " " + userrightIndex);

            gamer.checkUserResult(userrightIndex, usersleftIndex);

        }

    }

}