package Trees;

public class TreeBasicQues {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    // total size of tree or total elements
    public static int size(Node root){
    //   int s =  0;
        if (root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    // maximum vlaue
    public static int maxVal(Node root){
        if(root==null) return 0;
    //  int a = maxVal(root.left);
    //  int b = maxVal(root.right);
        return Math.max(root.val,Math.max(maxVal(root.left),maxVal(root.right)));
    }
    // min value of tree
    public static int minVal(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(minVal(root.left),minVal(root.right)));
    }
    // sum of all elements
    public static int Sum(Node root){
        if (root==null) return 0;
        return root.val+Sum(root.left)+Sum(root.right);
    }
    // multiplication of all elements of tree
    public static int Mul(Node root){
        if (root==null) return 1;
        return root.val*Mul(root.left)*Mul(root.right);
    }
    // height of the tree
    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;

        return Math.max(height(root.left),height(root.right))+1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;

//        System.out.println(size(root));
//        System.out.println(maxVal(root));
//        System.out.println(minVal(root));
        System.out.println(Sum(root));
//        System.out.println(Mul(root));
//        System.out.println(height(root));
    }
}
