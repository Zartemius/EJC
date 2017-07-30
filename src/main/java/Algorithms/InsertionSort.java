package Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionSort {

    private static final int ARRAY_SIZE = 10;
    private int[] arrayForInsertionSort = new int[ARRAY_SIZE];

    private void insertionSort(int[] array) {

        for (int out = 1; out < ARRAY_SIZE; out++) {
            int temp = array[out];
            int in = out;
            while (in > 0 && array[in - 1] >= temp) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;
        }
    }

    private void askUsersNumbers(int[] array) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int userAnswer = 0;

        for (int i = 0; i < ARRAY_SIZE; ++i) {
            System.out.println("Enter a number:");
            try {
                userAnswer = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            array[i] = userAnswer;
        }
    }

    public void showResult(int[] array) {

        for (int i = 0; i < ARRAY_SIZE; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void launchInsertionSort(){

        askUsersNumbers(arrayForInsertionSort);
        System.out.println("Before Insertion Sort: ");
        showResult(arrayForInsertionSort);
        insertionSort(arrayForInsertionSort);
        System.out.println("After Insertion Sort: ");
        showResult(arrayForInsertionSort);
    }
}
