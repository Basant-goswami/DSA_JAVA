package Sorting;

public class BubbleSort {
    // Bubble sort
    public static int[] BubbleSorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] ans = BubbleSorting(arr);
        for (var ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
