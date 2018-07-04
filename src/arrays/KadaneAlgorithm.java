package arrays;

/**
 * Kadane's Algorithm for finding largest sum contiguous sub array
 */

public class KadaneAlgorithm {

    public static void main(String...args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(new KadaneAlgorithm().kadaneAlgorithm(arr));
    }


    public int kadaneAlgorithm(int arr[]) {
        int size = arr.length;
        if(size == 0)
            return 0;
        int currMax = arr[0];
        int globalMax = arr[0];
        for (int i = 1; i < size; i++) {
            currMax += arr[i];
            if(currMax > globalMax)
                globalMax = currMax;
            if(currMax < 0)
                currMax = 0;

        }
        return globalMax;
    }


}
