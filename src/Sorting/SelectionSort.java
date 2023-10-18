package Sorting;

public class SelectionSort {
    public static int[] Selection_sort(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            int min = i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // swapping the smallest element to the front
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {6,5,3,4,9,1,0};
        int[] ans = Selection_sort(arr);
        for (var ele : ans){
            System.out.print(ele + " ");
        }
    }

}
