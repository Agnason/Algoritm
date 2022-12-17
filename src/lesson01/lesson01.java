package lesson01;

import java.util.ArrayList;
import java.util.List;

public class lesson01 {
    public static void main(String[] args) {
        simpleFind(20);
    }

    public static List<Integer> simpleFind(int number) {
        List<Integer> simpleArray = new ArrayList<>();
        boolean simple;
        for (int i = 3; i <= number; i++) {
            simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                simpleArray.add(i);
                System.out.println(i);
            }
        }
        return simpleArray;
    }
}
