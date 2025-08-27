package Trials.Stack;

class Node{
    int val;
    Node next;

    public Node(int x){
        val = x;    
    }
}

public class StackUsingLinkedList {

    public static Node top;
    public static int size = 0;

    public static void push(int n){
        if(top == null){
            top = new Node(n);
        } else{
            Node temp = new Node(n);
            temp.next = top;
            top = temp;
        }
        size++;
    }

    public static void pop(){
        if(top == null){
            System.out.println("stack empty");
        } else{
            top = top.next;
            size--;
        }
    }

    public static void top(){
       if(top == null){
            System.out.println("stack empty");
        } else{
            System.out.println(top.val);
        } 
    }

    public static void size(){
        System.out.println(size);
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);

        top();

        pop();
        pop();

        top();

        push(12);

        top();
        size();
    }
}
