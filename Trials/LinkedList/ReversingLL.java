package Trials.LinkedList;

import static Trials.LinkedList.CreationInsertion.head;

public class ReversingLL {

    public static void reverseLL(){
       if(head == null){
           return;
       }
       Node current = head;
       Node prev = null;
       Node next = null;
       while(current != null){
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
       }
       head = prev;
       }

    public static void main(String[] args) {
        int[] head = {1, 2, 3, 4};
//        CreationInsertion list = new CreationInsertion();
        for(int node : head){
            CreationInsertion.insert(node);
        }
        CreationInsertion.display();
        System.out.println();
        reverseLL();
        CreationInsertion.display();
    }
}