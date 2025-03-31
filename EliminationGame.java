import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class EliminationGame {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> new_list = new ArrayList<>();
        boolean leftToRight = true;
        while(list.size()>1) {
            if (leftToRight == true) {
//                if(list.size()==1){
//                    System.out.println(list);
//                }
                for (int i = 0; i < list.size(); i++) {
                    list.remove(i);
                }
                leftToRight = false;
            }
            if (leftToRight == false) {
                for (int i = list.size() - 1; i > 0; i -= 2) {
//                    if(list.size()==1){
//                        System.out.println(list);
//                    }
                    list.remove(i);
                }
                leftToRight = true;
            }
        }
        System.out.println(list);
    }
}