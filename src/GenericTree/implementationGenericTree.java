package GenericTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class implementationGenericTree {
    public static class Node{
        int value;
        List<Node> child;
        Node(int value){
            this.value = value;
            child = new ArrayList<>();
        }
    }
    public static void addElement(Node root){
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));
        root.child.get(0).child.add(new Node(1));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(8));
        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(15));
        root.child.get(2).child.add(new Node(31));
        root.child.get(2).child.add(new Node(55));
        root.child.get(2).child.add(new Node(65));
    }
    public static void preOrder(Node root){
        if(root.child.isEmpty()){
            System.out.print(root.value+" ");
            return;
        }
        System.out.print(root.value+" ");
        int n = root.child.size();
        for (int i=0;i<n;i++){
            preOrder(root.child.get(i));
        }
    }
    public static void postOrder(Node root){
        if(root.child.isEmpty()){
            System.out.print(root.value+" ");
            return;
        }
        int n = root.child.size();
        for (int i=0;i<n;i++){
            postOrder(root.child.get(i));
        }
        System.out.print(root.value+" ");
    }
    // second method for postOrder traversal , similar you can print preorder
    public static void post(Node root){
        if(root==null){
            return;
        }
        for (var node : root.child){
            postOrder(node);
        }
        System.out.print(root.value+" ");
    }
    public static void inOrder(Node root){
        if(root==null) return;
        int n = root.child.size();
        for (int i=0;i<n-1;i++){
            inOrder(root.child.get(i));
        }
        System.out.print(root.value+" ");
        if(root.child.size()>1) inOrder(root.child.get(root.child.size()-1));
    }
    // BFS TRAVERSAL OR LEVEL ORDER TRAVERSAL
    public static void levelOrder(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.size()>0){
            Node currNode = q.remove();
            System.out.print(currNode.value+" ");
            for (int i=0;i<currNode.child.size();i++){
                q.add(currNode.child.get(i));
            }
        }

    }
    public static void main(String[] args) {
        Node root = new Node(30);
        addElement(root);
        System.out.println("preorder");
        preOrder(root);
        System.out.println();
        System.out.println("postorder");
        postOrder(root);
        System.out.println();
        post(root);
        System.out.println();
        System.out.println("inorder printing");
        inOrder(root);
        System.out.println();
        System.out.println("level order(BFS)");
        levelOrder(root);
    }
}
