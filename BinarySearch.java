package Pratice;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i);
            }
        }
    }
}
