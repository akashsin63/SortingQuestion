import java.util.Arrays;

//notes link : https://magical-thrill-47a.notion.site/Minimum-Absolute-Difference-1550e3680445458d91dd23abee507d74
public class MaximumAndMinimumMagic {
    public static void main(String[] args) {
        int[] A = {3,6,2,8,1,9};

        System.out.println(solution(A));
    }
    public static int[] solution(int[] A){
        //so for maximum first sort the array 
        //than check for each element which element is the farthest
        
        Arrays.sort(A);

        // for making the subset s1 and s2 for maximum just divide the element 
        
        int N = A.length;
        long mod = 1000000007;
        long max = 0;
        for (int i = N-1, j = 0; j < N/2; i--, j++) {
            long diff = (long) Math.abs(A[i] - A[j]);
            max = (max + diff + mod) % mod;
        }
        
        // for making the subset s1 and s2 for minimum just take diff of next to next element
        long min = 0;
        for(int i = N-1; i > 0; i=i-2) {
            long diff = (long) Math.abs(A[i] - A[i-1]);
            min = (min + diff + mod) % mod;
        }

        int[] result = new int[2];
        result[0] = (int) max;
        result[1] = (int) min;
        return result;
    }
}
