package Sorting;

public class InsertionSort {
    // insertion sort n^2
    public static int[] Insertion_sort(int[] arr){
        for (int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {52,63,23,41,90,1,40};
        int[] ans = Insertion_sort(arr);
        for (var ele : ans){
            System.out.print(ele + " ");
        }
    }
}
