package arrays;

import java.util.Arrays;

/**
 * implemented program to sort an array of 0's,1's and 2's in ascending order.
 * @author lovelesh
 */
public class SortArray012 {

    public static void main(String...args) {
        int arr[] = {2,1,0,2,0,0,1,1,1,2,0,0};
//        new SortArray012().sort012(arr);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public void sort012(int arr[]) {
        int size = arr.length;



    }
}
