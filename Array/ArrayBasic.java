////////////////////////// Array Basic //////////////////////////

//Array
1.Arrays in Java are used to store multiple values of the same type in a single variable. 
2.Size is fixed once defined.


//1.Declaring an array
//syntax 
dataType[] arrayName;

// Example
int[] numbers; // An array to hold integers
String[] names; // An array to hold strings



//2.Creating an array
// Syntax
arrayName = new dataType[size];

// Example
numbers = new int[5]; // An array of 5 integers
names = new String[3]; // An array of 3 strings

int[] numbers = new int[5];



//3.Intializing an array
int[] numbers = {1, 2, 3, 4, 5}; // Array of integers
String[] names = {"Alice", "Bob", "Charlie"}; // Array of strings



//4.Accessing elements in an array
int[] numbers = {10, 20, 30, 40, 50};

System.out.println(numbers[0]); // Output: 10
System.out.println(numbers[2]); // Output: 30



// Updating a value
numbers[1] = 25; // Changes the second element to 25



//5.Array length
int[] numbers = {10, 20, 30, 40, 50};
System.out.println("Array size: " + numbers.length); // Output: 5



//6.Iterating over an array
//(a) Using a for loop
int[] numbers = {10, 20, 30, 40, 50};

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}



//(b) Using an enhanced for loop
int[] numbers = {10, 20, 30, 40, 50};

for (int number : numbers) {
    System.out.println(number);
}



//7.Multidimensional arrays

//Declaring and Creating a 2D Array:

int[][] matrix = new int[3][3];


//Initializing a 2D Array:
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

System.out.println(matrix[0][0]); // Output: 1
System.out.println(matrix[1][2]); // Output: 6



//8.Arrays of objects
// Array of strings
String[] names = {"Alice", "Bob", "Charlie"};

// Array of objects
Person[] people = {
    new Person("Alice", 25),
    new Person("Bob", 30),
    new Person("Charlie", 35)
};



//9.Copying an Array:
int[] original = {1, 2, 3};
int[] copy = original.clone(); // Creates a copy of the array

//Sorting an Array:
import java.util.Arrays;

int[] numbers = {5, 3, 8, 1};
Arrays.sort(numbers); // Sorts the array in ascending order











