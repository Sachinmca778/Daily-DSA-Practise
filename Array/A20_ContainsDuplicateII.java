// Contains Duplicate II

//Example 1:
//Input: nums = [1,2,3,1], k = 3
//Output: true
//Explanation: The element 1 appears at indices 0 and 3, which are within the range of k = 3.

//Example 2:
//Input: nums = [1,0,1,1], k = 1
//Output: true
//Explanation: The element 1 appears at indices 1 and 3, which are within the range of k = 1.


import java.util.HashMap;

public class A20_ContainsDuplicateII {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value -> last index

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i); // update index of current number
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
