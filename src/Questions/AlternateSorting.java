package Questions;

import java.util.Arrays;

public class AlternateSorting {
    private static int[] solution(int[] arr){
        int[] result = new int[arr.length];
        Arrays.sort(arr);
        int a = 0;
        int b = arr.length-1;
        for (int i=0;i<arr.length;i++){
            if (i % 2 == 0){
                result[i] = arr[b--];
            } else {
                result[i] = arr[a++];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,7};
        int[] ans = solution(arr);
        for (int el : ans){
            System.out.print(el+ " ");
        }
    }
}
