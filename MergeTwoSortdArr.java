import java.util.Arrays;

public class MergeTwoSortdArr {
    public static void main(String[] args) {
        int[] left = {1,2,3,4,5};
        int[] right = {6,7,8,9,10,11};

        

        System.out.println(Arrays.toString(mergeSort(left,right)));
    }
    public static int[] mergeSort(int[] left , int[] right){
        int mix[] = new int[left.length + right.length];

        int i=0;
        int j=0;
        int k=0; 
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k] = left[i];
                i++;
            }
            if(left[i]>right[j]){
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        
        
        return mix;
    }
}
