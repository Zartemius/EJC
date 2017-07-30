package Algorithms;

import java.util.Random;

public class RadixSort {

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

    private int getMax(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private void radSort(int[] array) {

        int digitPlace = 1;
        int maxNumber = getMax(array);
        int result[] = new int[array.length];
        while (maxNumber / digitPlace > 0) {
            int[] count = new int[10];
            for (int i = 0; i < 10; i++) {
                count[i] = 0;
            }
            for (int i = 0; i < array.length; i++) {
                count[array[i] / digitPlace % 10]++;
            }
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }
            for (int i = array.length - 1; i >= 0; i--) {
                result[count[array[i] / digitPlace % 10] - 1] = array[i];
                count[array[i] / digitPlace % 10]--;
            }
            for (int i = 0; i < array.length; i++) {
                array[i] = result[i];
            }
            digitPlace *= 10;
        }
    }

    public void launchRadixSort(){
        fillArray(arrayForSorting);
        System.out.println("Before Radix Sort: ");
        showElementsOfArray(arrayForSorting);
        radSort(arrayForSorting);
        System.out.println("After Radix Sort");
        showElementsOfArray(arrayForSorting);
    }
}
