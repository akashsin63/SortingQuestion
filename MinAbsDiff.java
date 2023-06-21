import java.util.Arrays;

public class MinAbsDiff {
    public static void main(String[] args) {
        int[] arr = {11,5,2,7,15};

        System.out.println(MinimumAbsoulteDiff(arr));
    }
    public static int MinimumAbsoulteDiff(int arr[]){
        int minDiff =Integer.MAX_VALUE; 
        Arrays.sort(arr);

        for(int i=1; i<arr.length; i++){
            int diff = arr[i] - arr[i-1];

            minDiff = Math.min(minDiff,diff);
        }

        return minDiff;
    }
}
