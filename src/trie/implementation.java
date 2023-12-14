package trie;

// trie data structure implementation

public class implementation {
    static class Node {
        Node child[] = new Node[26];   // array of size 26
        boolean endOfWord = false;      // denotes end of the word
        Node(){
            for (int i=0;i<26;i++){
                child[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // insert word into trie
    public static void insert(String word){
        Node curr = root;
        for (int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';     // gives int value of char

            if (curr.child[idx] == null){
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];
        }
        curr.endOfWord = true;      // word has inserted , end of word
    }

    //  search word or string in a trie
    public static boolean search(String word){
        Node curr = root;
        for (int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.child[idx] == null) return false;
            curr = curr.child[idx];
        }
        return curr.endOfWord == true;
    }

    public static void main(String[] args) {
        String arr[] = {"tree","trem","a","any","thor"};
        for (int i=0;i< arr.length;i++){
            insert(arr[i]);     // inserting into a trie
        }
        System.out.println(search("any"));
        System.out.println(search("bob"));
    }
}
