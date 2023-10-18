package HashSet;

import java.util.HashSet;

public class first {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(3);
        System.out.println(hs.size());
        hs.add(43);
        hs.add(1);
        hs.add(41);
        hs.add(6);
//        hs.remove(3);
        System.out.println(hs);
    }
}