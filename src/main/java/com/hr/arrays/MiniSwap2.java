package com.hr.arrays;

public class MiniSwap2 {
    static int minimumSwaps(int[] arr) {
        //[7, 1, 3, 2, 4, 5, 6]
        int swaps = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] != i+1){
                for(int j=i+1; j<arr.length ; j++){
                    if(arr[j] == i+1){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        swaps++;
                        break;
                    }
                }
            }
        }
        return  swaps;
    }

    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{4, 3, 1, 2}));
    }

}
