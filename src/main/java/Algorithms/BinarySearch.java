package Algorithms;

import java.util.Random;

public class BinarySearch {

    private static final int ARRAY_SIZE = 100;
    private Random randNumber = new Random();
    private int[] arrayUsedForSortingAndFindingElement = new int[ARRAY_SIZE];

    private void fillArray(int[] array) {

        for (int i = 0; i < ARRAY_SIZE; ++i) {
            array[i] = randNumber.nextInt(ARRAY_SIZE);
        }
    }

    private void showElementsOfArray(int[] array) {

        for (int i = 0; i < ARRAY_SIZE; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private int findElement(int array[]) {

        int randElement = randNumber.nextInt(ARRAY_SIZE);
        int searchKey = array[randElement];
        System.out.println("The element you need is " + searchKey);
        int lowerBound = array[0];
        int upperBound = array[ARRAY_SIZE - 1];
        int devider;
        int counter = 0;

        while (true) {
            devider = (lowerBound + upperBound) / 2;

            if (array[devider] == searchKey) {
                System.out.println("The element " + searchKey + " was found");
                System.out.println("The element was found after " + counter + " attempts");
                return devider;
            } else if (lowerBound > upperBound) {
                System.out.println("The element " + searchKey + " was not found");
                return ARRAY_SIZE;
            } else {
                if (array[devider] < searchKey) {
                    lowerBound = devider + 1;
                } else {
                    upperBound = devider - 1;
                }
            }
            ++counter;
        }
    }

    public void executeBubbleSortandFindElement(int[] array) {

        fillArray(array);
        System.out.print("Before bubble sort: ");
        showElementsOfArray(array);

        for (int a = 0; a < ARRAY_SIZE; ++a) {
            for (int b = ARRAY_SIZE - 1; b > a; --b) {
                if (array[b - 1] > array[b]) {
                    int temp = array[b];
                    array[b] = array[b - 1];
                    array[b - 1] = temp;
                }
            }
        }

        System.out.print("After Bubble sort: ");
        showElementsOfArray(array);
        findElement(array);
    }

    public void executeBinarySearch(){

        executeBubbleSortandFindElement(arrayUsedForSortingAndFindingElement);
    }
}
