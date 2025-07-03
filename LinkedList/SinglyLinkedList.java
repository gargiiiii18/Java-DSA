// Given the head of a singly linked list, reverse the list, and return the reversed list.

// Input: head = [1,2,3,4]
// Output: [4,3,2,1]

package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {

    public static Node head;

    public  SinglyLinkedList(){
        head = null;
    }

    public void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        } else{
        Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void displayLL(){
        Node current = head;
        while(current != null){
            System.out.print(current.data);
            if(current.next != null){
                System.out.print(" -> ");
            }
            current = current.next;
        }
    }

    public void reverseLL(){
        Node current = head;
        Node next = null;
        Node prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void insertAtStart(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else{
            Node current = newNode;
            current.next = head;
            head = current;
        }
    }

    public void insertAtEnd(int data){  
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        int positionTracker = 0;
        if(head == null){
            head = newNode;
        } else{
            Node current = head;
            while(current != null && positionTracker < position){
                current = current.next;
                positionTracker++;
            }
            if(current == null){
                return;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void deleteFirst(){
        if(head == null){
            return;
        }
        Node current = head;
        head = current.next;
    }

    public void deleteByValue(int val){
        if(head == null){
            return;
        }
        Node current = head;
        while(current!=null && current.next.data != val){
            current = current.next;
        }
        if(current == null){
            return;
        }
        current.next = current.next.next;
    }


    public static void main(String[] args) {
        int[] head = {1, 2, 3, 4};
        SinglyLinkedList list = new SinglyLinkedList();
        for(int node : head){
            list.insert(node);
        }

        System.out.println("Printing LL");

        list.displayLL();

        System.out.println();
    
        // list.insertAtStart(60);
        // list.insertAtStart(0);
        // list.insertAtEnd(5);
        list.insertAtPosition(12, 2);
        // list.reverseLL();
        System.out.println();
        // System.out.println("Printing Reversed LL");
        list.displayLL();

        // list.deleteFirst();

        list.deleteByValue(12);

        System.out.println();

        list.displayLL();
    }

}