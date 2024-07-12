package TCS_Prep;

public class Selection_Sort {
    private static void SelectionSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int min_pos = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[min_pos]){
                    min_pos = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[min_pos];
            arr[min_pos] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,0};
        SelectionSort(arr);
        for (int el : arr){
            System.out.print(el + " ");
        }
    }
}
