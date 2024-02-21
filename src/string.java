import java.util.*;

public class string {
    public static void main(String[] args) {
//        String str = "2...2";
//        String[] ans = str.split("\\.");
//        for(String el : ans){
//            System.out.println(el);
//        }
//        for (var el : ans){
//            if(el==""){
//                System.out.println("true");
//            }
//        }
//        System.out.println(ans.length);

        char[] str = {'2','1','5','4','3','6'};
//        Arrays.sort(str,1,4);
//        for(var el : str){
//            System.out.println(el);
//        }
        int st = 1;

        int currMax = str[st]-'0';

        int nextGrater = -1;
        int maximum = 10;

        for(int i = st+1; i<str.length; i++){
            int curr = str[i]-'0';
            if((curr>currMax) && (curr < maximum)){
                maximum = curr;
                nextGrater = i;
            }
        }
        System.out.println("the next grater is ");
        System.out.println(str[nextGrater]);
    }
}
