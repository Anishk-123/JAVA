package Pratice;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a value ");
        Long n=sc1.nextLong();
        long sum=0;
        while(n!=0){
            long digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println(sum);
    }
}
