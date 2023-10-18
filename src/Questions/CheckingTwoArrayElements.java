package Questions;

import java.util.HashSet;

public class CheckingTwoArrayElements {

    public static boolean isSameElement(int[] arr1, int[] arr2){
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for (int i=0; i<arr2.length;i++){
            if (!hs.contains(arr2[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,2,1};
        int[] arr2 = {1,2,3,1,1,1,3};
        int[] arr3 = {1,2,3};
        System.out.println(isSameElement(arr1,arr2));
        System.out.println(isSameElement(arr2,arr3));
    }
}
