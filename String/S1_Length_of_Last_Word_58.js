//58. Length of Last Word
// Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.
// A word is a maximal substring consisting of non-space characters only.

// Example 1:
// Input: s = "Hello World"
// Output: 5

// Example 2:
// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.




function lengthOfLastWord(s) {
    s = s.trim();  //yeh function trim krta hai string ko
    let count = 0;
    
    for (let i = s.length - 1; i >= 0; i--) {
        if (s.charAt(i) !== ' ') { //Access Each character of the string
            count++;
        } else {
            break;
        }
    }
    
    return count;
}

let str = "   fly me   to   the moon  ";
let result = lengthOfLastWord(str);
console.log(result);


// Approach:
// 1. Trim kro string ko
// 2. count ko 0 krdo
// 3. string ke last se loop chalao
// 4. agar string ke last character space nahi hai to count ko increment kro
// 5. agar space mil gya to break kro
// 6. count return kro
