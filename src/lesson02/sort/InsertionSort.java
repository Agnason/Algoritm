package lesson02.sort;

public class InsertionSort {

    public static void sort (int [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<array[i]) {
                        int temp=array[i];
                        array[i]= array[j];
                        array [j]=temp;
                }
            }
        }
    }
}
