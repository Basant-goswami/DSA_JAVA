package trie;

public class shortest_unique_prefix {
    // trie Node class with freq - for monetering the no of branches
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        int freq = 1;
        Node (){
            for (int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    // insertion of words in trie
    public static void insert(String word){
        Node curr = root;
        for (int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null){
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq ++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    // finding shortest unique prefix function
    public static void prefix(Node root, String ans){
        if (root == null) {
            return;
        }
        // base case 2 - if freq is 1
        if (root.freq == 1){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<root.children.length;i++){
            if(root.children[i] != null){
                prefix(root.children[i], ans+(char)(i + 'a'));
            }
        }
    }


    public static void main(String[] args) {
        String arr[] = {"zebra","dog","duck","dove"};
        for (int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        root.freq = -1;
        prefix(root,"");
    }
}
