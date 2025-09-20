package Foundation;
import java.util.HashMap;
import java.util.Map;

public class CharacterCountWithMin {
    public static void main(String[] args) {
        String s = "balloon";
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int total = 0;
        for(int val : map.values()){
            total += Math.max(val, 2);
        }

        System.out.println("total characters: "+total);
    }
}
