package Trials.LinkedList;

public class CreationInsertion {

    public static Node head;

    CreationInsertion(){
        this.head = null;
    }

    public static void insert(int data){
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

    public static void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data);
            if(current.next != null){
                System.out.print(" -> ");
            }
            current = current.next;
        }
    }

//    public static void main(String[] args) {
//        insert(1);
//        insert(2);
//        insert(3);
//        insert(4);
//
//        display();
//    }
}