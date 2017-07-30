package Algorithms;

public class Main {

    public static void main(String[] args) {
        QuickSort startQuickSort = new QuickSort();
        InsertionSort startInsertSort = new InsertionSort();
        RadixSort startRadixSort = new RadixSort();
        BubbleSort startBubbleSOrt = new BubbleSort();
        BinarySearch startBinarySearch = new BinarySearch();

        startRadixSort.launchRadixSort();
        startQuickSort.launchQuickSort();
        startInsertSort.launchInsertionSort();
        startBubbleSOrt.launchBubbleSort();
        startBinarySearch.executeBinarySearch();
    }
}
