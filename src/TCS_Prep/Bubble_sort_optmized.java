package TCS_Prep;

import org.w3c.dom.ls.LSOutput;

public class Bubble_sort_optmized {
    private static void BubbleSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int counter = 0;        //for optimizing the code its used
            for (int j=0;j<arr.length-1-i;j++){
                // swap
                if (arr[j] > arr[j+1]){
                    counter ++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("i = " + i);
            System.out.println("counter :" + counter);
            if (counter == 0){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,0};
        BubbleSort(arr);
        for (int el : arr){
            System.out.print(el+ " ");
        }
    }
}
