package Insertion;

import java.util.Arrays;


public class Insertion {
    public static void main(String[] args) {
        int[] arr = {10,5,3,7,9,2};

        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    public static int[] insertionSort(int[] arr){
        int n= arr.length;

        for(int i =1; i<n; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[j]> arr[j+1]){
                    swap(arr,j,j+1);
                }else{
                    break;
                }
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int first , int second){
        int storing= arr[first];
        arr[first] = arr[second];
        arr[second] = storing;
        return;
    }
}
