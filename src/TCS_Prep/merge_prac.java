package TCS_Prep;

public class merge_prac {
    private static void mergeSort(int[] arr,int si, int mid, int ei){
        int i = si;
        int j = mid + 1;
        int k = 0;
        int[] tempArr = new int[ei -si + 1];
        while(i <= mid && j <= ei){
            if (arr[i] < arr[j]) {
                tempArr[k] = arr[i];
                i++;
                k++;
            } else {
                tempArr[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid){
            tempArr[k] = arr[i];
            i++;
            k++;
        }
        while (j<=ei){
            tempArr[k] = arr[j];
            j++;
            k++;
        }
        // copy the tempArr element to the original array
        for (int l=0, x = si;l<tempArr.length;l++,x++){
            arr[x] = tempArr[l];
        }
    }
    private static void merge(int[] arr, int si, int ei){
        if (si >= ei){
            return;
        }
        int mid = si + (ei - si) / 2;
        merge(arr,si,mid);
        merge(arr,mid+1,ei);
        mergeSort(arr,si,mid,ei);
    }
    public static void printArr(int[] arr){
        for(int el : arr){
            System.out.print(el+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,1};
        merge(arr,0,arr.length-1);
        printArr(arr);
    }
}
