public class EliminationGameOptimized {

    public static int Eliminate(int head, int[] arr, boolean leftToRight){
        int count = arr.length;
        int step=1;
        while(count>1){
            count=count/2;
            if(leftToRight==true){
                head=head+step;
            }

            leftToRight = !leftToRight;
            step=step*2;

        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        int lastElementToRemain = Eliminate(1, arr, true);
        System.out.println(lastElementToRemain);
    }
}