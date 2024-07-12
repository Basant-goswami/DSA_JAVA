package TCS_Prep;

public class quick_pracc {
    private static int partion(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int a = si; // bhulna nahi , galti nahi karna hai yaha
        for (int i=si;i<ei;i++){
            if (arr[i] <= pivot){
                // swap
                int temp = arr[i];
                arr[i] = arr[a];
                arr[a] = temp;
                a++;
            }
        }
        // swap ,fix the pivot element position
        int temp = arr[a];
        arr[a] = pivot;
        arr[ei] = temp;
        return a;
    }
    private static void quick(int[] arr,int si,int ei){
        if (si >= ei){
            return;
        }
        int pIdx = partion(arr,si,ei);
        quick(arr,si,pIdx-1);
        quick(arr,pIdx+1,ei);
    }
    public static void main(String[] args) {
        int[] arr = {4,5,1,6,3};
        quick(arr,0,arr.length-1);
        for (int el : arr){
            System.out.print(el + " ");
        }
    }
}
