package task_05;

import java.util.Random;

public class Sorting_task17_1 {

    private static final int ARRAY_SIZE = 100;
    Random randNumber = new Random();
    private int[] arrayA = new int[ARRAY_SIZE];
    private int[] arrayB = new int[ARRAY_SIZE];

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

    public void executeBubbleSortandFindElement() {

        fillArray(arrayA);
        System.out.print("Before bubble sort: ");
        showElementsOfArray(arrayA);

        for (int a = 0; a < ARRAY_SIZE; ++a) {
            for (int b = ARRAY_SIZE - 1; b > a; --b) {
                if (arrayA[b - 1] > arrayA[b]) {
                    int temp = arrayA[b];
                    arrayA[b] = arrayA[b - 1];
                    arrayA[b - 1] = temp;
                }
            }
        }

        System.out.print("After Bubble sort: ");
        showElementsOfArray(arrayA);
        findElement(arrayA);
    }

    public void executeInsertionSortandFindELement() {

        int out;
        int in;

        fillArray(arrayB);
        System.out.print("Before Insertion Sort: ");
        showElementsOfArray(arrayB);

        for (out = 1; out < ARRAY_SIZE; ++out) {
            int temp = arrayB[out];
            in = out;
            while (in > 0 && arrayB[in - 1] >= temp) {
                arrayB[in] = arrayB[in - 1];
                --in;
            }
            arrayB[in] = temp;
        }

        System.out.print("After Insertion Sort :");
        showElementsOfArray(arrayB);
        findElement(arrayB);
    }

    public void mergeSort() {

        int sizeOfArray = (ARRAY_SIZE * 2) + 2;
        int[] arrayC = new int[sizeOfArray];
        int arrA = 0;
        int arrB = 0;
        int arrC = 0;

        while (arrA < ARRAY_SIZE && arrB < ARRAY_SIZE) {

            if (arrayA[arrA++] < arrayB[arrB++]) {
                arrayC[arrC++] = arrayA[arrA++];
            } else {
                arrayC[arrC++] = arrayB[arrB++];
            }
        }
        System.out.print("After merge:");
        for (int i = 0; i < sizeOfArray; ++i) {
            System.out.print(arrayC[i] + " ");
        }
    }
}
