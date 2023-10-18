package Sorting;

public class MergeSort {

    public static void conqure(int[] arr,int si, int mid, int ei){
        int merged[] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while(idx1<=mid && idx2<=ei){
            if (arr[idx1]<=arr[idx2]){
                merged[x] = arr[idx1];
                x++; idx1++;
            } else {
                merged[x] = arr[idx2];
                x++; idx2++;
            }
        }
        while (idx1<=mid){
            merged[x] = arr[idx1];
            x++; idx1++;
        }
        while(idx2 <= ei){
            merged[x] = arr[idx2];
            x++; idx2++;
        }
        // copy element from merged to arr
        for (int i=0, j=si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int[] arr,int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si) / 2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conqure(arr,si,mid,ei);
    }

    public static void main(String[] args) {
        int[] arr = {4,2,5,1,8,7};
        int n = arr.length;
        divide(arr,0,n-1);
        for(int el : arr){
            System.out.print(el+" ");
        }
    }
}
