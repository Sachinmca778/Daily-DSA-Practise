
//Stirng Basics


//1.String kya hai?

// String ek data type hai jo text ya characters ko represent karta hai. Strings hamesha quotes ke andar likhe jate hain.

let singleQuoteString = 'Yeh ek string hai';  
let doubleQuoteString = "Yeh bhi ek string hai";  
let templateString = `Yeh string ${singleQuoteString} se judi hui hai`; 


//String ke common methods:

//1.Length property (string ki length pata karna):

// let str = "Namaste duniya";
// console.log(str.length); // 14

//2.toUpperCase() aur toLowerCase():
// Uppercase: poora string capital letters me convert karna.
// Lowercase: poora string small letters me convert karna.

// let str = "Hello World";
// console.log(str.toUpperCase()); // "HELLO WORLD"
// console.log(str.toLowerCase()); // "hello world"

//3.indexOf(): Kisi character ya substring ki position pata karna.

// let str = "Javascript is fun";
// console.log(str.indexOf("fun")); // 13

//4.slice(): String ka ek part extract karna.

// let str = "Programming";
// console.log(str.slice(0, 6)); // "Progra" //6 index ko include nahi karega

//5.replace(): Ek part ko replace karna.

// let str = "Hello India";
// console.log(str.replace("India", "World")); // "Hello World"

//6.concat(): Strings ko jodna.

// let str1 = "Hello";
// let str2 = "World";
// console.log(str1.concat(" ", str2)); // "Hello World"

//7.trim(): Extra spaces hataana (starting aur ending se).

// let str = "   Hello World   ";
// console.log(str.trim()); // "Hello World"


//String Methods (Aur Advanced Methods)

//8.includes():
// Kisi string me ek particular substring hai ya nahi, yeh check karta hai (true ya false return karta hai).

// let str = "JavaScript is amazing";
// console.log(str.includes("amazing")); // true
// console.log(str.includes("boring"));  // false

//9.startsWith() aur endsWith():
// startsWith() check karta hai ki string kis se start ho rahi hai.
// endsWith() check karta hai ki string kis se end ho rahi hai.

// let str = "Hello World";
// console.log(str.startsWith("Hello")); // true
// console.log(str.endsWith("World"));   // true

//10.repeat():
// String ko repeat karne ke liye.

// let str = "Hi ";
// console.log(str.repeat(3)); // "Hi Hi Hi "

//11.split():
// String ko parts me tod kar ek array me convert karta hai.

// let str = "Apple, Banana, Mango";
// let fruits = str.split(", ");
// console.log(fruits); // ["Apple", "Banana", "Mango"]

//12.charAt():
//Kisi specific position par character ko return karta hai.

// let str = "JavaScript";
// console.log(str.charAt(4)); // "S"

//13.charCodeAt():
// Kisi character ke ASCII code ko return karta hai.

// let str = "A";
// console.log(str.charCodeAt(0)); // 65

//14.padStart() aur padEnd():
// padStart() string ke starting me padding add karta hai.
// padEnd() string ke end me padding add karta hai.

// let str = "5";
// console.log(str.padStart(3, "0")); // "005"
// console.log(str.padEnd(3, "*"));  // "5**"

//String Comparison (Compare karna):
// JavaScript me strings ko == ya === se compare kiya jata hai. Case-sensitive hota hai.

let str1 = "Hello";
let str2 = "hello";

console.log(str1 === str2); // false (case-sensitive)
console.log(str1.toLowerCase() === str2.toLowerCase()); // true















//Template Literals ka use: Agar dynamic values (variables) ko string ke andar include karna ho toh template literals use karte hain

// let name = "Sachin";
// let age = 24;
// let message = `Mera naam ${name} hai aur meri age ${age} hai.`;
// console.log(message); // Output: "Mera naam Rahul hai aur meri age 25 hai."
























