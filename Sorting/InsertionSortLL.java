package Sorting;

class Node{
    int val;
    Node next;

    public Node(int x){
        this.val = x;
        this.next = null;
    }
}

public class InsertionSortLL {

   public static Node head;

   public static void insert(int val){
    Node newNode = new Node(val);
    if(head == null){
        head = newNode;
        newNode.next = null;
    } else{
          Node curr = head;
          while(curr.next!=null){
            curr = curr.next;
          }
          curr.next = newNode;
    }
}

    public static void displayLL(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val);
            if(curr.next != null){
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
    }

    public static void sortLL(){
        Node dummy = new Node(-1);
        Node curr = head;
        while (curr != null) {
            Node nxt = curr.next;
            Node start = dummy;
            while (start.next != null && start.next.val < curr.val) {
                start = start.next;
            }
            curr.next = start.next;
            start.next = curr;

            curr = nxt;
    }
    head = dummy.next;
}

   public static void main(String[] args) {
        insert(4);
        insert(2);
        insert(1);
        insert(3);

        displayLL();
        System.out.println();
        sortLL();
        System.out.println();
        displayLL();

   }
    
}
