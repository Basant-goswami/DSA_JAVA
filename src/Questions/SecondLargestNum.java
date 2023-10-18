package Questions;

public class SecondLargestNum {
    public static void main(String[] args) {
        int[] arr = { 2,3,0,5,1,14,42,42};
        int l1 = Integer.MIN_VALUE;
        int l2 = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>l1){
                l2 = l1;
                l1 = arr[i];
            }
            else if(arr[i]>l2 && arr[i] != l1 ){
                l2 = arr[i];
            }
        }
        System.out.println(l2);

    }
}
