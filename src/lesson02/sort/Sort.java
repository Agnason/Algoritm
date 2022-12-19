package lesson02.sort;

import java.util.Date;

public class Sort {

    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i = i + 10000) {
            int[] array = new int[i];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 10000);
            }

            Date startDate = new Date();
            BubbleSort.bubbleSort(array);
            Date endDate = new Date();
            long bubbleSortDuration = endDate.getTime() - startDate.getTime();

            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 10000);
            }
            startDate = new Date();
            DirectSort.sort(array);
            endDate = new Date();
            long directSortDuration = endDate.getTime() - startDate.getTime();

            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 10000);
            }
            startDate = new Date();
            InsertionSort.sort(array);
            endDate = new Date();
            long insertionSortDuration = endDate.getTime() - startDate.getTime();

            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 10000);
            }
            startDate = new Date();
            QuickSort.sort(array);
            endDate = new Date();
            long quickSortDuration = endDate.getTime() - startDate.getTime();

            System.out.printf("i: %s, bubble sort duration: %s,  direct sort duration: %s, insert sort duration: %s, qiucksort: %s%n",
                    i, bubbleSortDuration,
                    directSortDuration,
                    insertionSortDuration,
                    quickSortDuration);
        }
    }
//        BubbleSort.bubbleSort(array);
//        System.out.println(Arrays.toString(array));
//        DirectSort.sort(array);
//        System.out.println(Arrays.toString(array));
//        InsertionSort.sort(array);
//        System.out.println(Arrays.toString(array));
//        QuickSort.sort(array);
//        System.out.println(Arrays.toString(array));
}


