package task_05;

import java.util.Random;

public class Bubble_Sort {

    private static final int ARRAY_SIZE = 100;
    public int[] array = new int[ARRAY_SIZE];
    Random randNumber = new Random();

    public void fillArray() {

        for (int i = 0; i < ARRAY_SIZE; ++i) {
            array[i] = randNumber.nextInt(ARRAY_SIZE);
        }
    }

    public void showElementsOfArray() {

        for (int i = 0; i < ARRAY_SIZE; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void Sorting() {

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
}
