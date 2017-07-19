package task_03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class GameProcess {

    Battlefield createAndCheckFieldAndShips = new Battlefield();

    /**
     * Methods generateRandAxisX and generateRandomAxisY were created for generating random numbers that will be used for placing ships in array
     */
    private int generateRandAxisX() {

        Random randNumber = new Random();
        int randomAxisX = randNumber.nextInt(8) + 1;
        return randomAxisX;
    }

    private int generateRandomAxisY() {

        Random randNumber = new Random();
        int randomAxisY = randNumber.nextInt(8) + 1;
        return randomAxisY;
    }

    /**
     * In the following four methods, ships being created in array after checking
     */
    private void placeOneDeckShipOnField() {

        int axisX = generateRandAxisX();
        int axisY = generateRandomAxisY();
        boolean checkSurroundingCells = createAndCheckFieldAndShips.checkSurroundingCells(axisX, axisY);

        if (checkSurroundingCells) {
            createAndCheckFieldAndShips.createOneDeckShipkAndFieldAroundit(axisX, axisY);
        } else {
            while (!checkSurroundingCells) {
                int newAxisX = generateRandAxisX();
                int newAxisY = generateRandomAxisY();
                checkSurroundingCells = createAndCheckFieldAndShips.checkSurroundingCells(newAxisX, newAxisY);
                if (checkSurroundingCells) {
                    createAndCheckFieldAndShips.createOneDeckShipkAndFieldAroundit(axisX, axisY);
                }
            }
        }
    }

    private void placeVerticalTwoDeckShipOnField() {

        int axisX = generateRandAxisX();
        int axisY = generateRandomAxisY();
        boolean checkSurroundingCells = createAndCheckFieldAndShips.checkSurroundingCellsForVerticalTwoDeckShip(axisX, axisY);

        if (checkSurroundingCells) {
            createAndCheckFieldAndShips.createVerticalTwoDeckShipAndCellsAroundIt(axisX, axisY);
        } else {
            while (!checkSurroundingCells) {
                int newAxisX = generateRandAxisX();
                int newAxisY = generateRandomAxisY();
                checkSurroundingCells = createAndCheckFieldAndShips.checkSurroundingCellsForVerticalTwoDeckShip(newAxisX, newAxisY);
                if (checkSurroundingCells) {
                    createAndCheckFieldAndShips.createVerticalTwoDeckShipAndCellsAroundIt(axisX, axisY);
                }
            }
        }
    }

    private void placeHorizontalTwoDeckShipOnField() {

        int axisX = generateRandAxisX();
        int axisY = generateRandomAxisY();
        boolean checkSurroundingCells = createAndCheckFieldAndShips.checkSurroundingCellsForHorizontalTwoDeckShip(axisX, axisY);

        if (checkSurroundingCells) {
            createAndCheckFieldAndShips.createHorizontalTwoDeckShipAndFieldAroundIt(axisX, axisY);
        } else {
            while (!checkSurroundingCells) {
                int newAxisX = generateRandAxisX();
                int newAxisY = generateRandomAxisY();
                checkSurroundingCells = createAndCheckFieldAndShips.checkSurroundingCellsForHorizontalTwoDeckShip(newAxisX, newAxisY);
                if (checkSurroundingCells) {
                    createAndCheckFieldAndShips.createHorizontalTwoDeckShipAndFieldAroundIt(axisX, axisY);
                }
            }
        }
    }

    public void placeShipsOnField() {

        placeOneDeckShipOnField();
        placeOneDeckShipOnField();
        placeOneDeckShipOnField();
        placeOneDeckShipOnField();
        placeHorizontalTwoDeckShipOnField();
        placeHorizontalTwoDeckShipOnField();
        placeVerticalTwoDeckShipOnField();
        placeVerticalTwoDeckShipOnField();
    }

    /**
     * Method showResultOfShooting used for checking coordinates chosen by player
     */
    public void showResultOfShooting(int axisX, int axisY) {

        int result = createAndCheckFieldAndShips.resultOfShooting(axisX, axisY);

        if (result == 0) {
            System.out.println("You missed");
        } else if (result == 6) {
            System.out.println("You missed");
        } else if (result == 7) {
            System.out.println("You have already shot here");
        } else if (result == 1) {
            System.out.println("You have shot one-deck ship");
        } else if (result == 2) {
            System.out.println("You have shot two-deck ship");
        }
    }

    /**
     * Method launchGame used for entring coordinates, creating ships and show result of shooting
     */
    public void launchGame() throws Exception {

        int answer = 0;
        int usersleftIndex = 0;
        int userrightIndex = 0;
        boolean userAnswer = true;

        placeShipsOnField();

        System.out.println("Welcome to Sea Battle");

        while (userAnswer) {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter 1 for exit and 0 to continue the game:");
            answer = Integer.parseInt(reader.readLine());
            if (answer == 1) {
                userAnswer = false;
                break;
            }

            System.out.println("Enter coordinates of aim:");
            usersleftIndex = Integer.parseInt(reader.readLine());
            userrightIndex = Integer.parseInt(reader.readLine());
            System.out.println("You have entered coordinates:" + " " + usersleftIndex + " " + userrightIndex);
            showResultOfShooting(userrightIndex, usersleftIndex);
        }
    }
}

