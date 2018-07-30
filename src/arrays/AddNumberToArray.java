package arrays;

import java.util.Arrays;

public class AddNumberToArray {

    public static void main(String...args) {

        int ar[] = {0,9,9};
        int ar1[] = new AddNumberToArray().plusOne(ar);

        for(int i=0;i<ar1.length;i++) {
            System.out.print(ar1[i]+" ");
        }

    }

    public int[] plusOne(int[] A) {
        int len = A.length;
        int flag = 0;
        int ar[] = new int[len];
        if(A[len-1] < 9) {
            A[len-1]++;
            flag=1;
            return A;
        } else {
            int carry = 1;
            for(int i = len-1;i >= 0;i--) {

                if(A[i] == 9) {
                    A[i] = 0;
                    carry = 1;
                } else {
                    A[i] += carry;
                    carry = 0;
                }

                if(i == 0 && carry == 1) {
                    ar = new int[len+1];
                    ar[0] = 1;
                    for(int j = 0;j<len;j++) {
                        ar[j+1] = A[j];
                    }
                }
            }
            flag=2;
            return ar;
        }

//        int[] array = null;
//        if(flag == 1) {
//            if(A[0] == 0) {
//                int A1[] = new int[A.length-1];
//                for (int i = 0; i < A.length-1; i++) {
//
//                    A1[i] = A[i+1];
//                }
//                array = A1;
//            }
//        } else {
//            if(ar[0] == 0) {
//                int A1[] = new int[A.length-1];
//                for (int i = 0; i < ar.length-1; i++) {
//
//                    A1[i] = ar[i+1];
//                }
//                array = A1;
//            }
//        }
//        return array;
    }

}
