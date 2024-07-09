import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int [] num = {1, 2, 3, 4, 6, 10, 13, 18};
        int index = Arrays.binarySearch(num, 11);
        System.out.println(index);
    }
}
