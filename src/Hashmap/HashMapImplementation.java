package Hashmap;

import java.util.LinkedList;

public class HashMapImplementation {
    public static class MyHashMap<k,v>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private class Node{
            k key;
            v value;
            Node(k key, v value){
                this.key = key;
                this.value = value;
            }
        }

        int n;
        private LinkedList<Node>[] buckets;

        private void initBucket(int N){     // array of linked list - N size
            buckets = new LinkedList[N];
            for (int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunc(k key){
            int hc = key.hashCode();
            return (Math.abs(hc))%buckets.length;
        }

        // searching the nodes in a linked list
        private int SerchInBucket(LinkedList<Node> ll, k key){
            for (int i=0; i<ll.size(); i++){
                if (ll.get(i).key == key){
                    return i;
                }
            }
            // if does not exist the key in the node
            return -1;
        }

        // rehash process - crating a doubly size bucket and copy all the nodes in the new bucket
        private void rehash (){
            LinkedList<Node> [] oldbuckets = buckets;
            n = 0;
            initBucket(buckets.length*2);
            for(var bucket : oldbuckets){   // copy from old to new bucket
                for (var node : bucket){
                    put(node.key, node.value);
                }
            }
        }

        // for checking the rehashing is working or not
//        public int display(){
//            return buckets.length;
//        }
//        public float load(){
//            return (n*1.0f)/buckets.length;
//        }

        public MyHashMap(){
            initBucket(DEFAULT_CAPACITY);
        }
        public int size(){
            return n;
        }

        public void put(k key, v value) {    // adding and updating the node in the corresponding bucket
            int bi = HashFunc(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int sn = SerchInBucket(currentBucket, key);
            if (sn == -1){
                // key doesn't exist
                Node node = new Node(key, value);
                currentBucket.add(node);
                n++;
            } else {   // updating the existing node value
                Node currNode = currentBucket.get(sn);
                currNode.value = value;
            }
            // for rehashing -- (it is using to avoid collision)
            if (n >= buckets.length * DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }

        public v get(k key){
            int bi = HashFunc(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int sn = SerchInBucket(currentBucket, key);
            if (sn != -1){
                Node currNode = currentBucket.get(sn);
                return currNode.value;
            }
            // key doesn't exist
            return null;
        }

        public v remove(k key){
            int bi = HashFunc(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int sn = SerchInBucket(currentBucket,key);
            if (sn != -1){
                Node currNode = currentBucket.get(sn);
                v val = currNode.value;
                currentBucket.remove(sn);
                n--;
                return val;
            }
            return null;
        }

    }
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
       ;
        System.out.println(map.size());
//        System.out.println("load "+map.load());
//        System.out.println("capacity "+map.display());
        map.put("d", 4);
        map.put("de", 14);
        map.put("be", 25);
        System.out.println(map.remove("de"));
        System.out.println(map.get("be"));

//        System.out.println("load "+map.load());
//        System.out.println("capacity "+map.display());


    }
}
