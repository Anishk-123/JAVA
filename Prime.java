package Pratice;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter a value");
Scanner sc1=new Scanner(System.in);
int input=sc1.nextInt();

                   for(int i=2;i<input;i++){
                       int count=0;
                       for(int j=1;j<=i;j++){
                            if(i%j==0){
                                count++;
                            }
                       }
                       if (count==2){
                           System.out.print(i+",");
                       }

                   }
    }
}
