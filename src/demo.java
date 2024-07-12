
public class demo {
    public static int[] rotate(int[] arr,int st,int n){
        if(st>=n) return arr;
        int temp = arr[st];
        arr[st]=arr[n];
        arr[n]=temp;
        rotate(arr,st+1,n-1);
        return arr;
    }
    public static void main(String[] args) {
//        int[] arr = {2,3,4,5,6,75};
//        int n = arr.length;
//        rotate(arr,2,n-1);
//        for(int val : arr){
//            System.out.print(val+" ");
//        }

        // swapping two numbers without using extra variable
//        int a = 5;
//        int b = 10;
//        System.out.println("a = " +a);
//        System.out.println("b = "+b);
//        a = a + b; // 15
//        b = a - b; // 5
//        a = a - b ; // 10
//        System.out.println("a = " +a);
//        System.out.println("b = "+b);

//        int i=18;


    }
}
