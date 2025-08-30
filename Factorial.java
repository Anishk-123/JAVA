package Pratice;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Enter a value");
        Scanner sc1=new Scanner(System.in);
        int n=sc1.nextInt();
        if(n<0){
            System.out.println("factorial of negative number is not possibe");
        }
        if(n == 1 || n == 0){
            System.out.println("Factorial of value = 1");
        }
        else{
            int fact=1;
            for(int i=2;i<=n;i++){
                fact=fact*i;

            }
            System.out.println(fact);
        }

    }
}
