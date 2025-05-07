import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        int[][] arr = {{2,6},{3,4},{0,4}};
        List<int[]> ans = new ArrayList<>();
        int[] a = {3,5};
        ans.add((a));
        for (int[] x : ans){
            for(int i=0;i<x.length;i++){
                System.out.println(x[i]);
            }
        }
        int[] last = ans.get(ans.size()-1);
        last[1] = 89;
        for (int[] x : ans){
            for(int i=0;i<x.length;i++){
                System.out.println(x[i]);
            }
        }

    }
}
