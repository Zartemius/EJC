package Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class QuickSort {

    private static final int ARRAY_SIZE = 10;
    private ArrayList<Integer> quickSort = new ArrayList<>();

    private void askUsersNumbers() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int userAnswer = 0;

        for (int i = 0; i < ARRAY_SIZE; ++i) {
            System.out.println("Enter a number:");
            try {
                userAnswer = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            quickSort.add(userAnswer);
        }
    }

    private void showResult() {
        System.out.print(quickSort.toString());
        System.out.println();
    }

    private void sorting() {
        reQucikSort(0, ARRAY_SIZE - 1);
    }

    private void reQucikSort(int left, int right) {

        if (right - left <= 0) {
            return;
        } else {
            int pivot = quickSort.get(right);
            int partition = partitionIt(left, right, pivot);
            reQucikSort(left, partition - 1);
            reQucikSort(partition + 1, right);
        }
    }

    private int partitionIt(int left, int right, int pivot) {

        int leftPtr = left - 1;
        int rightPtr = right;

        while (true) {
            while (quickSort.get(++leftPtr) < pivot) {
            }
            while (rightPtr > 0 && quickSort.get(--rightPtr) > pivot) {
            }
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, right);
            }
        }
        swap(leftPtr, right);
        return leftPtr;
    }

    private void swap(int dex1, int dex2) {

        int temp;
        temp = quickSort.get(dex1);
        Collections.swap(quickSort, dex1, dex2);
        quickSort.set(dex2, temp);
    }

    public void launchQuickSort() {
        askUsersNumbers();
        System.out.println("Before Quick sort: ");
        showResult();
        sorting();
        System.out.println("After Quick sort: ");
        showResult();
    }
}
