package Insertion;

import java.util.Arrays;

public class FirstNElementSorted {
/* FIRST N-1 elements are sorted and last element is not place it at correct position
 * 
 * Notes Link :- https://magical-thrill-47a.notion.site/Insert-Element-at-correct-place-6abaf5a4ede741ad9ffaf28387c3e493?pvs=4
*/

    public static void main(String[] args) {
        int[] arr = {2,6,10,16,20,4};   // last element is not at correct place 

        //basically element at wrong place give we have to just insert it in correct place
        System.out.println(Arrays.toString(insert(arr)));
    }
    public static int[] insert(int arr[]){
        int n = arr.length;

        //basically it will swap if i+1 is smaller than current element
        for(int i =n-2; i>=0; i--){
            if(arr[i]>arr[i+1]){
                swap(arr,i , i+1);
            }else{
                break;
            }
        }
        
        return arr;
    }
    public static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

        return;
    }

    //Tc = O(N)
}
