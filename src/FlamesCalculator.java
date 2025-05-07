import java.util.*;

public class FlamesCalculator {

    public static int nameDigit(char[] arr1, char[] arr2){
        int count =0;
        int n = arr1.length;
        int m = arr2.length;
        for(int i=0;i<n;i++){
            char ch  = arr1[i];
            for(int j=0;j<m;j++){
                if(ch == arr2[j]){
                    arr1[i]=arr2[j] = '-';
                    count += 2;
                    break;
                }
            }
        }
        return n+m-count;
    }
    public static String findFlames(int n){
        ArrayList<String> flames = new ArrayList<>();
        Collections.addAll(flames,"Friends","Love","Affection","Marriage","Enemy","Sibling");
        int idx = 0;
        while(flames.size()>1){
            idx = ((idx + n) % flames.size());
            if(idx == 0){
                idx = flames.size()-1;
            } else {
                idx -= 1;
            }
            String r = flames.remove(idx);
//            System.out.println(r);
        }

        return flames.get(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        char[] name1 = s1.toCharArray();
        char[] name2 = s2.toCharArray();

        int totalDigit = nameDigit(name1,name2);
//        System.out.println(totalDigit);
        System.out.println(findFlames(totalDigit));

    }
}
