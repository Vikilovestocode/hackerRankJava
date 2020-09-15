package com.hr.arrays.sort;

import java.util.Arrays;

public class BubbleSort {

    static  int[] bubbleSort(int [] arr){
        for (int i=0; i<arr.length; i++){
            for(int j =0; j<arr.length-i-1;  j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{4, 3, 1, 2})));
    }

}
