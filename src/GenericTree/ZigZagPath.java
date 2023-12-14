package GenericTree;

import java.util.*;

import static java.util.Collections.reverse;

public class ZigZagPath {
    public static class Node{
        int value;
        List<Node> child;
        Node(int value){
            this.value = value;
            child = new ArrayList<>();
        }
    }
    public static void addElement(Node root){
        root.child.add(new Node(1));
        root.child.add(new Node(2));
        root.child.add(new Node(3));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(5));
        root.child.get(0).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(8));
        root.child.get(1).child.add(new Node(9));
        root.child.get(2).child.add(new Node(10));
        root.child.get(2).child.add(new Node(11));
        root.child.get(2).child.add(new Node(12));
        root.child.get(2).child.get(0).child.add(new Node(13));
        root.child.get(2).child.get(1).child.add(new Node(14));
        root.child.get(2).child.get(2).child.add(new Node(15));

    }
    public static List<List<Node>> pathPrint(Node root,List<List<Node>> ans){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean flag = false;
        while (!q.isEmpty()){
            List<Node> l = new ArrayList<>();
            int levelSize = q.size();
            while (levelSize-- > 0) {
                Node currNode = q.remove();
                l.add(currNode);
                for (int i = 0; i < currNode.child.size(); i++) {
                    q.add(currNode.child.get(i));
                }
            }
            if(flag==false){
                ans.add(l);
            }else {
                reverse(l);
                ans.add(l);
            }
            flag = !flag;
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(100);
        addElement(root);
        List<List<Node>> ans = new ArrayList<>();
        pathPrint(root,ans);
        for (var list : ans){
            for(var val : list){
                System.out.print(val.value+" ");
            }
            System.out.println();
        }
    }
}
