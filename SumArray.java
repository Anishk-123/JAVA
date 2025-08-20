package Pratice;

import java.util.Arrays;


public class SumArray {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5, 5, 10};
        int a2[] = new int[a1.length];
        int a3[] = new int[a1.length];
        int sum = 0;
        int i, j, k;
        j = 0;
        k = 0;
        for (i = 0; i < a1.length; i++) {
            sum = sum + a1[i];
        }
        int sum2 = sum / 2;
        int fsum = 0;
        for (i = 0; i < a1.length; i++) {
            if (fsum < sum2) {
                a2[j] = a1[i];
                fsum = fsum + a1[i];
                j++;
            } else {
                a3[k] = a1[i];
                k++;
                fsum = fsum + a1[i];
            }

        }
        System.out.println(Arrays.toString(a3) + "  " + Arrays.toString(a2));

    }

}




