package task_02.Game;
import task_02.Duck.*;
import java.io.*;


/**
 * Created by artem on 02.07.17.
 */
public class GameProcess {

    Gamer gamer = new Gamer();

    Bernicla bernicla = new Bernicla();
    Indi indi = new Indi();
    Mollissima mollissima = new Mollissima();
    Moschata moschata = new Moschata();
    Tachyeres tachyeres = new Tachyeres();

    int firstBirdResult = 0;
    int secondBirdResult = 0;
    int thirdBirdResult = 0;
    int fourthBirdResult = 0;
    int fifthBirdResult = 0;

    public int Menu() throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println();
        System.out.println("Welcome to the DuckCasino.");
        System.out.println("Choose a duck:");
        System.out.println("1." + " " + bernicla.getName() + " " + bernicla.getColour());
        firstBirdResult = bernicla.perfomFly();

        System.out.println("2." + " " + indi.getName() + " " + indi.getColour());
        secondBirdResult = indi.perfomFly();

        System.out.println("3." + " " + mollissima.getName() + " " + mollissima.getColour());
        thirdBirdResult = mollissima.perfomFly();

        System.out.println("4." + " " + moschata.getName() + " " + moschata.getColour());
        fourthBirdResult = moschata.perfomFly();

        System.out.println("5." + " " + tachyeres.getName() + " " + tachyeres.getColour());
        fifthBirdResult = tachyeres.perfomFly();

        System.out.println("6.Exit");
        System.out.println("7.Show quantity of money in treasure");

        System.out.println("Your choice:");

        int choice = Integer.parseInt(reader.readLine());

        return choice;
    }

    public boolean competionBetweenDucks(int choice, int one, int two, int three, int four) {

        boolean winner = true;
        int array[] = {one, two, three, four};

        for (int a = 0; a < 4; a++){

            if (choice < array[a]){

                winner = false;
            }
        }

        return winner;
    }

    public void game() throws Exception {

        boolean workingloop = true;

        while (workingloop) {

            int userChoice = Menu();

            if (!gamer.isMoneyInTreasury()) {

                System.out.println("Treasure is empty. Game over!!!");
                workingloop = false;
                break;
            }

            switch (userChoice) {

                case 1:
                    boolean result = competionBetweenDucks(firstBirdResult, secondBirdResult, thirdBirdResult, fourthBirdResult, fifthBirdResult);
                    gamer.setEntry(100);

                    if (result) {
                        System.out.println("You are a winner.Your duck had the best speed.You receive the prize");
                        gamer.winnerReceivedPrize();
                    } else {
                        System.out.println("You lost");
                        gamer.loserLostMoney();
                    }
                    break;

                case 2:
                    boolean result2 = competionBetweenDucks(secondBirdResult, firstBirdResult, thirdBirdResult, fourthBirdResult, fifthBirdResult);
                    gamer.setEntry(100);

                    if (result2) {
                        System.out.println("You are a winner.Your duck had the best speed.You receive the prize");
                        gamer.winnerReceivedPrize();
                    } else {
                        System.out.println("You lost");
                        gamer.loserLostMoney();
                    }
                    break;

                case 3:
                    boolean result3 = competionBetweenDucks(thirdBirdResult, firstBirdResult, secondBirdResult, fourthBirdResult, fifthBirdResult);
                    gamer.setEntry(100);

                    if (result3) {
                        System.out.println("You are a winner.Your duck had the best speed.You receive the prize");
                        gamer.winnerReceivedPrize();
                    } else {
                        System.out.println("You lost");
                        gamer.loserLostMoney();
                    }
                    break;

                case 4:
                    boolean result4 = competionBetweenDucks(fourthBirdResult, firstBirdResult, secondBirdResult, thirdBirdResult, fifthBirdResult);
                    gamer.setEntry(100);

                    if (result4) {
                        System.out.println("You are a winner.Your duck had the best speed.You receive the prize");
                        gamer.winnerReceivedPrize();
                    } else {
                        System.out.println("You lost");
                        gamer.loserLostMoney();
                    }
                    break;

                case 5:
                    boolean result5 = competionBetweenDucks(fifthBirdResult, firstBirdResult, secondBirdResult, thirdBirdResult, fourthBirdResult);
                    gamer.setEntry(100);

                    if (result5) {
                        System.out.println("You are a winner.Your duck had the best speed.You receive the prize");
                        gamer.winnerReceivedPrize();
                    } else {
                        System.out.println("You lost");
                        gamer.loserLostMoney();
                    }
                    break;

                case 6:
                    System.out.println("Bye,bye");
                    workingloop = false;
                    break;
                case 7:
                    gamer.showCurrentStatusOfTreasury();
                    break;
                default:
                    System.out.println("You have chosen wrong number.Try again.");
                    break;
            }
        }
    }

}