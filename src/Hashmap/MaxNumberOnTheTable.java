package Hashmap;

import java.util.HashSet;

//  return max number on the table present on the table at the same time
public class MaxNumberOnTheTable {
    public static int maxNum(int[] nums) {
        HashSet<Integer> table = new HashSet<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (table.contains(num)) {
                table.remove(num);
            } else {
                table.add(num);
                max = Math.max(max, table.size());
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,1,3,2,3};
        System.out.println(maxNum(nums));
    }
}
