//796. Rotate String

//Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
// A shift on s consists of moving the leftmost character of s to the rightmost position.

// For example, if s = "abcde", then it will be "bcdea" after one shift.

// Example 1:
// Input: s = "abcde", goal = "cdeab"
// Output: true

// Example 2:
// Input: s = "abcde", goal = "abced"
// Output: false


var rotateString = function(s, goal) {
    if((s.length==goal.length) && ((s+s).includes(goal))){
        return true;
    }
    return false;
};
let result = rotateString("abcde","cdeab");
console.log(result,'result');//true
let result1 = rotateString("abcde","abced"); 
console.log(result1,'result1');//false


// Approach:
// 1. check kro dono strings ka length equal hai ya nahi
// 2. check kro s+s me goal hai ya nahi
// 3. agar hai to return true
// 4. nahi to return false


