import java.util.*;

public class string {
    public static void main(String[] args) {
        String str = "2...2";
        String[] ans = str.split("\\.");
        for(String el : ans){
            System.out.println(el);
        }
        for (var el : ans){
            if(el==""){
                System.out.println("true");
            }
        }
        System.out.println(ans.length);
    }
}
