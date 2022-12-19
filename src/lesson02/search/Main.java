package lesson02.search;

public class Main {
    public static void main(String[] args) {
        int [] array=new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }
        System.out.println(BinarySearch.search(527, array, 0, array.length));
    }
}
