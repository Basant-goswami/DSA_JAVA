package TCS_Prep;

public class Max_element_subarray {
    private static void solution(int[] arr, int k){
        int n = arr.length;
        for (int i=0; i<n-k+1; i++) {
            int max = arr[i];
            for (int j=1; j<k; j++){
                if (arr[i+j] > max){
                    max = arr[i+j];
                }
            }
            System.out.print(max +" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,7,1,6,3};
        int k = 3;
        solution(arr,k);
    }
}
