// Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
// The first node is considered odd, and the second node is even, and so on.
// Note that the relative order inside both the even and odd groups should remain as it was in the input.
// You must solve the problem in O(1) extra space complexity and O(n) time complexity.

// Input head = [1,2,3,4,5]
// Output = [1,3,5,2,4]

package LinkedList;
import static LinkedList.SinglyLinkedList.head;

public class OddsEvens {

    public void groupOddsEvens(){
        Node odd = head;
        Node even = odd.next;
        Node joinEvenChain = even;

        while(odd.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = joinEvenChain;

    }

    public static void main(String[] args) {

        int[] head = {1, 2, 3, 4, 5};
        SinglyLinkedList list = new SinglyLinkedList();
        OddsEvens group = new OddsEvens();

        for(int node : head){
            list.insert(node);
        }

        list.displayLL();
        System.out.println();
        group.groupOddsEvens();
        System.out.println();
        list.displayLL();

    }
}
