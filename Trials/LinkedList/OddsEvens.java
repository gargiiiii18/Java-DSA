package Trials.LinkedList;
import static Trials.LinkedList.CreationInsertion.head;

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
        CreationInsertion list = new CreationInsertion();
        OddsEvens group = new OddsEvens();

        for(int node : head){
            list.insert(node);
        }

        list.display();
        System.out.println();
        group.groupOddsEvens();
        System.out.println();
        list.display();

    }
}
