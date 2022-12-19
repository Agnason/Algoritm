package lesson02.sort;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
/**
 * 0(N^2)
 * */
        boolean needSort;
        do {
            needSort = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    needSort = false;
                }
            }
        } while (!needSort);
    }
}
