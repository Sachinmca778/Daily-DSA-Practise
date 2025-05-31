// This code defines a simple linked list in Java and displays its elements.

public class L1_Display_LL {
    // This class represents a node in the linked list
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
			this.next = null; // Initialize next to null
        }
    }

	public static int length(Node head) {
	    int count = 0;
	    Node temp = head; // Start from the head of the linked list
	    while(temp != null) { // Traverse the linked list
	        count++; 
	        temp = temp.next; // Move to the next node
	    }
	    return count; 
	}

	public static void displayLL(Node head) {
	    Node temp = head; // Start from the head of the linked list
	    while(temp != null) { // Traverse the linked list
	        System.out.print(temp.data + " "); // Print the data of the current node
	        temp = temp.next; // Move to the next node
	    }
	    System.out.println(); // Print a new line after displaying all nodes
	}
    
	public static void main(String[] args) {
	    Node a = new Node(5); // Creating nodes
	    Node b = new Node(6);
	    Node c = new Node(7);
	    Node d = new Node(8);
	    Node e = new Node(9);
	    
	    a.next =b; // Linking nodes
	    b.next =c;
	    c.next =d;
	    d.next =e;
	    
		// Display the linked list	
		displayLL(a);  //output: 5 6 7 8 9

		System.out.println("Length of the linked list: " + length(a)); //output: Length of the linked list: 5
	    
	}
}