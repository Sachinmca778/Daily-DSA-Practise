

public class L2_Insertion {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        // Example usage
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display(); // Output: 10 -> 20 -> 30 -> null
        list.size(); // Output: 3
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }
        
        void display() {
            Node temp = head;
            while(temp!=null) {
                System.out.print(temp.data+" ");
                temp= temp.next;
            }
        }
        
        void size() {
            Node temp = head;
            int count =0;
            while(temp!=null) {
                count++;
                temp= temp.next;
            }
            System.out.println();
            System.out.println(count);
        }
        
    }
}










































































































































































































































