package TCS_Prep;

import java.util.Arrays;

public class max_sum_subarray {
    public static int[] solution(int[] arr, int k){
        int n = arr.length;
        int maxSum = 0;
        int currSum = 0;
        int[] ans = new int[k];
        for (int i=0; i<k; i++){
            maxSum += arr[i];
        }
        ans = Arrays.copyOfRange(arr,0,k);
        currSum = maxSum;
        for (int i=k; i<n; i++){
            currSum = currSum - arr[i-k] + arr[i];
            if(currSum > maxSum){
                ans = Arrays.copyOfRange(arr,i-k+1,i+1);
                maxSum = currSum;
            }
        }
        System.out.println("the maxSum is : " + maxSum);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10};
        int k = 3;
        int[] res ;
        res = solution(arr, k);
        for(int el : res){
            System.out.print(el+" ");
        }
    }
}
