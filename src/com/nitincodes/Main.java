package com.nitincodes;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	//
        int[] arr = {2,9,4,7,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        boolean swapped;
        // run the steps in n-1 times
        for(int i=0;i< arr.length;i++){
            // for each step, max item will come at the last respective index
            for(int j=1;j< arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                int temp;
                temp = arr[j];
                arr[j] = arr[j -1];
                arr[j-1] = temp;
                swapped = true;
            }
            }
        }
    }
}
// we will iterate till j-i because after every iteration the maximum element will be at last index: