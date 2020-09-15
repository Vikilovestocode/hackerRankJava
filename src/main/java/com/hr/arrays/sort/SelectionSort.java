package com.hr.arrays.sort;

import java.util.Arrays;

public class SelectionSort {

    /*
    repeat (numOfElements - 1) times

   set the first unsorted element as the minimum

   for each of the unsorted elements

    if element < currentMinimum

      set element as new minimum

  swap minimum with first unsorted position
   */
    public static int[] selectionSort(int arr[]){

        for(int i = 0; i< arr.length; i++){
            int min = arr[i];
            int newMin = min;
            int newMinIdx = -1;
            for(int j =i+1; j<arr.length; j++){
                if(newMin > arr[j]){
                    newMin = arr[j];
                    newMinIdx = j;
                }
            }
            if(newMinIdx > 0){
                int temp = arr[newMinIdx];
                arr[newMinIdx] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{4, 3, 1, 2})));
    }
}
