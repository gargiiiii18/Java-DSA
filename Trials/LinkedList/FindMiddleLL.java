package Trials.LinkedList;

public class FindMiddleLL {

    public static Node head;

    public int findMiddle(Node head){

        if(head == null) return 0;

        // Node curr = head;
        Node slow = head;
        Node fast = head;

        //if you want the first middle in case of even,
        // while(fast != null && fast.next.next != null) {        
        while(fast != null && fast.next != null) {

            fast = fast.next.next;

            slow = slow.next;
  
    }
    return slow.val;
}

    public static void main(String[] args) {

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        // head.next.next.next.next = new Node(5);

        // head.next.next.next = head.next;

        FindMiddleLL fl = new FindMiddleLL();

        System.out.println(fl.findMiddle(head));
    }
}
