package task_03;

public class Battlefield {

    private static final int SIZE_OF_FIELD = 10;
    private final int oneDeckShip = 1;
    private final int twoDeckShip = 2;
    private int battleField[][] = new int[SIZE_OF_FIELD][SIZE_OF_FIELD];
    private int axisY = 0;
    private int axisX = 0;

    private int createOneDeckShip() {
        return oneDeckShip;
    }

    private int createTwoDeckShip() {
        return twoDeckShip;
    }

    /**
     * This method is used for creation a one-deck ship and safe cells around it
     */
    public void createOneDeckShipkAndFieldAroundit(int axisX, int axisY) {

        battleField[axisX][axisY + 1] = 6;
        battleField[axisX][axisY - 1] = 6;
        battleField[axisX - 1][axisY - 1] = 6;
        battleField[axisX - 1][axisY + 1] = 6;
        battleField[axisX + 1][axisY - 1] = 6;
        battleField[axisX + 1][axisY + 1] = 6;
        battleField[axisX][axisY] = createOneDeckShip();
    }

    /**
     * In this method being checked whether cells around a one-deck ship that is going to be created are empty
     */
    public boolean checkSurroundingCells(int axisX, int axisY) {

        boolean resultOfChecking = true;

        if (battleField[axisX][axisY + 1] != 0 || battleField[axisX][axisY - 1] != 0) {
            resultOfChecking = false;
        } else if (battleField[axisX - 1][axisY - 1] != 0 || battleField[axisX - 1][axisY + 1] != 0) {
            resultOfChecking = false;
        } else if (battleField[axisX + 1][axisY - 1] != 0 || battleField[axisX + 1][axisY + 1] != 0) {
            resultOfChecking = false;
        }
        return resultOfChecking;
    }

    /**
     * This method is used for creation a horizontal two-deck ship and safe cells around it
     */
    public void createHorizontalTwoDeckShipAndFieldAroundIt(int axisX, int axisY) {

        battleField[axisX][axisY - 2] = 6;
        battleField[axisX][axisY + 1] = 6;
        battleField[axisX - 1][axisY - 2] = 6;
        battleField[axisX - 1][axisY - 1] = 6;
        battleField[axisX - 1][axisY] = 6;
        battleField[axisX - 1][axisY + 1] = 6;
        battleField[axisX + 1][axisY - 2] = 6;
        battleField[axisX + 1][axisY - 1] = 6;
        battleField[axisX + 1][axisY] = 6;
        battleField[axisX + 1][axisY + 1] = 6;
        battleField[axisX][axisY] = createTwoDeckShip();
        battleField[axisX][axisY + 1] = createTwoDeckShip();
    }

    /**
     * In this method being checked whether cells around a horizontal two-deck ship that is going to be created are empty
     */
    public boolean checkSurroundingCellsForHorizontalTwoDeckShip(int axisX, int axisY) {

        boolean resultOfChecking = true;

        if (battleField[axisX][axisY - 2] != 0 || battleField[axisX][axisY + 1] != 0) {
            resultOfChecking = false;
        } else if (battleField[axisX - 1][axisY - 2] != 0 || battleField[axisX - 1][axisY - 1] != 0) {
            resultOfChecking = false;
        } else if (battleField[axisX - 1][axisY] != 0 || battleField[axisX - 1][axisY + 1] != 0) {
            resultOfChecking = false;
        } else if (battleField[axisX + 1][axisY - 2] != 0 || battleField[axisX + 1][axisY - 1] != 0) {
            resultOfChecking = false;
        } else if (battleField[axisX + 1][axisY] != 0 || battleField[axisX + 1][axisY + 1] != 0) {
            resultOfChecking = false;
        }
        return resultOfChecking;
    }

    /**
     * This method is used for creation a vertical two-deck ship and safe cells around it
     */
    public void createVerticalTwoDeckShipAndCellsAroundIt(int axisX, int axisY) {

        battleField[axisX - 2][axisY] = 6;
        battleField[axisX + 1][axisY] = 6;
        battleField[axisX - 2][axisY - 1] = 6;
        battleField[axisX - 1][axisY - 1] = 6;
        battleField[axisX][axisY - 1] = 6;
        battleField[axisX + 1][axisY - 1] = 6;
        battleField[axisX - 2][axisY + 1] = 6;
        battleField[axisX - 1][axisY + 1] = 6;
        battleField[axisX][axisY + 1] = 6;
        battleField[axisX + 1][axisY + 1] = 6;
        battleField[axisX][axisY] = createTwoDeckShip();
        battleField[axisX + 1][axisY] = createTwoDeckShip();
    }

    /**
     * In this method being checked whether cells around a vertical two-deck ship that is going to be created are empty
     */
    public boolean checkSurroundingCellsForVerticalTwoDeckShip(int axisX, int axisY) {

        boolean resultOfChecking = true;

        if (battleField[axisX - 2][axisY] != 0 || battleField[axisX + 1][axisY] != 0) {
            resultOfChecking = false;
        } else if (battleField[axisX - 2][axisY - 1] != 0 || battleField[axisX - 1][axisY - 1] != 0) {
            resultOfChecking = false;
        } else if (battleField[axisX][axisY - 1] != 0 || battleField[axisX + 1][axisY - 1] != 0) {
            resultOfChecking = false;
        } else if (battleField[axisX - 2][axisY + 1] != 0 || battleField[axisX - 1][axisY + 1] != 0) {
            resultOfChecking = false;
        } else if (battleField[axisX][axisY + 1] != 0 || battleField[axisX + 1][axisY + 1] != 0) {
            resultOfChecking = false;
        }
        return resultOfChecking;
    }

    /**
     * In this method being compared chosen coordinates of probable location of a ship and being returned a real value inside a chosen element of an array
     */
    public int resultOfShooting(int axisX, int axisY) {

        int result = 0;

        if (battleField[axisX][axisY] == 6) {
            result = 6;
        } else if (battleField[axisX][axisY] == 1) {
            result = 1;
            battleField[axisX][axisX] = 7;
        } else if (battleField[axisX][axisY] == 2) {
            result = 2;
            battleField[axisX][axisX] = 7;
        } else if (battleField[axisX][axisY] == 7) {
            result = 7;
        }
        return result;
    }
}
