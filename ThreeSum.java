//Solution Tab has the sample code.
//Edit the code, run it and submit the assignment.
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class ThreeSum {
    public static boolean contains(int[] arr, int element){
        for(int item : arr){
            if(item == element){
                return true;
            }
        }
        return false;
    }
    public static List<int[]> initial(int[] arr){
        List<int[]> ans = new ArrayList<>();
        List<int[]> answer = new ArrayList<>();
        int[] visited = new int[arr.length];
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(contains(visited, arr[i])){
                continue;
            }
            if(arr[i]>0){
                break;
            }
            visited[i]=arr[i];
            ans = remainingTwo(i, arr, ans);

        }
        if(ans.size()!=0){
            answer.addAll(ans);
        }
        return answer;
    }

    public static List<int[]> remainingTwo(int i, int[] arr, List<int[]> ans){
        int j=i+1;
        int k=arr.length-1;
        while(j<k){
            int sum = arr[i]+arr[j]+arr[k];
            if(sum==0){
                ans.add(new int[]{arr[i], arr[j], arr[k]});
                k--;
            }
            else if(sum<0){
                j++;
            }
            else if(sum>0){
                k--;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<int[]> answer = new ArrayList<>();
        answer = initial(nums);

        for(int[] arr : answer){
            System.out.print(Arrays.toString(arr));
  }

}
}