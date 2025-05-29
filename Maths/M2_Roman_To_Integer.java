//Roman to Integer (LeetCode 13)

//Example 1:
//Input: s = "III"
//Output: 3
//Explanation: III = 3.

//Example 2:
//Input: s = "IV"
//Output: 4
//Explanation: IV = 4.



public class M2_Roman_To_Integer {

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && getRomanValue(s.charAt(i)) < getRomanValue(s.charAt(i+1))) {
                result -= getRomanValue(s.charAt(i));
            } else {
                result += getRomanValue(s.charAt(i));
            }
        }
        return result; 
    }

    private static int getRomanValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // Invalid character
        }
    }

    public static void main(String[] args) {
        String s = "MCMXCIV"; // Example input
        System.out.println(romanToInt(s)); // Output: 1994
    }
}