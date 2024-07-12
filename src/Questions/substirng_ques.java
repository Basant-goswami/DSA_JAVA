package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class substirng_ques {
    public static void main(String[] args) {
//        String s1 = "testing12";
//        String s2 = "1234";
//        System.out.println(s1.indexOf(s2));

        int[] arr1 = { 2,4,5,6,7,9,10,13};
        int[] arr2 = { 2,3,4,5,6,7,8,9,11,15};
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr1) {
            hs.add(i);
        }
        for(int i : arr2){
            hs.add(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int el: hs){
            ans.add(el);
        }
        Collections.sort(ans);
        for (int el : ans){
            System.out.print(el + " ");
        }
    }
}
