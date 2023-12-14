
public class demo {
    public static int[] rotate(int[] arr,int st,int n){
        if(st>=n) return arr;
        int temp = arr[st];
        arr[st]=arr[n];
        arr[n]=temp;
        rotate(arr,st+1,n-1);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,75};
        int n = arr.length;
        rotate(arr,0,n-1);
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
}
