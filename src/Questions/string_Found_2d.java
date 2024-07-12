package Questions;

import java.util.HashSet;

public class string_Found_2d {

    private static void helper(char[][] arr, int row, int col,String current, HashSet<String> word){
        if (row >= arr.length || col >= arr[row].length){
            return;
        }
        current += arr[row][col];
        if (word.contains(current)){
            System.out.println(current);
        }
        helper(arr,row,col+1,current,word);
        helper(arr,row+1,col,current,word);
    }

    public static void main(String[] args) {
        char[][] arr = {
                {'a', 'z', 'o', 'l'},
                {'n', 'x', 'h', 'o'},
                {'v', 'y', 'i', 'v'},
                {'o', 'r', 's', 'e'}
        };
        String[] word = {"van", "zoho", "love", "are", "is"};

        HashSet<String> hs = new HashSet<>();
        for (String el : word){
            hs.add(el);
        }

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                helper(arr,i,j,"",hs);
            }
        }
    }
}
