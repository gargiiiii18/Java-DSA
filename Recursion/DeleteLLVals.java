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
