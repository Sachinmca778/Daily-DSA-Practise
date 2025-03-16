//15. 3Sum

//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
//Find all unique triplets in the array which gives the sum of zero.
//Notice that the solution set must not contain duplicate triplets.
//Example 1:
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]

//Example 2:
//Input: nums = [0,1,1]
//Output: []

//Example 3:
//Input: nums = [0,0,0]
//Output: [[0,0,0]]


//1.brute force approach:  -- O(n^3)

import java.util.*;
public class A15_3SUM_15 {
    public static void main(String[] args)
    {
        int arr[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(arr);
        System.out.println(result);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        if(!result.contains(list)){
                            result.add(list);
                        }
                    }
                }
            }
        }
        return result;
    }
}





//2.Optimal Approach:  -- O(n^2)
import java.util.*;
class A15_3SUM_15 {
    public static void main(String[] args)
    {
        int arr[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(arr);
        System.out.println(result);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i+1;
            int right = n-1;
            while(left <right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            } 
        }
        return result;
    }
}


//Step by wise solution 3Sum:
// 1.Sort the Array – Pehle array ko sort kar lo taaki duplicate handling aur two-pointer technique easily apply ho sake.
// 2.Loop Chalao (0 to n-2) – Ek loop chalao jo har element ko fix karega (nums[i]).
// 3.Two Pointers Lo (left & right)
// left = i + 1 (next element)
// right = n - 1 (last element)
// 4.Check Sum (nums[i] + nums[left] + nums[right])
// 5.Agar sum == 0 → List me add karo aur duplicates ko handle karte hue left++, right--.
// Agar sum < 0 → left++ (sum ko badaane ke liye).
// Agar sum > 0 → right-- (sum ko kam karne ke liye).
// 6.Continue Until left < right – Jab tak left < right, tab tak valid triplets find karte raho.
// 7.Return the Result List – Jo unique triplets mile hain, unko return kar do.

