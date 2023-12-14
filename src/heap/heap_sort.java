package heap;

public class heap_sort {

    private static void heapify(int idx,int arr[], int size){
        int left = 2*idx+1;
        int right = 2*idx+2;
        int maxIdx = idx;

        if(left<size && arr[left]>arr[maxIdx]){
            maxIdx = left;
        }
        if (right<size && arr[right]>arr[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != idx){
            // swap
            int temp = arr[idx];
            arr[idx] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(maxIdx,arr,size);
        }
    }

    public static void HeapSort(int arr[]){
        // heapify the arr -> convet arr to max heap
        int n = arr.length;
        // n/2 because we are going to take only non leaf nodes in the heap
        for(int i=n/2;i>=0;i--){
            heapify(i,arr,n);
        }

        // swap first and last element
        for (int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(0,arr,i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {23,4,41,36,5};
        HeapSort(arr);

        for (int el : arr){
            System.out.print(el+" ");
        }
        System.out.println();
    }
}
