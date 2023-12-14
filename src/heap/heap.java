package heap;

import java.util.ArrayList;

//  implementation of heap data structure using arraylist
public class heap {

    ArrayList<Integer> arr = new ArrayList<>();
    public void add(int data){
        arr.add(data);

        int x = arr.size()-1;
        int par = (x-1)/2;
        while (arr.get(par)>arr.get(x)){
            // swap
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par,temp);

            x = par;
            par = (x-1)/2;
        }
    }

    public int peek(){
        return arr.get(0);
    }

    public boolean isEmpty(){
        return arr.size()==0;
    }

    private void heapify(int idx){
        int left = 2*idx+1;     // given the left node idx no, of parent
        int right = 2*idx+2;    // given the right node idx no, of parent
        int minIdx = idx;

        // comparing both left and right child nodes and return the min value node's index no
        if(left<arr.size() && arr.get(minIdx)>arr.get(left)){
            minIdx = left;
        }
        if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
            minIdx = right;
        }
        // swapping root and child node
        if(minIdx != idx){
            // swap
            int temp = arr.get(idx);
            arr.set(idx, arr.get(minIdx));
            arr.set(minIdx, temp);
            heapify(minIdx);
        }
    }

    public int remove(){
        int data = arr.get(0);

        // swap first and last index
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size()-1));
        arr.set(arr.size()-1, temp);

        // remove last element
        arr.remove(arr.size()-1);

        // heapify --> fix the heap
        heapify(0);
        return data;
    }

    public static void main(String[] args) {
        heap h = new heap();
        h.add(14);
        h.add(52);
        h.add(7);
        h.add(2);

        while (!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
