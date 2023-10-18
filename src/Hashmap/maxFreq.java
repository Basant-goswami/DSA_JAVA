package Hashmap;
import java.util.*;

public class maxFreq {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,2,4,5,6,2,1,6,6};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int el : arr){
            if (!freq.containsKey(el)){
                freq.put(el, 1);
            } else {
                freq.put(el, freq.get(el)+1);
            }
        }
        System.out.println(freq.entrySet());
        int maxfreq=0; int maxkey = -1;
//        for (var key : freq.entrySet()){
//            if (key.getValue()>maxfreq){
//                maxfreq = key.getValue();
//                maxkey = key.getKey();
//            }
//        }

        for(var el : freq.keySet()){
            if (freq.get(el)>maxfreq){
                maxfreq = freq.get(el);
                maxkey = el;
            }
        }
        System.out.printf("the key value is %d and maximum occurance is %d", maxkey, maxfreq);
    }
}
