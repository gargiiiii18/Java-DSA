package Foundation;
public class MoveHashesToFront {
    public static void main(String[] args) {
        String s = "Move#Hash#to#Front";
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '#'){
                count++;
            } else{
                sb.append(c);
            }
        }

        for(int i = 0; i<count; i++){
            sb.insert(0, '#');
        }

        System.out.println(sb.toString());
    }
}
