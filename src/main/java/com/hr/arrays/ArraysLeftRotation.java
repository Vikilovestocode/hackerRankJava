package com.hr.arrays;

public class ArraysLeftRotation {

    public static int gcd(int a, int b){
        int c = Math.max(a, b);
        int d = Math.min(a, b);
        int r = c % d;
        if(r == 0){
            return  d;
        }

        return  gcd(d, r);
    }


    public static int[] leftRotate(int [] arr, int rotate){
        int gcd = gcd(arr.length, rotate);
        for(int i =0; i< gcd; i++){
            int temp = arr[i];
            int j = i;
            while (true){
              int k = j + rotate;
              if(k>= arr.length){
                  k = k - arr.length;
              }
              if(k == i){
                  break;
              }
              arr[j] = arr[k];
              j = k;
            }
            arr[j] = temp;
        }
        return  arr;
    }

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

        int total_birbes =0;
        final int MAX_BRIBE =2;
        boolean chaos = false;
        for(int i=0; i< q.length; i++){
            int actual = i +1;
            int current = q[i];
            int bribe = current - actual;
            if(bribe > MAX_BRIBE ){
                chaos = true;
                break;
            }

            for(int j =Math.max(0, current-2); j<i; j++ ){
                    if(q[j]> q[i])
                        total_birbes++;
            }
        }

        if(chaos)
            System.out.println("Too chaotic");
        else
            System.out.println(total_birbes);
    }


    public static void main(String[] args) {
        int[] ip = new int[]{1,2,3,4,5,6};
//        System.out.println(Arrays.toString(leftRotate( ip,2)));
        minimumBribes(new int[]{1, 2, 5, 3, 7, 8, 6, 4});
    }

}
