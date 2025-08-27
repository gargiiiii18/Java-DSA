package Trials.Queue;

class Node{
    int val;
    Node next;

    public Node(int x){
        val = x;
    }
}

public class QueueUsingLinkedList {

    public static Node top;

    public static int currSize = 0;
    public static Node start;
    public static Node end;

    public static void push(int n){
        if(currSize == 0){
            Node temp = new Node(n);
            start = temp;
            end = temp;
        } else{
            Node temp = new Node(n);
            end.next = temp;
            end = temp;
        }
        currSize++;
    }

    public static void pop(){
        if(currSize == 0){
            System.out.println("queue empty");
        } else {
        if(currSize == 1){
            start = null;
            end = null;
        } else{
            start = start.next;
        }
        currSize--;
    }
    }

    public static void top(){
        if(currSize == 0){
            System.out.println("queue empty");
        } else{
            System.out.println(start.val);
        }
    }

    public static void size(){
        System.out.println(currSize);
    }

    public static void display(){
        Node curr = start;
        while(curr!= null){
            System.out.print(curr.val);
            if(curr.next != null){
            System.out.print(" -> ");
            }
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);

        // display();

        top();

        pop();
        pop();

        top();

        push(5);
        push(6);

        top();
        size();

        display();
    }
}
