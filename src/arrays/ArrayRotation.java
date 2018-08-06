package arrays;

import java.util.Arrays;

public class ArrayRotation {

    public static void main(String... args) {
        int ar[] = {1,2,3,4,5};
        printArray(ar);
        new ArrayRotation().rotateArray(ar,6);
        printArray(ar);

    }


    /**
     * Rotates the array towards left k times
     * time complexity O(k*n)
     * @param ar
     * @param k
     */
    public void rotateArray(int ar[],int k) {
        int len = ar.length;
        if(len == 0)
            return;
        k = k % len;
        int temp;
        while(k > 0) {
            temp = ar[0];
            for(int i=0;i<len-1;i++) {
                ar[i] = ar[i+1];
            }
            ar[len-1] = temp;
            k--;
        }
    }

    public static void printArray(int ar[]) {
        for(int i=0;i<ar.length;i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

}
