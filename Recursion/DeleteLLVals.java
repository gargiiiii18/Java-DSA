// Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

// Constraints:

// The number of nodes in the list is in the range [0, 10^4].
// 1 <= Node.val <= 50
// 0 <= val <= 50

// Example 1:
// Input: head = [1,2,6,3,4,5,6], val = 6
// Output: [1,2,3,4,5]

// Example 2:
// Input: head = [], val = 1
// Output: []

// Example 3:
// Input: head = [7,7,7,7], val = 7

// Output: []

package Recursion;

class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class DeleteLLVals {

    public static Node head;

    public static void insertLast(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
        } else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public static void display(Node listHead){
        Node curr = listHead;
        while(curr != null){
            System.out.print(curr.val);
            if(curr.next != null){
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
    }

    public static Node deleteVal(Node head, int val){

        if(head == null){
            return head;
        }

        if(head.val == val){
            return deleteVal(head.next, val);
        }

        head.next = deleteVal(head.next, val);

        return head;
    }

    public static void main(String[] args) {

        insertLast(1);
        insertLast(2);
        insertLast(6);
        insertLast(3);
        insertLast(4);
        insertLast(5);
        insertLast(6);

        display(head);

        System.out.println();

        Node newHead = deleteVal(head,6);

        System.out.println();

        display(newHead);
    }
    
}
