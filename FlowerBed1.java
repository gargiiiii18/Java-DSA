
public class FlowerBed1{

    public static boolean checkFreeSpace(int n, int[] arr){
        boolean leftEmpty = false;
        boolean rightEmpty = false;
        for(int i=0; i<arr.length; i++){
//            int index = (i+arr.length)%arr.length;
            int count=0;
//            System.out.println("in loop");
            if(arr[i]==0){
                if(i==0 || arr[i-1]==0){
                    leftEmpty=true;
                }
                if(i==arr.length-1 || arr[i+1]==0){
                    rightEmpty=true;
                }
                if(leftEmpty==true && rightEmpty==true){
                    arr[i]=1;
                    count++;

                    if(count==n){
//                        System.out.println(count);
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1,0,0,0,1};
        int n=1;
        boolean canBePlanted = checkFreeSpace(n, nums);
        System.out.println(canBePlanted);
    }
}