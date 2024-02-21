package Questions;

import java.util.Arrays;

public class nestGraterElement3 {

    public static char[] swap(char[] arr,int a,int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
    public static char[] sort(char[] arr,int st, int ls){
        Arrays.sort(arr,st,ls);
        return arr;
    }
    public static int nextGreaterElement(int n) {
        String str = Integer.toString(n);
        char[] arr = str.toCharArray();
        int l = arr.length;
        int firstDeflection = -1;
        int nextGrater = -1;
        int max = arr[l-1]-'0';  // char to num
        for(int i=l-2;i>=0;i--){
            if((arr[i]-'0')< max){
                firstDeflection = i;
                break;
            }
            max = arr[i]-'0';
        }
        if(firstDeflection == -1) return -1;
        System.out.println("firstDeflection index ---> "+ firstDeflection);

        int digitMax = 10;  // maximum of digit
        int currMax = arr[firstDeflection]-'0';

        for(int i = firstDeflection+1;i<l;i++){
            int curr = arr[i]-'0';
            if((curr > currMax) && (curr < digitMax)){
                digitMax = curr;
                nextGrater = i;
            }
        }
        System.out.println("nextGrater index-----> " + nextGrater);

        swap(arr,firstDeflection,nextGrater);
        sort(arr,firstDeflection+1,arr.length);

        String str1 = new String(arr);
        long result = Long.parseLong(str1);
        if(result>Integer.MAX_VALUE){
            return -1;
        }else {
            return (int)result;
        }
    }
    public static void main(String[] args) {
        int num = 1203;

        System.out.println("result is " +nextGreaterElement(num));
    }
}
