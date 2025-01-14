//151. Reverse Words in a String
// Given an input string s, reverse the order of the words.
//A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.

// Example 1:
// Input: s = "the sky is blue"
// Output: "blue is sky the"

// Example 2:
// Input: s = "  hello world  "
// Output: "world hello"




public class S4_Reverse_Words_in_a_String_151{

    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");       // \\s+ is a regex pattern that matches one or more spaces. 
        StringBuilder result = new StringBuilder();  // StringBuilder is more efficient than String for concatenation
        for(int i = words.length-1; i>=0; i--){
          result.append(words[i]);
          result.append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args){
        String s = "  Bob    Loves  Alice   ";
        String result = reverseWords(s);
        System.out.println(result);
    }

}


// Time Complexity: O(n) where n is the length of the string s.

// Approach :
// 1. sabse phle hum string ko break krke hum array mai convert krnge ek regex pattern ko use krke .
// 2. Ab hum reverse ka loop laga ke string ko reverse krte jaenge.
// 3. Ab hum array ko string mai convert krte jaenge.then hum return kr denge
