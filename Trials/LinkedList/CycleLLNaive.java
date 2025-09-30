package Trials.LinkedList;

import java.util.HashSet;

class Node{
    int val;
    Node next;

    public Node(int data){
        this.val = data;
        this.next = null;
    }
}

public class CycleLLNaive {

    public static Node head;

    public boolean detectCycle(Node head){
        HashSet<Integer> hs = new HashSet<>();

        if(head == null) return false;

        Node curr = head;
        while (curr != null) {
            if(hs.contains(curr.val)){
                return true;
            }

            hs.add(curr.val);
            curr = curr.next;
        }
        return false;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);

        head.next.next.next = head.next;

        CycleLLNaive c = new CycleLLNaive();

        System.out.println( c.detectCycle(head));
    }

}
