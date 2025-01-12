//344. Reverse String
// Write a function that reverses a string. The input string is given as an array of characters s.
// You must do this by modifying the input array in-place with O(1) extra memory.

// Example 1:
// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]

// Example 2:
// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]


public class S5_Reverse_String_344 {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }
}


//2nd Method (Khud ka)  this for using extra space
// public class S5_Reverse_String_344 {
//     public static void reverseString(char[] s) {
//        char a[] = new char[s.length];
//         int j=0;
//         for(int i =s.length-1;i>=0;i--){
//             a[j] = s[i]; 
//             j++;
//         }
//         for(int i =0;i<a.length;i++){
//             s[i]=a[i];
//         }
//         System.out.println(s);
//     }
//     public static void main(String[] args) {
//         char[] s = {'h', 'e', 'l', 'l', 'o'};
//         reverseString(s);
//     }
// }



// Approach (in hindi mai) --> two pointer approach
// 1. hum left aur right pointer lenge jo ki ek hi array mai hai.
// 2. left aur right pointer ko swap krte jaenge.
// 3. left aur right pointer ko increment aur decrement krte jaenge.
// 4. jab tak left aur right pointer cross nhi ho jata tab tak hum swap krte jaenge.
// 5. jab left aur right pointer cross ho jata hai to hum array ko print kr denge.

