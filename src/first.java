public class first {
    public static void main(String[] args) {
       CountStrings("122321");
//        System.out.println(p);
    }


        public static int CountStrings(String s){

            int n = s.length();
            int ans = 0;

            for (int i = 0; i < n; i++){
                String str = "";
                for (int j = i; j < n; j++){
                    str = str+s.charAt(j); // sub string mil gaya

                    int[] frequency = new int[10];

                    int maxDigit = -1;
                    for(int k=0; k<str.length();k++){
                        char ch = str.charAt(k);
                        int num = ch - '0';
                        maxDigit = Math.max(maxDigit, num);
                        frequency[num]++;
                    }
                    int freqMax=-1;
                    for(int a=0; a<=maxDigit; a++){
                        if(frequency[a]>=freqMax){
                            freqMax = frequency[a];
                        }
                    }
                    if(maxDigit>0 && maxDigit > freqMax) {
                        System.out.println(str);
                        ans++;
                    }
                }
            }
            return ans;
        }
    }