import java.util.ArrayList;
import java.util.List;
public class EliminationGame1 {
    public static List<Integer> eliminate(List<Integer> arr){
        boolean leftToRight = true;
        for(int i=0; i<arr.size(); i++){
            arr.remove(i);
        }
        leftToRight=false;
        for(int i=arr.size()-1; i>0; i--){
            arr.remove(i);
        }
        leftToRight=true;

        return arr;
    }

    public static void main(String[] args){
        List <Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        System.out.println(list);
    }
}