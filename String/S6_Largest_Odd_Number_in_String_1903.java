//1903. Largest Odd Number in String

// You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
// A substring is a contiguous sequence of characters within a string.

// Example 1:
// Input: num = "52"
// Output: "5"

// Example 2:
// Input: num = "4206"
// Output: ""

// Example 3:
// Input: num = "35427"
// Output: "35427"

// Optimal Approach:  -- O(n)
public class S6_Largest_Odd_Number_in_String_1903 {
    public static void main(String[] args)
    {
        String num = "35427";
        String result = largestOddNumber(num);
        System.out.println(result);
    }

    public static String largestOddNumber(String num) {
        int n = num.length();
        for(int i=n-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}