package Algorithms;

import java.util.Random;

public class BubbleSort {

    private static final int ARRAY_SIZE = 10;
    private int arrayForSorting[] = new int[ARRAY_SIZE];
    private Random randNumber = new Random();

    private void fillArray(int[] array) {

        for (int i = 0; i < ARRAY_SIZE; ++i) {
            array[i] = randNumber.nextInt(20);
        }
    }

    private void showElementsOfArray(int[] array) {

        for (int i = 0; i < ARRAY_SIZE; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void bubbleSort(int[] array){

        for (int a = 0; a < ARRAY_SIZE; ++a) {
            for (int b = ARRAY_SIZE - 1; b > a; --b) {
                if (array[b - 1] > array[b]) {
                    int temp = array[b];
                    array[b] = array[b - 1];
                    array[b - 1] = temp;
                }
            }
        }

    }

    public void launchBubbleSort(){
        fillArray(arrayForSorting);
        System.out.println("Before Bubble Sort: ");
        showElementsOfArray(arrayForSorting);
        bubbleSort(arrayForSorting);
        System.out.println("After Bubble Sort");
        showElementsOfArray(arrayForSorting);
    }
}
