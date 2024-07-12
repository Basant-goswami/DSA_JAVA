package Questions;


//Write a program to sort the elements in odd positions in descending order and elements in ascending order
//Input: 1,2,3,4,5,6,7,8,9
//Output: 9,2,7,4,5,6,3,8,1

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class array_sort {
    private static void solution(int[] arr){
        int n = arr.length;
        int a = 0;
        int b = 0;
        int[] arr1 = new int[n/2 +1];
        int[] arr2 = new int[n/2];
        for (int i=0;i<n;i++){
            if (i%2 == 0){
                arr1[a++] = arr[i];
            } else{
                arr2[b++] = arr[i];
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        a = arr1.length-1;
        b = 0;
        for (int i=0;i<n;i++){
            if (i%2 == 0){
                arr[i] = arr1[a--];
            } else{
                arr[i] = arr2[b++];
            }
        }
        for (int el : arr){
            System.out.print(el+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {13,2,4,15,12,10,5};
        solution(arr);

    }
}
