package Questions;

public class Reverse_string {
    private static void solution(String[] word,int start, int end){
        if(start >= end){
            return;
        }
        String temp = word[start];
        word[start] = word[end];
        word[end] = temp;
        solution(word,start+1, end-1);
    }
    public static void main(String[] args) {
        String inp = "i love india";
        String[] word = inp.split(" ");
        solution(word,0,word.length-1);
        String ans = String.join(" ", word);
        System.out.println(ans);
    }
}
