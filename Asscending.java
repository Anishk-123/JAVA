package Pratice;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Asscending {
    public static void main(String[] args) {
        int []arr1={2,4,6};
        int []arr2={3,5,7};
         int arr[]=new int[6];
         int j=0;
         int k=0;
        for (int i=0;i<6;i++){
            if(i<3){
                arr[i]=arr1[j];
                j++;
            }
            else{
                arr[i]=arr2[k];
                k++;
            }

        }Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        }
    }

